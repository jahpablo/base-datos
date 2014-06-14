/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;

import java.sql.*;


/**
 *
 * @author campitos
 */
public class TestProcedimiento {
    public static void main(String args[])throws Exception{
        
        Connection con=Conexion.conectarse();
     CallableStatement callate=con.prepareCall("{call guardar_usuario2(?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setString(2,"juan");
        callate.setString(3,"qwerty@asdf.com");
      
        callate.execute();
        int id=callate.getInt(1);
        System.out.println("El Id de salida para esta insercion es: "+id);
    }
    
}
