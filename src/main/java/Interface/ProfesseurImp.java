/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Implaaaa.IProfesseur;
import javaprojet.Professeur;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ABIBOU GUEYE
 */

    public class ProfesseurImp implements IProfesseur  {

    public static Professeur getProfeseurById(int idmod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    List<Professeur> professeurs = new ArrayList<Professeur>();
    
    
    @Override
    public void addProfesseur(Professeur professeur){
      professeurs.add(professeur);
        }    
    @Override
    public void updateProfesseur(Professeur professeur){
    for(Professeur professeur2: professeurs){
     if ( professeur2.getId()==professeur.getId()){
      professeur2.setMatricule(professeur.getMatricule());
      professeur2.setGenre(professeur.getGenre());
      professeur2.setNom(professeur.getNom());
      professeur2.setPrenom(professeur.getPrenom());
      professeur2.setAdresse(professeur.getAdresse());
      professeur2.setDateDeNaissance(professeur.getDateDeNaissance());
      professeur2.setLieuDeNaissance(professeur.getLieuDeNaissance());
      professeur2.setNationalite(professeur.getNationalite());
      professeur2.setSituationMatri(professeur.getSituationMatri());
      professeur2.setSpeciality(professeur.getSpeciality());
      
      }
      
     }
   }
    @Override
    public void deleteProfesseur(Professeur professeur){
    professeurs.remove(professeur);
}
    @Override
    public Professeur getProfesseurById(int etu){
          for(Professeur professeur:professeurs){
              if(professeur.getId()==etu){
                  return professeur;
              }
}
          return null;
}
    @Override
    public Professeur getAllProfesseur(){
    return (Professeur) professeurs;
}
}




