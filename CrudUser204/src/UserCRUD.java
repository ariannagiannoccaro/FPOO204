/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arigi
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UserCRUD {
    
    private Connection conexion;
    
    public UserCRUD(){
        conexion= ConexionMySQL.conectar();
    }
    
    public boolean InsertUsuario(String nombre,String correo, String contrasena ){
        
        //preparamos la sentencia SQL para INSERT
        String insertSQL = " INSERT INTO usuarios(nombre,correo,conttrasena) VALUES (?,?,?)";
        
        try{
            //Asignamos la sentencia y parametros para su ejecucion
            PreparedStatement ps= conexion.prepareStatement(insertSQL);
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contrasena);
            return ps.executeUpdate()>0; //este siempre va a regresar booleans
        }
        catch(SQLException e){
            //imprimimos en consola en caso de que no se ejecute el INSERT
            System.out.println("Error al crear el usuario "+ e.getMessage());//retornar el contido del error y cual era el error
            return false;
        }
    }
    
}
