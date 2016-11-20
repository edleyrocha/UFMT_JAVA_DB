/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolar.dao.jpa;

import br.ufmt.ic.posbd.escolar.dao.SalaDAO;
import br.ufmt.ic.posbd.escolar.entidade.Sala;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author raphael
 */
public class SalaDAOImpl implements SalaDAO{
    
    private EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("escolarPU");

    @Override
    public boolean inserir(Sala t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterar(Sala t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sala consultar(int id) {
        EntityManager em = emf.createEntityManager();
        Sala sala = em.find(Sala.class, id);
        return sala;
    }

    @Override
    public List<Sala> listar() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT s FROM Sala s");
        return query.getResultList();
    }
    
}
