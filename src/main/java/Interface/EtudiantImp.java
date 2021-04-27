/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javaprojet.Etudiant;
import Implaaaa.IEtudiant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ABIBOU GUEYE
 */

    public class EtudiantImp implements IEtudiant {

    public static void removeEtudiant(Etudiant etudiant4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Etudiant getEtudiantByid(int Idf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    List<Etudiant> etudiants = new ArrayList<Etudiant>();

    @Override
    public void addEtudiant(Etudiant etudiant){
      etudiants.add(etudiant);
        }    
    @Override
    public void updateEtudiant(Etudiant etudiant){
    for(Etudiant etudiant2: etudiants){
     if ( etudiant2.getId()==etudiant.getId()){
      etudiant2.setMatricule(etudiant.getMatricule());
      etudiant2.setGenre(etudiant.getGenre());
      etudiant2.setNom(etudiant.getNom());
      etudiant2.setPrenom(etudiant.getPrenom());
      etudiant2.setAdresse(etudiant.getAdresse());
      etudiant2.setDateDeNaissance(etudiant.getDateDeNaissance());
      etudiant2.setLieuDeNaissance(etudiant.getLieuDeNaissance());
      etudiant2.setNationalite(etudiant.getNationalite());
      etudiant2.setSituationMatri(etudiant.getSituationMatri());
      etudiant2.setGroupeSanguin(etudiant.getGroupeSanguin());
      
      }
      
     }
   }
    @Override
    public void deleteEtudiant(Etudiant etudiant){
    etudiants.remove(etudiant);
}
    @Override
    public Etudiant getEtudiantById(int etu){
          for(Etudiant etudiant:etudiants){
              
              if(etudiant.getId()==etu){
                  return etudiant;
              }
}
          return null;
}
    @Override
    public Etudiant getAllEtudiant(){
    return (Etudiant) etudiants;
    }
    
}



