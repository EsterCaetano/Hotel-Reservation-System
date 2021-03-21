 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.vquartos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ester
 */
public class fquartos {
    private conexao mysql=new conexao();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public Integer totalregistros;
    
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
    String[] titulos = {"ID", "Number", "Walk", "Descrition", "Characteristics", "Price", "State", "Type of room"};
    String[] registro = new String[8];
    totalregistros = 0;
    
    modelo = new DefaultTableModel(null, titulos);
    sSQL = "select * from tb_rooms where walk like '%" + buscar + "%' order by id_quartos";
    
    try{
        Statement st = cn.createStatement();
        ResultSet rs=st.executeQuery(sSQL);
        while(rs.next()){
           registro [0]=rs.getString("id_quartos");
               registro [1]=rs.getString("number");
               registro [2]=rs.getString("walk");
               registro [3]=rs.getString("descrition");
               registro [4]=rs.getString("characteristics");
               registro [5]=rs.getString("price_day");
               registro [6]=rs.getString("state");
               registro [7]=rs.getString("room_type"); 
               
               totalregistros = totalregistros +1;
               modelo.addRow(registro);
        }
        return modelo;
    }catch (Exception e){
        JOptionPane.showConfirmDialog(null, e);
        return null;
    }
    }
    
    //Metodo para inserir dados no BD
    public boolean inserir (vquartos dts){
        //estes nomes tem de ser igual ao de Base de dados
        sSQL = "insert into tb_quartos (numero, andar, descricao, caracteristicas, preco_diaria, estado, tipo_quarto)" +
                "values(?,?,?,?,?,?,?)";
        
        try {
            
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getAndar());
            pst.setString(3, dts.getDescricao());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getValordiaria());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipoquarto());
            
            int n=pst.executeUpdate();
            if (n!=0){
                return true;
            }else{
                return false;
            }
            
        }catch (Exception e){
             JOptionPane.showConfirmDialog(null, e);
             return false;
        }
    }
    
    
    //Metodo para editar dados no BD
    public boolean editar (vquartos dts){
        
        sSQL="update tb_quartos set numero=?, andar=?, descricao=?, caracteristicas=?, valor_diaria=?, estado=?, tipo_quarto=?" +
                "where id_quartos=?";
        
               
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getAndar());
            pst.setString(3, dts.getDescricao());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getValordiaria());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipoquarto());
            pst.setInt(8, dts.getIdquartos());
            
             int n=pst.executeUpdate();
            if (n!=0){
                return true;
            }else{
                return false;
            }
            
        }catch (Exception e){
             JOptionPane.showConfirmDialog(null, e);
         return false;
        }
    }
    
    public boolean deletar (vquartos dts){
        sSQL="delete from tb_quartos where id_quartos=?";
        
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdquartos());
            int n=pst.executeUpdate();
            if (n!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
            
        }
    }
}

