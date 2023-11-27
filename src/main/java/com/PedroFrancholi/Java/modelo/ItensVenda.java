package com.PedroFrancholi.Java.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.security.SecureRandomParameters;

@Entity
@Table(name = "ItensVenda")
public class ItensVenda implements Serializable {

    @EmbeddedId
    private ItensVendaPk pk;

    @Column(name = "QUANTIDADE")
    private BigDecimal QUANTIDADE;
    @Column(name = "VALOR")
    private BigDecimal VALOR;

    public ItensVenda() {
    }

    public ItensVendaPk getPk() {
        return pk;
    }

    public void setPk(ItensVendaPk pk) {
        this.pk = pk;
    }

    public BigDecimal getQUANTIDADE() {
        return QUANTIDADE;
    }

    public void setQUANTIDADE(BigDecimal QUANTIDADE) {
        this.QUANTIDADE = QUANTIDADE;
    }

    public BigDecimal getVALOR() {
        return VALOR;
    }

    public void setVALOR(BigDecimal VALOR) {
        this.VALOR = VALOR;
    }
}
