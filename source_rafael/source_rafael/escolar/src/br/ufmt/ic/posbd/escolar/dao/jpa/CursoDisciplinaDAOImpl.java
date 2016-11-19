package br.ufmt.ic.posbd.escolar.dao.jpa;

import br.ufmt.ic.posbd.escolar.dao.CursoDisciplinaDAO;
import br.ufmt.ic.posbd.escolarPostgresql.entidade.Curso;
import br.ufmt.ic.posbd.escolarPostgresql.entidade.CursoDisciplina;
import br.ufmt.ic.posbd.escolarPostgresql.entidade.Disciplina;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CursoDisciplinaDAOImpl extends DAOImpl<CursoDisciplina> implements CursoDisciplinaDAO {

    @Override
    public boolean exists(Curso curso, Disciplina disciplina) {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT c FROM CursoDisciplina c WHERE c.curso = :curso AND c.disciplina = :disciplina");
        query.setParameter("curso", curso);
        query.setParameter("disciplina", disciplina);
        return !query.getResultList().isEmpty();
    }

}
