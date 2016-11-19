/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.escolar;

import br.ufmt.ic.posbd.escolar.dao.CursoDisciplinaDAO;
import br.ufmt.ic.posbd.escolar.dao.jpa.CursoDisciplinaDAOImpl;
import br.ufmt.ic.posbd.escolar.dao.DisciplinaDAO;
import br.ufmt.ic.posbd.escolar.dao.jpa.DisciplinaDAOImpl;
import br.ufmt.ic.posbd.escolar.dao.HistoricoDAO;
import br.ufmt.ic.posbd.escolar.dao.jpa.HistoricoDAOImpl;
import br.ufmt.ic.posbd.escolar.dao.CursoDAO;
import br.ufmt.ic.posbd.escolar.dao.jpa.CursoDAOImpl;
import br.ufmt.ic.posbd.escolar.dao.FrequenciaDAO;
import br.ufmt.ic.posbd.escolar.dao.jpa.FrequenciaDAOImpl;
import br.ufmt.ic.posbd.escolar.dao.AlunoDAO;
import br.ufmt.ic.posbd.escolar.dao.jpa.AlunoDAOImpl;
import br.ufmt.ic.posbd.escolar.dao.ProfessorDAO;
import br.ufmt.ic.posbd.escolar.dao.jpa.ProfessorDAOImpl;
import br.ufmt.ic.posbd.escolar.dao.SalaTurmaDAO;
import br.ufmt.ic.posbd.escolar.dao.jpa.SalaTurmaDAOImpl;
import br.ufmt.ic.posbd.escolar.dao.TurmaDAO;
import br.ufmt.ic.posbd.escolar.dao.jpa.TurmaDAOImpl;
import br.ufmt.ic.posbd.escolar.dao.ResponsavelDAO;
import br.ufmt.ic.posbd.escolar.dao.jpa.ResponsavelDAOImpl;
import br.ufmt.ic.posbd.escolar.dao.SalaDAO;
import br.ufmt.ic.posbd.escolar.dao.jpa.SalaDAOImpl;
import br.ufmt.ic.posbd.escolar.dao.ModalidadeDAO;
import br.ufmt.ic.posbd.escolar.dao.jpa.ModalidadeDAOImpl;

/**
 *
 * @author raphael
 */
public class FabricaDAO {
    
    public static CursoDisciplinaDAO criarCursoDisciplinaDAO(){
        return new CursoDisciplinaDAOImpl();
    }

    public static DisciplinaDAO criarDisciplinaDAO(){
        return new DisciplinaDAOImpl();
    }

    public static HistoricoDAO criarHistoricoDAO(){
        return new HistoricoDAOImpl();
    }

    public static CursoDAO criarCursoDAO(){
        return new CursoDAOImpl();
    }

    public static FrequenciaDAO criarFrequenciaDAO(){
        return new FrequenciaDAOImpl();
    }

    public static AlunoDAO criarAlunoDAO(){
        return new AlunoDAOImpl();
    }

    public static ProfessorDAO criarProfessorDAO(){
        return new ProfessorDAOImpl();
    }

    public static SalaTurmaDAO criarSalaTurmaDAO(){
        return new SalaTurmaDAOImpl();
    }

    public static TurmaDAO criarTurmaDAO(){
        return new TurmaDAOImpl();
    }

    public static ResponsavelDAO criarResponsavelDAO(){
        return new ResponsavelDAOImpl();
    }

    public static SalaDAO criarSalaDAO(){
        return new SalaDAOImpl();
    }

    public static ModalidadeDAO criarModalidadeDAO(){
        return new ModalidadeDAOImpl();
    }

    
}
