/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojet;
import Interface.GroupeImp;
import Interface.EtudiantImp;
import Interface.ProfesseurImp;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ABIBOU GUEYE
 */
public class testMenu {
   
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cla=new Scanner (System.in);
                Scanner cla1=new Scanner (System.in);
                Scanner cla2=new Scanner (System.in);
                Scanner cla3=new Scanner (System.in);
                Scanner cla4=new Scanner (System.in);
		 int choix =0;
                 int choix1=0;
                 int choix2=0;
                 int choix3=0;
                 
		
		 System.out.println("---------------------------");
		 System.out.println("|  ***   WELCOME            |");
		 System.out.println("|     TO THE MENU        |"); 
		 System.out.println("---------------------------");
		 System.out.println(" 1.     Gestion Groupe        :"); 
		 System.out.println("| 2.    Gestion Etudiant      :");
		 System.out.println("| 3.    Gestion Professeurs   :");
		 System.out.println("| 4.    Gestion Groupe-Professeurs     :");
		 System.out.println("| 5.    Quitter------                    |");
		 System.out.println("-----------------------");
		 System.out.println(" Entrer Votre choix :");
		 
	        choix=cla.nextInt();

    switch(choix){
	         case 1:
	            System.out.println(" Vous avez choisi GEStion GROUPE");
                     System.out.println(" | 1.    Cree un Groupe             :"); 
		 System.out.println("| 2.   Modifier un Groupe            :");
		 System.out.println("| 3.   Voir les details d'un Groupe   :");
                 System.out.println("| 4.   Afficher tout les Groupe     :");
                 System.out.println("| 5.   Supprimer un Groupe      :");
                 System.out.println("| 6.       Quitter                    :");
                 System.out.println("|        Entrez votre  choix            :");
                 
                 choix1=cla2.nextInt();
                 cla.nextLine();
	        
                switch(choix1){
                    case 1:
                        System.out.println(" | 1.     Creer un Groupe :");
                          System.out.println("Id du groupe: ");
                           int id = cla1.nextInt();
                          System.out.println("Nom du groupe: ");
                          String nomGroup=cla1.nextLine();
                          System.out.println("Date du groupe: ");
                          String dateCrea=cla1.nextLine();
                          System.out.println(" module du groupe: ");
                          String moduleGroup=cla1.nextLine();
                          Groupe groupe = new Groupe(id, nomGroup,dateCrea,moduleGroup);
                          GroupeImp.addGroupe(groupe);
                          System.out.println(" Creation du groupe!!!!!!!!!!!!!!!!!");
                break;
                    case 2 :
                
		 System.out.println("| 2.   Modifier un Groupe:");
                 System.out.println("id: ");
                           int idmod=cla1.nextInt();
                           Groupe groupe2 = GroupeImp.getGroupeByid(idmod);
                           
                           GroupeImp.updateGroupe(groupe2);
                           System.out.println("ENtrez le Nom du groupe");
                           String nomGroupe= cla1.nextLine();
                           groupe2.setNomGroup(nomGroupe);
                           System.out.println("Entrez le module du formation");
                           String moduleGroupe=cla.nextLine();
                           groupe2.setModuleGroup(moduleGroupe);
                           
                           
                 break;
                    case 3: 
		 System.out.println("| 3.   Voir les details d'un Groupe");
                 System.out.println("Id");
                             int IdE=cla.nextInt();
                             Groupe groupe6=GroupeImp.getGroupeById(IdE);
                             System.out.println(groupe6.getNomGroup());
                             System.out.println(groupe6.getDateCrea());
                             System.out.println(groupe6.getModuleGroup());
                 break;
                    case 4 :
                 System.out.println("| 4.   Afficher tout les groupes");
                  List <Groupe> groupe55=(List<Groupe>) GroupImp.getAllGroupe();
                              for(Groupe groupe5:groupe55){
                                   System.out.println(groupe5.getNomGroup());
                              }
                 break;
                    case 5:
                 System.out.println("| 5.   Supprimer un Groupe :");
                 int Id=cla.nextInt();
                           Groupe groupe4 = GroupeImp.getGroupeByid(Id);
                           GroupeImp.removeEtudiant(Groupe4);
                            System.out.println("Supprimession du vk succes: ");
                 break;
                         case 6:
                             System.out.println("Menu Principal");
                    boolean var5 = false;
                    boolean va6 = true;
                             
                         break;


                         default:
                             System.out.println("erreur");
                 
                 
                }
                
	         case 2:
	             System.out.println("Vous avez choisi GEStion Etudiant");
                     
                System.out.println(" | 1.    Ajouter un etudiant             :"); 
		 System.out.println("| 2.   Modifier un etudiant             :");
		 System.out.println("| 3.   Voir les details d'un etudiant   :");
                 System.out.println("| 4.   Afficher tous les etudiant     :");
                 System.out.println("| 5.   Supprimer un etudiant           :");
                 System.out.println("| 6.       Quitter                    :");
                 System.out.println(" Entrer Votre choix :");
                 choix2=cla2.nextInt();
                 cla.nextLine();
                 switch(choix2){
                     case 1:
                         System.out.println(" veullez mettre les données");
                         
                         System.out.println("Id etudiant: ");
                         int id = cla2.nextInt();
                         System.out.println("Matricule etudiant: ");
                         String matricule = cla.nextLine();
                         System.out.println("Genre de l'etudiant: ");
                         String genre = cla2.nextLine();
                         System.out.println("Nom etudiant: ");
                         String nom = cla.nextLine(); 
                         System.out.println("prenom etudiant: ");
                         String prenom = cla2.nextLine();
                         System.out.println("adresse etudiant: ");
                         String adresse = cla2.nextLine();
                         System.out.println("dateDeNaissance etudiant: ");
                         String dateDeNaissance = cla2.nextLine();
                          System.out.println("lieuDeNaissance etudiant: ");
                         String lieuDeNaissance = cla2.nextLine();
                         System.out.println("nationalite etudiant: ");
                         String nationalite = cla2.nextLine();
                         System.out.println("situationMatri etudiant: ");
                         String situationMatri = cla2.nextLine();
                         System.out.println("Telephone etudiant: ");
                         String tel = cla2.nextLine();
                         System.out.println("mail etudiant: ");
              
                         String email = cla2.nextLine();
                         System.out.println("groupeSanguin etudiant: ");
                         String groupeSanguin = cla2.nextLine();
                         Etudiant etudiant= new Etudiant(id, matricule,genre,nom,prenom,adresse,dateDeNaissance,lieuDeNaissance,nationalite,situationMatri,tel,email,groupeSanguin);
                         EtudiantImp.addEtudiant(etudiant);
                         System.out.println(" Avec succes");
                         
                          break;
                         
                        case 2:
                             System.out.println("Modifier un etudiant");
                           System.out.println("id: ");
                           int modi=cla2.nextInt();
                           Etudiant etudiant2= EtudiantImp.getEtudiantByid(modi);
                           
                           EtudiantImp.updateEtudiant( etudiant2);
                           
                           System.out.println("Le matricule: ");
                           String matriculE =cla2.next();
                           etudiant2.setMatricule(matriculE);
                           System.out.println(" Genre ");
                           String genreE=cla2.next();
                           etudiant2.setGenre(genreE);
                           System.out.println("Le Nom: ");
                           String nomEtu=cla2.next();
                           etudiant2.setNom(nomEtu);
                           System.out.println("Le Prenom: ");
                           String prenomEtu=cla2.next();
                           etudiant2.setPrenom(prenomEtu);
                           System.out.println("Adresse: ");
                           String adresseetu=cla2.next();
                           etudiant2.setAdresse(adresseetu);
                           System.out.println(" Date de naissance ");
                           String dateNaissance=cla2.next();
                           etudiant2.setDateDeNaissance(dateNaissance);
                            System.out.println(" Lieu de naissance ");
                           String lieuNaissance=cla2.next();
                           etudiant2.setLieuDeNaissance(lieuNaissance);
                           System.out.println("Nationalité: ");
                           String nationalité=cla2.next();
                           etudiant2.setNationalite(nationalité);
                           System.out.println("situationMatri: ");
                           String situationMatriE=cla2.next();
                           etudiant2.setSituationMatri(situationMatriE);
                           System.out.println("Telephone: ");
                           String telE=cla2.next();
                           etudiant2.setTel(telE);
                           System.out.println("vLe mail: ");
                           String mailE=cla2.next();
                           etudiant2.setEmail(mailE);
                           System.out.println("le groupe sanguin: ");
                           String groupeSanguinE=cla2.next();
                           etudiant2.setGroupeSanguin(groupeSanguinE);
                           
                           
                         break;
                         case 3:
                             System.out.println("voir les details");
                             System.out.println("Id");
                             int IdE=cla.nextInt();
                             Etudiant etudiant6=EtudiantImp.getEtudiantByid(IdE);
                             System.out.println(etudiant6.getMatricule());
                             System.out.println(etudiant6.getGenre());
                             System.out.println(etudiant6.getNom());
                             System.out.println(etudiant6.getPrenom());
                             System.out.println(etudiant6.getAdresse());
                             System.out.println(etudiant6.getDateDeNaissance());
                             System.out.println(etudiant6.getLieuDeNaissance());
                             System.out.println(etudiant6.getNationalite());
                             System.out.println(etudiant6.getSituationMatri());
                             System.out.println(etudiant6.getTel());
                             System.out.println(etudiant6.getEmail());
                             System.out.println(etudiant6.getGroupeSanguin());
                         break;
                         case 4:
                           System.out.println("Supprimer un etudiant: ");  
                           int Idf=cla.nextInt();
                           Etudiant etudiant4 = EtudiantImp.getEtudiantByid(Idf);
                           EtudiantImp.removeEtudiant(etudiant4);
                            System.out.println("Supprimession d'un etudiant vk succes: ");
                         break;
                         case 5:
                              System.out.println("Afficher tous les etudiants: ");
                              List <Etudiant> etudiant55=(List<Etudiant>) EtudiantImp.getAllEtudiant();
                              for(Etudiant etudiant5:etudiant55){
                                   System.out.println(etudiant5.getNom());
                              }
                                      
                         break;
                         case 6:
                             System.out.println("Menu Principal");
                    boolean var2 = false;
                    boolean var = true;
                             
                         break;


                         default:
                             System.out.println("erreur");
                     }
                
	             System.out.println("----------------------"); 
	         break;
	         case 3: 
	          
                   System.out.println(" | 1.     Ajouter un Professeur             :"); 
		 System.out.println("| 2.   Modifier un Professeur             :");
		 System.out.println("| 3.   Voir les details d'un Professeur   :");
                 System.out.println("| 4.   Afficher tous les Professeurss     :");
                 System.out.println("| 5.   Supprimer un Professeur          :");
                 System.out.println("| 6.       Quitter                    :");
                 System.out.println(" Entrer Votre choix :");
                 choix3=cla3.nextInt();
                    cla.nextLine();
                   switch(choix3){
                       case 1:
	            System.out.println(" | 1.    Ajouter un Professeur             :"); 
                     System.out.println(" veullez mettre les données");
                        
                         System.out.println("Id Professeur: ");
                         int id = cla.nextInt();
                         System.out.println("Matricule Professeur: ");
                         String matricule = cla.nextLine();
                         System.out.println("Genre Professeur: ");
                         String genre = cla.nextLine();
                         System.out.println("Nom Professeur: ");
                         String nom = cla.nextLine(); 
                         System.out.println("prenom Professeur: ");
                         String prenom = cla.nextLine();
                         System.out.println("adresse Professeur: ");
                         String adresse = cla.nextLine();
                         System.out.println("dateDeNaissance Professeur: ");
                         String dateDeNaissance = cla.nextLine();
                          System.out.println("lieuDeNaissance Professeur ");
                         String lieuDeNaissance = cla.nextLine();
                         System.out.println("nationalite Professeur: ");
                         String nationalite = cla.nextLine();
                         System.out.println("situationMatri Professeur: ");
                         String situationMatri = cla.nextLine();
                         System.out.println("Telephone Professeur ");
                         String tel = cla.nextLine();
                         System.out.println("mail Professeur ");
                         String email = cla.nextLine();
                         System.out.println("specialty: ");
                         String speciality = cla.nextLine();
                         Professeur professeur= new Professeur(id, matricule,genre,nom,prenom,adresse,dateDeNaissance,lieuDeNaissance,nationalite,situationMatri,tel,email,speciality);
                         ProfesseurImp.addProfesseur(professeur);
                         System.out.print(" ajout validééééééééé avec succes ");
                         
                           break;
                       case 2:
		 System.out.println("| 2. Veuillez  modifier un Professeur             :");
                 System.out.println("id: ");
                           int idmod=cla2.nextInt();
                           Professeur professeur2=ProfesseurImp.getProfeseurById(idmod);
                           
                           ProfesseurImp.updateProfesseur(professeur2);
                           System.out.println("Le matricule: ");
                           String matriculE =cla2.next();
                           professeur2.setMatricule(matriculE);
                           System.out.println(" Genre ");
                           String genreE=cla2.next();
                           professeur2.setGenre(genreE);
                           System.out.println("Le Nom: ");
                           String nomEtu=cla2.next();
                           professeur2.setNom(nomEtu);
                           System.out.println("Le Prenom: ");
                           String prenomEtu=cla2.next();
                           professeur2.setPrenom(prenomEtu);
                           System.out.println("Adresse: ");
                           String adresseetu=cla2.next();
                           professeur2.setAdresse(adresseetu);
                           System.out.println(" Date de naissance ");
                           String dateNaissance=cla2.next();
                           professeur2.setDateDeNaissance(dateNaissance);
                            System.out.println(" Lieu de naissance ");
                           String lieuNaissance=cla2.next();
                           professeur2.setLieuDeNaissance(lieuNaissance);
                           System.out.println("Nationalité: ");
                           String nationalité=cla2.next();
                           professeur2.setNationalite(nationalité);
                           System.out.println("situationMatri: ");
                           String situationMatriE=cla2.next();
                           professeur2.setSituationMatri(situationMatriE);
                           System.out.println("Telephone: ");
                           String telE=cla2.next();
                           professeur2.setTel(telE);
                           System.out.println("vLe mail: ");
                           String mailE=cla2.next();
                           professeur2.setEmail(mailE);
                           System.out.println("Speciality: ");
                           String specialityE=cla2.next();
                           professeur2.setEmail(specialityE);
                           
                           System.out.println("Reussi avec succes!!!!!!!!!!!!!!!!!");
                 break;
                       case 3:
		 System.out.println("| 3.   Voir les details d'un Professeur :");
                 System.out.println("Id");
                             int IdF=cla.nextInt();
                             Professeur professeur6=ProfesseurImp.getProfesseurById(IdF);
                             System.out.println(professeur6.getMatricule());
                             System.out.println(professeur6.getGenre());
                             System.out.println(professeur6.getNom());
                             System.out.println(professeur6.getPrenom());
                             System.out.println(professeur6.getAdresse());
                             System.out.println(professeur6.getDateDeNaissance());
                             System.out.println(professeur6.getLieuDeNaissance());
                             System.out.println(professeur6.getNationalite());
                             System.out.println(professeur6.getSituationMatri());
                             System.out.println(professeur6.getTel());
                             System.out.println(professeur6.getEmail());
                             System.out.println(professeur6.getSpeciality());
                 break;
                         case 4:
                 System.out.println("| 4.  Vueillez  afficher tous les Professeurss     :");
                  System.out.println("Afficher tous les etudiants: ");
                              List <Professeur> professeur55=(List<Professeur>) ProfesseurImp.getAllProfesseur();
                              for(Professeur professeur5:professeur55){
                                   System.out.println(professeur5.getNom());
                 break;
                   case 5:
               
                   System.out.println("| 5.Vous voulez  Supprimer un Professeur          :");
                   System.out.println("Supprimer un etudiant: ");  
                           int Id=cla.nextInt();
                           Professeur professeur4 = ProfesseurImp.getProfesseurByid(Id);
                           EtudiantImp.removeEtudiant(professeur4);
                            System.out.println("Supprimession d'un professeur vk succes: ");
                     break;  
                 case 6:
                 System.out.println("| 6.       Quitter                    :");
                  default:
	          break;    
                                  
                              }
                   }
	         case 4: 
		           System.out.println("Vous avez choisi GEStion Etudiant professeur");
		             break;
	         case 5: 
		           System.out.println("Vous voulez quitter");
		           System.exit(0);
		             
	         default:
	              System.out.println("ERREUR");	
	        }
}
}


