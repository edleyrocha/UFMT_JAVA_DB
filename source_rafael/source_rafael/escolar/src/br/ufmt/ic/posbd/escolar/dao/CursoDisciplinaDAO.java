/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolar.dao;

import br.ufmt.ic.posbd.escolarPostgresql.entidade.Curso;
import br.ufmt.ic.posbd.escolarPostgresql.entidade.CursoDisciplina;
import br.ufmt.ic.posbd.escolarPostgresql.entidade.Disciplina;
import java.util.List;

/**
 *
 * @author raphael
 */
public interface CursoDisciplinaDAO extends DAO<CursoDisciplina>{
    
    public boolean exists(Curso curso, Disciplina disciplina);
    
}
