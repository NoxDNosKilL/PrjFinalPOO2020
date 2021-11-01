/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Impl;

import BEAN.Alumno;
import Persistencia.DAO.AlumnoDAO;
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
public class AlumnoDAOImpl implements AlumnoDAO {

    @Override
    public List<Alumno> listar() {
        List<Alumno> alumnos = new ArrayList();
        try {
            Connection cn = BDUtil.getConnection();

            String sql = "SELECT IDALUMNO,APELLIDOS,NOMBRES,DIRECCION,IDESTADO FROM ALUMNO";
            PreparedStatement ps = cn.prepareStatement(sql);
      
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alumno a = new Alumno();
                a.setIdAlumno(rs.getInt("IDALUMNO"));
                a.setApellido(rs.getString("APELLIDOS"));
                a.setNombre(rs.getString("NOMBRES"));
                a.setDirecc(rs.getString("DIRECCION"));;
                a.setEstado(rs.getInt("IDESTADO"));
               
                alumnos.add(a);
            }
            rs.close();
            ps.close();
            cn.close();
        } catch (Exception e) {
            System.err.println("Error de consulta " + e.getMessage());
        }
        return alumnos;
    }
    
}
