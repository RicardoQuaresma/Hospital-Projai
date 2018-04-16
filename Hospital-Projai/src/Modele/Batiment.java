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
public class Batiment {
    
    protected int m_numBatiment;
    protected String m_nomBatiment;
    
    public Batiment()
    {
        
    }
    
    public void setNumBatiment(int numBatiment)
    {
        m_numBatiment=numBatiment;
    }
    
    public void setNomBatiment(String nomBatiment)
    {
        m_nomBatiment=nomBatiment;
    }
    
    public int getNumBatiment()
    {
        return m_numBatiment;
    }
    
    public String getNomBatiment()
    {
        return m_nomBatiment;
    }
}
