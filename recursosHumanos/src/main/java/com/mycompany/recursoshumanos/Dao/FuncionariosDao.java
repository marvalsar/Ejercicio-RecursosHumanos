
package com.mycompany.recursoshumanos.Dao;

import com.mycompany.recursosHumanos.config.ConnectionConfig;
import com.mycompany.recursoshumanos.domain.EstadoCivil;
import com.mycompany.recursoshumanos.domain.Funcionario;
import com.mycompany.recursoshumanos.domain.GrupoFamiliar;
import com.mycompany.recursoshumanos.domain.Sexo;
import com.mycompany.recursoshumanos.domain.TipoIdentificacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class FuncionariosDao {
    
    //Consultas SQL
    
    private static final String GET_FUNCIONARIO = 
            "SELECT funcionarios.*, familiares.nombresFam AS nombreFamiliar "
            + "FROM funcionarios "
            + "LEFT JOIN familiares ON funcionarios.idFuncionario = familiares.idFuncionario ";
    
    private static final String CREATE_FUNCIONARIO = 
            "INSERT INTO funcionarios (cedFuncionario, tipoIdentificacion, nombresFunc, apellidosFunc, "
            + "estadoCivil, sexo, direccionFunc, telefonoFunc, fechaNacimientoFunc) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    private static final String GET_FUNCIONARIO_BY_ID = 
            "SELECT funcionarios.*, familiares.nombresFam "
            + "FROM funcionarios "
            + "LEFT JOIN familiares ON funcionarios.idFuncionario = familiares.idFuncionario "
            + "WHERE funcionarios.idFuncionario = ?";
         
    private static final String UPDATE_FUNCIONARIO = 
            "UPDATE funcionarios SET cedFuncionario = ?, "
            + "tipoIdentificacion = ?, nombresFunc = ?, apellidosFunc = ?, estadoCivil = ?, sexo = ?, "
            + "direccionFunc = ?, telefonoFunc = ?, fechaNacimientoFunc = ? WHERE idFuncionario = ?";   
    
    private static final String DELETE_FUNCIONARIO =
        "DELETE FROM funcionarios WHERE idFuncionario = ?";
    
    // MÉTODO: OBTENER TODOS LOS FUNCIONARIOS
    
    public List<Funcionario> getFuncionarios() throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement= null;
        ResultSet resultSet = null;
        List<Funcionario> funcionarios = new ArrayList<>();
        
        try {
            connection = ConnectionConfig.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIO);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Funcionario f = new Funcionario();
                f.setIdFuncionario(resultSet.getInt("idFuncionario"));
                f.setCedFuncionario(resultSet.getString("cedFuncionario"));
                f.setTipoIdentificacion(resultSet.getString("idTipoId"));
                f.setNombresFunc(resultSet.getString("nombresFunc"));
                f.setApellidosFunc(resultSet.getString("apellidosFunc"));
                f.setEstadoCivil(resultSet.getString("idEstadoCivil"));
                f.setSexo(resultSet.getString("idSexo"));
                f.setDireccionFunc(resultSet.getString("direccionFunc"));
                f.setTelefonoFunc(resultSet.getString("telefonoFunc"));
                f.setFechaNacimientoFunc(resultSet.getDate("fechaNacimientoFunc").toLocalDate());

                funcionarios.add(f); // agrega a la lista correctamente
            }
            return funcionarios;
        }finally {
            if(connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            
            if (resultSet != null) {
                resultSet.close();
            }
        }
    }
    
       
    public void create(Funcionario funcionarios) throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            
            connection = ConnectionConfig.getConnection();
            preparedStatement = connection.prepareStatement(CREATE_FUNCIONARIO);
            preparedStatement.setString(1, funcionarios.getCedFuncionario());
            preparedStatement.setString(2, funcionarios.getNombresFunc());
            preparedStatement.setString(3, funcionarios.getApellidosFunc());
            preparedStatement.setString(4, funcionarios.getEstadoCivil());
            preparedStatement.setString(5, funcionarios.getDireccionFunc());
            preparedStatement.setString(6, funcionarios.getTelefonoFunc());
            preparedStatement.executeUpdate();
            
            
        } finally {
            
            if (connection != null) {
                connection.close();
            }
                       
            if (preparedStatement != null){
                preparedStatement.close();
            }
        }
    }
    public  Funcionario getFuncionarios(int idFuncionario) throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Funcionario f = null;
        
        
        try {
            connection = ConnectionConfig.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIO_BY_ID);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                f.setIdFuncionario(resultSet.getInt("idFuncionario"));
                f.setCedFuncionario(resultSet.getString("cedFuncionario"));
                f.setTipoIdentificacion(resultSet.getString("idTipoId"));
                f.setNombresFunc(resultSet.getString("nombresFunc"));
                f.setApellidosFunc(resultSet.getString("apellidosFunc"));
                f.setEstadoCivil(resultSet.getString("idEstadoCivil"));
                f.setSexo(resultSet.getString("idSexo"));
                f.setDireccionFunc(resultSet.getString("direccionFunc"));
                f.setTelefonoFunc(resultSet.getString("telefonoFunc"));
                f.setFechaNacimientoFunc(resultSet.getDate("fechaNacimientoFunc").toLocalDate());
               
            }
            return f;
        }finally {
            if(connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            
            if (resultSet != null) {
                resultSet.close();
            }
        }
    }
    public void updateFuncionario(Funcionario funcionarios) throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            
            connection = ConnectionConfig.getConnection();
            preparedStatement = connection.prepareStatement(UPDATE_FUNCIONARIO);
            preparedStatement.setString(1, funcionarios.getCedFuncionario());
            preparedStatement.setString(2, funcionarios.getNombresFunc());
            preparedStatement.setString(3, funcionarios.getApellidosFunc());
            preparedStatement.setString(4, funcionarios.getEstadoCivil());
            preparedStatement.setString(5, funcionarios.getDireccionFunc());
            preparedStatement.setString(6, funcionarios.getTelefonoFunc());
            preparedStatement.executeUpdate();
            
            
        } finally {
            
            if (connection != null) {
                connection.close();
            }
                       
            if (preparedStatement != null){
                preparedStatement.close();
            }
        }
    }
    
    public void delete(int idFuncionario) throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            
            connection = ConnectionConfig.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_FUNCIONARIO);
            preparedStatement.setInt(1, idFuncionario);
            preparedStatement.executeUpdate();
                       
        } finally {
            
            if (connection != null) {
                connection.close();
            }
                       
            if (preparedStatement != null){
                preparedStatement.close();
            }
        }
    }
               
}

