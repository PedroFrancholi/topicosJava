package com.PedroFrancholi.Java.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.io.Serializable;

@Embeddable
public class ItensVendaPk implements Serializable {

    @ManyToOne()
    @JoinColumn(name = "ID_VENDA")
    @Cascade(CascadeType.ALL)
    @JsonIgnoreProperties(value = {"itensVendas"})
    private Venda venda;

    @ManyToOne()

    @JoinColumn(name = "CODIGO")
    @Cascade(CascadeType.ALL)
    @JsonIgnoreProperties(value = {"itensVendas"})
    private Produto produto;

    public ItensVendaPk() {
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
