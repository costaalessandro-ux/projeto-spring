/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetospring.model;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author costa
 */
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
    
}