/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import views_pkg.frameCliclistas;

/**
 *
 * @author Usuario
 */
public class Aplicacion_Rutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frameCliclistas inst_frame= new frameCliclistas();
        Conexion inst_con=new Conexion();
        
        inst_con.getConnection();
        inst_frame.setVisible(true);
    }
    
}
