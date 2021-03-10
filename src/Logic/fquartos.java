/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.sql.Connection;
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
}
