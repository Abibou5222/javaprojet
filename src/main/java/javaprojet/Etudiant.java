/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojet;

/**
 *
 * @author ABIBOU GUEYE
 */

    public class Etudiant extends Personne{
   
   private String groupeSanguin;
  
public Etudiant() {
		super();
	}

public Etudiant(int id,String matricule,String genre,String nom,String prenom,String adresse,
  String dateDeNaissance,String lieuDeNaissance,String nationalite,String situationMatri,String tel,
  String email,String groupeSanguin) 
  {
	  super(id,matricule,genre,nom,prenom,adresse,dateDeNaissance,lieuDeNaissance,nationalite,situationMatri,
			  tel,email);
	  this.groupeSanguin=groupeSanguin;
  }
public String getGroupeSanguin() {
	return groupeSanguin;
}

public void setGroupeSanguin(String groupeSanguin) {
	this.groupeSanguin = groupeSanguin;
}

@Override
public String toString() {
	return super.toString()+" groupeSanguin=" + groupeSanguin;
}
    }

