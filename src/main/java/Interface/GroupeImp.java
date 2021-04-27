/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javaprojet.Groupe;
import Implaaaa.IGroupe;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author ABIBOU GUEYE
 */

   public class GroupeImp implements IGroupe{
    List<Groupe> groupee= new java.util.ArrayList<Groupe>();

    @Override
    public void addGroupe(Groupe groupe) {
       groupee.add(groupe);
    }

    @Override
    public void updateGroupe(Groupe groupe) {
  for(Groupe groupe2: groupee){
      if(groupe2.getId()==groupe.getId()){
          groupe2.setNomGroup(groupe.getNomGroup());
          groupe2.setDateCrea(groupe.getDateCrea());
          groupe2.setModuleGroup(groupe.getModuleGroup());
          
      }
  }
    }

    public void deleteGroupe(Groupe groupe) {
        groupee.remove(groupe);
    }

    @Override
    public Groupe getGroupeById(int etu) {
       for(Groupe groupe:groupee){
              
              if(groupe.getId()==etu){
                  return groupe;
              }
}
          return null;
               }

    @Override
    public Groupe getAllGroupe() {
        return(Groupe) groupee;
    }
    
}
 

