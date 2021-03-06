/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;
import Vue.fenetreaccueil;
import java.sql.SQLException;
import java.util.ArrayList;
import jdbcv2018.*;


/**
 *
 * @author Ricardo
 */
public class HospitalProjai {

    /**
     * @param args
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    
   
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        fenetreaccueil fen;
        fen=new fenetreaccueil(); 
        fen.setVisible(true);
        
        Connexion c1;
        
        ArrayList<String> r1, r2, r3, r4, r5, r6,r7,r8;
        c1= new Connexion ("hopital","root","root");
        r1=c1.remplirChampsRequete("SELECT  prenom, nom  FROM malade WHERE mutuelle='MAAF'");
        
        for(int i=0 ; i<r1.size(); i++)
        {
            System.out.println(r1.get(i));
        }
        
        r2=c1.remplirChampsRequete("SELECT prenom, nom FROM employe\n" +
        "WHERE numero IN ( SELECT numero  FROM infirmier  WHERE rotation='NUIT' )\n");
        for(int i=0 ; i<r2.size(); i++)
        {
            System.out.println(r2.get(i));
        }
        System.out.println("\n\n\n SERVICE: \n\n");
        r3=c1.remplirChampsRequete("SELECT service.nom, service.batiment, employe.prenom, employe.nom, docteur.specialite FROM service, employe, docteur WHERE (service.directeur=employe.numero AND service.directeur=docteur.numero)");
        for(int i=0 ; i<r3.size(); i++)
        {
            System.out.println(r3.get(i));
        }
        
        System.out.println("\n\n\n BAT B MUTUELLE: \n\n");
        r4=c1.remplirChampsRequete("SELECT DISTINCT hospitalisation.lit, hospitalisation.no_chambre, service.nom, malade.prenom, malade.nom, malade.mutuelle  FROM  malade, hospitalisation, service WHERE mutuelle LIKE 'MN%' AND hospitalisation.no_malade=malade.numero AND service.code=hospitalisation.code_service AND service.batiment='B'");
        for(int i=0 ; i<r4.size(); i++)
        {
            System.out.println(r4.get(i));
        }
        
        System.out.println("\n\n\n Moyenne salaire: \n\n");
        r5=c1.remplirChampsRequete(        "SELECT code_service, AVG(salaire)  FROM  infirmier GROUP BY code_service");
        for(int i=0 ; i<r4.size(); i++)
        {
            System.out.println(r5.get(i));
        }
        
        
        
        System.out.println("\n\n\n SALAIRE PAR SERVICE: \n\n");
        r5=c1.remplirChampsRequete("SELECT code_service, AVG(salaire)  FROM  infirmier GROUP BY code_service");
        for(int i=0 ; i<r5.size(); i++)
        {
            System.out.println(r5.get(i));
        }
        
        System.out.println("\n\n\n NOMBRE LIT PAR SERVICE DU BATIEMENT A: \n\n");
        r6=c1.remplirChampsRequete("SELECT code_service, AVG(nb_lits),batiment  FROM service,chambre WHERE batiment='A' GROUP BY code_service ");
        for(int i=0 ; i<r6.size(); i++)
        {
            System.out.println(r6.get(i));
        }
        
        
        
        
       
        
        
        
        
        
    }
    
}
