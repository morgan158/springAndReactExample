package com.example.spingandreacteample.entity;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;

    public User(){}
    
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public User setName(String name){
        this.name=name;
        return this;
    }
    public User setEmail(String email){
        this.email=email;
        return this;
    }
    public User setPassword(String password){
        this.password=password;
        return this;
    }
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email=" + email +
                ", password=" + password +
                '}';
    }
}
