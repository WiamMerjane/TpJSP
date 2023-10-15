/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entites;

import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Cloud
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {
    
    @Id
    @GeneratedValue
    protected int id;
    @Column(unique = true)
    protected String email;
    protected String password;
    protected int etat;
    protected String code;

    public User() {
        
    }
    
     public User(String email, String password, int etat, String code) {
        this.email = email;
        this.password = password;
        this.etat = etat;
        this.code = code;
    }


    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getEtat() {
        return etat;
    }

    public String getCode() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
}
