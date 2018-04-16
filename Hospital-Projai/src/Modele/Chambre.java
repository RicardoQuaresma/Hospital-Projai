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
public class Chambre extends Service{
    
    private int m_numChambre, m_numSurveillant, m_nbLits;
    
    public Chambre()
    {
        
    }
    
    public void setNumChambre(int numChambre)
    {
        m_numChambre=numChambre;
    }
    
    public void setNumSurveillant(int numSurveillant)
    {
        m_numSurveillant=numSurveillant;
    }
    
    public void setNbLits(int nbLits)
    {
        m_nbLits=nbLits;
    }
    
    public int getNumChambre()
    {
        return m_numChambre;
    }
    
    public int getNumSurveillant()
    {
        return m_numSurveillant;
    }
    
    public int getNbLits()
    {
        return m_nbLits;
    }
    
}
