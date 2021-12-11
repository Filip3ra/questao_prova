/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.web.prova;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Filip
 */
//@Stateless
@Named
@SessionScoped
public class FrutaBean implements FrutaBeanLocal, Serializable {

    @PersistenceContext
    EntityManager entityManager;
    
    @Override
    public void salvar(Frutas fruta) {
        entityManager.persist(fruta);
    }

    @Override
    public void atualizar(Frutas fruta) {
        entityManager.merge(fruta);
    }

    @Override
    public Frutas buscar(Long id) {
        Frutas fruta = entityManager.find(Frutas.class, id);
        return fruta;
    }

    @Override
    public void deletar(Frutas fruta) {
        entityManager.remove(entityManager.contains(fruta) ? fruta : entityManager.merge(fruta));
        
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
