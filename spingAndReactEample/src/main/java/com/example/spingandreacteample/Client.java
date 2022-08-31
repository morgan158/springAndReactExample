/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spingandreacteample;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author 333
 */
@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;

    public Client(){}
    
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public Client setName(String name){
        this.name=name;
        return this;
    }
    public Client setEmail(String email){
        this.email=email;
        return this;
    }
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email=" + email +
                '}';
    }
}
