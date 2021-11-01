/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Impl;

import BEAN.Curso;
import Persistencia.DAO.CursoDAO;
import UTIL.BDUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leo59
 */
public class CursoDAOImpl implements CursoDAO {

    @Override
    public List<String> cursos() {
        List<String> cursos = new ArrayList();
        try {
            Connection cn = BDUtil.getConnection();

            String sql = "SELECT NOMBCURSO FROM CURSO";
            PreparedStatement ps = cn.prepareStatement(sql);
      
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Curso curso = new Curso();
                curso.setNombre(rs.getString("NOMBCURSO"));
                cursos.add(curso.getNombre());
            }
            rs.close();
            ps.close();
            cn.close();
        } catch (Exception e) {
            System.err.println("Error de consulta " + e.getMessage());
        }
        return cursos;
    }

    @Override
    public List<Curso> cursos2() {
        List<Curso> cursos = new ArrayList();
        try {
            Connection cn = BDUtil.getConnection();

            String sql = "SELECT NOMBCURSO, IDCURSO FROM CURSO";
            PreparedStatement ps = cn.prepareStatement(sql);
      
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Curso curso = new Curso();
                curso.setNombre(rs.getString("NOMBCURSO"));
                curso.setIdCurso(rs.getInt("IDCURSO"));
                cursos.add(curso);
            }
            rs.close();
            ps.close();
            cn.close();
        } catch (Exception e) {
            System.err.println("Error de consulta " + e.getMessage());
        }
        return cursos;
    }
    
    


    
}
