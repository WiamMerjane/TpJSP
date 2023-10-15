/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entites;

import javax.persistence.Entity;

/**
 *
 * @author Cloud
 */

@Entity
public class Employer extends User {

    public Employer() {
    }  

    public Employer(String email, String password, int etat, String code) {
        super(email, password, etat, code);
    }
    
 
}
