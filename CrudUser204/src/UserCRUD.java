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
import java.sql.ResultSet;


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
    }//fin del Insert
    
    //método: consultar por ID
    
    public ResultSet buscarPorID (int id){
        String sqlBuscar = "SELECT * FROM usuarios WHERE id= ?";
        
        try{
            PreparedStatement ps= conexion.prepareStatement(sqlBuscar);
            ps.setInt(1, id);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error al buscar por Id "+ e.getMessage());//retornar el contido del error y cual era el error
            return null;
        }
    }// fin de CONSULTA ID
    
    public ResultSet obtenerTodos (){
        String sqlTodos = "SELECT * FROM usuarios";
        
        try{
            PreparedStatement ps= conexion.prepareStatement(sqlTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
            System.out.println("Error al consultar todos"+ s.getMessage());
            return null;
        }
    }// fin obtenerTodos
    
    public boolean actualizarId(String nombre, String correo, String contrasena, int id) {
    String sqlActualizar = "UPDATE usuarios SET nombre = ?, correo = ?, conttrasena = ? WHERE id = ?";
    try {
        PreparedStatement ps = conexion.prepareStatement(sqlActualizar);
        ps.setString(1, nombre);
        ps.setString(2, correo);
        ps.setString(3, contrasena);
        ps.setInt(4, id);
        return ps.executeUpdate() > 0;
    } 
    catch (SQLException e) {
        System.out.println("Error al actualizar usuario: " + e.getMessage());
        return false;
    }
  }//actualizar Id
    
    public boolean eliminarUsuario(int id) {
        String sqlEliminar = "DELETE FROM usuarios WHERE id = ?";
        try {
        PreparedStatement ps = conexion.prepareStatement(sqlEliminar);
        ps.setInt(1, id); 
        int filasEliminada = ps.executeUpdate(); 
        
        return filasEliminada > 0; 
         } 
        catch (SQLException d) {
        System.out.println("Error al eliminar usuario: " + d.getMessage());
        return false;
        }
    }//fin eliminar
}
