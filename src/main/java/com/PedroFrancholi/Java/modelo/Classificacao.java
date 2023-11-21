package com.PedroFrancholi.Java.modelo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Classificacao")
public class Classificacao implements Serializable {

    @Id
    @Column(name = "CODIGO")
    private String codigo;

    @Column(name = "DESCRICAO")
    private String descricao;

<<<<<<< HEAD
=======
    @OneToMany(mappedBy = "classificacao")
    private List<Produto> produtos;

>>>>>>> c8f8bed (Commit 21/11/2023_TDE2011)
    public Classificacao() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
<<<<<<< HEAD
=======

>>>>>>> c8f8bed (Commit 21/11/2023_TDE2011)
}
