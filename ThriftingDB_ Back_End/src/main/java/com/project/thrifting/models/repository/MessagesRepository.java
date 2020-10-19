/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.thrifting.models.repository;

import com.project.thrifting.models.Messages;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alkis
 */
@Repository
public interface MessagesRepository extends JpaRepository<Messages, Integer>{
    
     public Optional<List<Messages>> findByUserreceiveid(int  userreceiveid);
    
}
