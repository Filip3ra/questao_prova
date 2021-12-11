/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.web.prova;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Filip
 */
@Named
//@Entity
//@SessionScoped
@RequestScoped
public class Frutas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String nome;
    
    private Boolean infectada;
    
    private LocalDate data;

    public Frutas(Long id, String nome, Boolean infectada, LocalDate data) {
        this.id = id;
        this.nome = nome;
        this.infectada = infectada;
        this.data = data;
    }

    
    
    Frutas(String nome, Boolean infectada, LocalDate data) {
        this.nome = nome;
        this.infectada = infectada;
        this.data = data;
    }



    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getInfectada() {
        return infectada;
    }

    public void setInfectada(Boolean infectada) {
        this.infectada = infectada;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Frutas)) {
            return false;
        }
        Frutas other = (Frutas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.web.prova.Frutas[ id=" + id + " ]";
    }
    
}
