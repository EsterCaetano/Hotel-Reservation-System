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
public class Vprodutos {
    private int idproduto;
    private String nome;
    private String descricao;
    private String unidade_medida;
    private Double valor_produto;  

    //contrutor vazio
    public Vprodutos() {
    }
    //construto com informações 
    public Vprodutos(int idproduto, String nome, String descricao, String unidade_medida, Double valor_produto) {
        this.idproduto = idproduto;
        this.nome = nome;
        this.descricao = descricao;
        this.unidade_medida = unidade_medida;
        this.valor_produto = valor_produto;
    }
//Metodos get e set
    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade_medida() {
        return unidade_medida;
    }

    public void setUnidade_medida(String unidade_media) {
        this.unidade_medida = unidade_media;
    }

    public Double getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(Double valor_produto) {
        this.valor_produto = valor_produto;
    }
    
    
}
