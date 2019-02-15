/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameNotFoundException;
import javax.sql.DataSource;



/**
 *
 * @author PERSONAL
 */
public class ConectaDb {
    private String datasource="jdbc/autenticar_MySQL";
    
    public Connection getConnection(){
        Connection cn=null;
        
        try {
            Context contextoInicial = new InitialContext();
            Context contexto = (Context) contextoInicial.lookup("java:comp/env");
            DataSource fuentedatos = (DataSource) contexto.lookup(datasource);
            cn = fuentedatos.getConnection();
        } catch(NameNotFoundException e){
          cn=null;
        } catch(Exception e){
          cn=null;
        }
        return cn;
    }
}
