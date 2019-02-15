/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.Sql;
import java.util.List;
import model.BeanUsuario;

/**
 *
 * @author PERSONAL
 */
public class DaoUsuario {
    
    public static String getNombre(BeanUsuario usuario){
//        String sql = "SELECT nombre FROM INGRESOS.usuarios " + 
//                     " WHERE nick LIKE " + 
//                     "'" + usuario.getNick() + "'" + 
//                     " AND password LIKE " + 
//                     "'" + usuario.getPassword() + "'";
        String sql= (String) Sql.getCampo("exec INGRESOS.logueo " +
                     "'" + usuario.getNick() + "'" +  ","  + "'" +  usuario.getPassword() + "'");
        System.out.println(sql);
        
        return sql;
    }
    
}
