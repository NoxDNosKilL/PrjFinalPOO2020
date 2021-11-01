/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.DAO;

import BEAN.Curso;
import java.util.List;



/**
 *
 * @author leo59
 */
public interface CursoDAO {
    List<String> cursos();
    List<Curso> cursos2();

    
}
