/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prositlist;

/**
 *
 * @author User
 */
public class Etudiant {
    int id ;
    String nom;
    String prenom;
    
    public Etudiant(){}
    public Etudiant (int id, String nom, String prenom) {
        this.id=id;
        this.nom=nom;
        this.prenom =prenom;
    }
   
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    @Override
    public boolean equals (Object o){
        return this == o;
    }
    @Override
   public String toString() {
        return "Etudiant est id = " + this.id + "\n nom " + this.nom + "\nprenom" + this.prenom;
    }
    
    
        
        
    
}
