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
public class Docteur {
    
    private String m_specialite;
    private int m_batimentDocteur;
    
    public Docteur()
    {
        
    }
    
    public void setSpecialite(String spe)
    {
    m_specialite=spe;
    }
    public void setBatimentDoc(int batimentDocteur)
    {
    m_batimentDocteur=batimentDocteur;
    }
    
    public String getSpecialite ()
    {
        return m_specialite;
    }
    
    public int getBatimentDocteur()
    {
        return m_batimentDocteur;
    }
    
    
    
    
}
