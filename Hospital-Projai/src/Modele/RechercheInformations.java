/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.SQLException;
import java.util.ArrayList;
import jdbcv2018.Connexion;

/**
 *
 * @author Ricardo
 */
public class RechercheInformations {
    
    private String m_champ;
    private ArrayList <String> m_resultatRecherche;
    
    public RechercheInformations(String champ)
    {
        m_champ=champ;
    }
    
    public ArrayList <String> recherche() throws SQLException, ClassNotFoundException
    {
        Connexion c1;
        ArrayList<String> r1, r2, r3, r4;
        c1= new Connexion ("hopital","root","root");
        m_resultatRecherche=c1.remplirChampsRequete("SELECT prenom, nom FROM malade WHERE prenom='"+m_champ+"'");
        return m_resultatRecherche;
    }
}
