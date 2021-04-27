/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implaaaa;

import javaprojet.Etudiant;

/**
 *
 * @author ABIBOU GUEYE
 */
public interface IEtudiant {
   
  public void addEtudiant(Etudiant etudiant);
  public void updateEtudiant(Etudiant etudiant);
  public void deleteEtudiant(Etudiant etudiant);
  public Etudiant  getEtudiantById(int etu);
  public Etudiant  getAllEtudiant();
}

