/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.projai.Batiment;

/**
 *
 * @author Ricardo
 */
public class Service extends Batiment{
    
    protected int m_codeService;
    protected String m_nomService, m_nomDirecteur;
    
    public Service()
    {
        
    }
    
    public void setCodeService(int codeService)
    {
        m_codeService=codeService;
    }
    
    public void setNomService(String nomService)
    {
        m_nomService=nomService;
    }
    
    public void setNomDirecteur(String nomDirecteur)
    {
        m_nomDirecteur=nomDirecteur;
    }
    
    public int getCodeService()
    {
        return m_codeService;
    }
    
    public String getNomService()
    {
        return m_nomService;
    }
    
    public String getNomDirecteur()
    {
        return m_nomDirecteur;
    }
    
}
