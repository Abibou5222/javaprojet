/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implaaaa;

import javaprojet.Groupe;


/**
 *
 * @author ABIBOU GUEYE
 */
public interface IGroupe {
  
   public void addGroupe(Groupe groupe);
  public void updateGroupe(Groupe groupe);
  public void removeGroupe(Groupe groupe);
  public  Groupe getGroupeById(int etu);
  public Groupe getAllGroupe();
 
 
}
