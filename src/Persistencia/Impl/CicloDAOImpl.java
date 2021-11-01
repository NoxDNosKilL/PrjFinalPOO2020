/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Impl;

import BEAN.Ciclo;
import BEAN.Curso;
import Persistencia.DAO.CicloDAO;
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
public class CicloDAOImpl implements CicloDAO {

    @Override
    public List<Ciclo> ciclos(){
        List<Ciclo> ciclos = new ArrayList();
        try {
            Connection cn = BDUtil.getConnection();

            String sql = "SELECT IDCICLO,DESCCICLO FROM CICLO";
            PreparedStatement ps = cn.prepareStatement(sql);
      
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ciclo ciclo = new Ciclo();
                ciclo.setIdCiclo(rs.getInt("IDCICLO"));
                ciclo.setDescrip(rs.getString("DESCCICLO"));
                ciclos.add(ciclo);
            }
            rs.close();
            ps.close();
            cn.close();
        } catch (Exception e) {
            System.err.println("Error de consulta " + e.getMessage());
        }
        return ciclos;
    }
    
}
