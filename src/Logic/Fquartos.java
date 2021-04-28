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
public class Fquartos {
    private final Conexao mysql=new Conexao();
    private final Connection cn=mysql.conectar();
    private String sSQL="";
    public Integer totalregistros;
    
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
    String[] titulos = {"ID", "Number", "Walk", "Descrition", "characteristics", "Price_day", "State", "Room Type"};
    String[] registro = new String[8];
    totalregistros = 0;
    
    modelo = new DefaultTableModel(null, titulos);
    sSQL = "select * from tb_quartos where andar like '%" + buscar + "%' order by id_quartos";
    
    try{
        Statement st = cn.createStatement();
        ResultSet rs=st.executeQuery(sSQL);
        while(rs.next()){
           registro [0]=rs.getString("id_quartos");
               registro [1]=rs.getString("numero");
               registro [2]=rs.getString("andar");
               registro [3]=rs.getString("descricao");
               registro [4]=rs.getString("caracteristicas");
               registro [5]=rs.getString("preco_diaria");
               registro [6]=rs.getString("estado");
               registro [7]=rs.getString("tipo_quarto"); 
               
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
        
        sSQL="update tb_quartos set numero=?, andar=?, descricao=?, caracteristicas=?, preco_diaria=?, estado=?, tipo_quarto=?" +
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

