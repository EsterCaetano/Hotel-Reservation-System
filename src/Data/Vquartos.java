 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author ester
 */
public class Vquartos {
    //Variaveis
    private int idquartos;
    private String numero;
    private String andar;
    private String descricao;
    private String caracteristicas;
    private Double valor_diaria;
    private String estado;
    private String tipo_quarto;

    
  //Construtor
    public Vquartos(int idquartos, String numero, String andar, String descricao, String caracteristicas, Double valor_diaria, String estado, String tipo_quarto) {
        this.idquartos = idquartos;
        this.numero = numero;
        this.andar = andar;
        this.descricao = descricao;
        this.caracteristicas = caracteristicas;
        this.valor_diaria = valor_diaria;
        this.estado = estado;
        this.tipo_quarto = tipo_quarto;
    }

    public Vquartos() {
    }
    
//Metodos
    public int getIdquartos() {
        return idquartos;
    }

    public void setIdquartos(int idquartos) {
        this.idquartos = idquartos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Double getValordiaria() {
        return valor_diaria;
    }

    public void setValordiaria(Double valor_diaria) {
        this.valor_diaria = valor_diaria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoquarto() {
        return tipo_quarto;
    }

    public void setTipoquarto(String tipo_quarto) {
        this.tipo_quarto = tipo_quarto;
    }

   
   
}