/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ester
 */
public class conexao {
    //variaveis q vai conetar BD
    public String db="bancoreserva";
    public String url="jdbc:mysql://127.0.0.1/" +db;    //Localização de DB,jdbc carrega informação de BD 
    public String user="root";
    public String pass="";


public conexao() {

}

public Connection conectar(){
Connection link=null;
try {
Class.forName("org.gjt.mm.mysql.Driver"); // nome da classe de conexão
link=DriverManager.getConnection(this.url, this.user, this.pass);   //variavel link  recebe 3 parametros
}
catch (ClassNotFoundException | SQLException e){
JOptionPane.showConfirmDialog(null, e); //mostra janela q exite erro
}
return link;
}
    
}
