/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Ricardo
 */
public class Personne {
    
    protected String m_numeroPersonne,m_telephone;
    protected String m_nom,m_prenom,m_adresse ;
    
    
    public Personne()
    {
    
    
    }
    
   public void setNomPersonne(String nom)
   {
       m_nom=nom;
   }
   public void setPrenomPersonne(String prenom)
   {
       m_prenom=prenom;   
   }
   public void setAdresse(String adresse)
   {
       m_adresse=adresse;
   }
   public void setTelephone(String telephone)
   {
       m_telephone=telephone;
   }
   public void setNumeroPersonne(String numeropersonne)
   {
       m_numeroPersonne=numeropersonne;
   }
   
   
   public String getNomPersonne()
   {
       return m_nom;
   }
   public String getPrenomPersonne()
   {
       return m_prenom;  
   }
   public String getAdresse()
   {
       return m_adresse;
   }
   public String getTelephone()
   {
       return m_telephone;
   }
   public String getNumeroPersonne()
   {
       return m_numeroPersonne;
   }
   

    
    
}
