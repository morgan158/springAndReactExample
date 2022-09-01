/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spingandreacteample.repository;

import com.example.spingandreacteample.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author 333
 */
@EnableJpaRepositories
public interface ClientRepository extends JpaRepository<Client, Long> {
}
