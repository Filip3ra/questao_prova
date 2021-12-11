/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.web.prova;

import java.io.Serializable;
import java.time.LocalDate;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Filip
 */
@Named
@RequestScoped
public class FrutaTeste implements Serializable{
    
    private String nome;
    
    private Boolean infectada;
    
    private LocalDate data;

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
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
