/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.web.prova;

import javax.ejb.Local;

/**
 *
 * @author Filip
 */
@Local
public interface FrutaBeanLocal {
    
    void salvar(Frutas fruta);
    
    void atualizar(Frutas fruta);
    
    Frutas buscar(Long id);
    
    void deletar(Frutas fruta);
    
    
}
