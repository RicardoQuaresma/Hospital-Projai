/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Louis
 */
public class Malade extends Personne {
    
    private String m_mutuelle;
    
    public void setMutuelle(String mutuelle)
    {m_mutuelle=mutuelle;}
    
    public String getMutuelle(){return m_mutuelle;}
    
    
    public void afficherInfosMalade()
    {
        System.out.println("Nom : " +m_nom);
        System.out.println("Prénom : " +m_prenom);
        System.out.println("Adresse : " +m_adresse);
        System.out.println("Téléphone : " +m_telephone);
        System.out.println("Numéro : " +m_numeroPersonne);
        System.out.println("Mutuelle : " +m_mutuelle);
        
    }
    
}
