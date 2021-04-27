/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implaaaa;

import javaprojet.Professeur;
/**
 *
 * @author ABIBOU GUEYE
 */

 public interface IProfesseur {
     public void addProfesseur(Professeur professeur);
  public void updateProfesseur(Professeur professeur);
  public void deleteProfesseur(Professeur professeur);
  public Professeur getProfesseurById(int etu);
  public Professeur getAllProfesseur();
}
   

