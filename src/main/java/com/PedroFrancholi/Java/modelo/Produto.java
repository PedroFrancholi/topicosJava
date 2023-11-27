package com.PedroFrancholi.Java.modelo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "Produto")
public class Produto implements Serializable {
    @Id
    @Column(name = "CODIGO")
    private Integer codigo;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "TIPO")
    private char tipo;

    @Column(name = "UNIDADE")
    private String unidade;

    @Column(name = "QUANTIDADE")
    private BigDecimal quantidade;

    @Column(name = "VALOR")
    private BigDecimal valor;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODIGO_CLASSIFICACAO")
    private Classificacao classificacao;

    public Produto() {
    }

    public Integer getCodigo() {

        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }
}
