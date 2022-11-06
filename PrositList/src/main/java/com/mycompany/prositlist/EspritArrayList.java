/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prositlist;

import static java.lang.reflect.Array.get;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class EspritArrayList {
  List<Etudiant> etudiantList = new ArrayList<Etudiant>();
    public void ajouterEtudiant (Etudiant e){
        etudiantList.add(e);
    }
    public boolean rechercherEtudiant(Etudiant e){
      return etudiantList.contains (e);
    
}
      public boolean rechercherEtudiant(String Nom){
      return etudiantList.contains (getNom()==Nom);
    
      }
    
	public void supprimerEtudiant(Etudiant e) {
	   etudiantList.remove(e);
	}

	public void displayEtudiants() {
		Enumeration<Etudiant> e = etudiantList.elements();
		while(e.hasMoreElements()) {
			Etudiant et = e.nextElement();
			System.out.println("Nom: " + et.getNom() + "     Prénom: " + et.getPrenom());
		}
	}
        public void trierEtudiantsParId()
               Comparator<Etudiant>{
        //Redéfinir la méthode compare() selon le name

@Override

public int compare( e, Student e2) {

return s1.getId().compareTo(e2.getId());
            
            
        }
        
	
}
