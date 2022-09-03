
package com.example.spingandreacteample.repository;

import com.example.spingandreacteample.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
public interface ClientRepository extends JpaRepository<Client, Long> {
}
