package com.mycompany.recursoshumanos.Dao;

import com.mycompany.recursosHumanos.config.ConnectionConfig;
import com.mycompany.recursoshumanos.domain.EstadoCivil;
import com.mycompany.recursoshumanos.domain.Funcionario;
import com.mycompany.recursoshumanos.domain.GrupoFamiliar;
import com.mycompany.recursoshumanos.domain.Parentesco;
import com.mycompany.recursoshumanos.domain.Sexo;
import com.mycompany.recursoshumanos.domain.TipoIdentificacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

    public class GrupoFamiliarDao {
       
    // CONSULTAS SQL
    
    private static final String GET_GRUPOOFAMILIAR = 
        "SELECT familiares.*, funcionarios.nombresFunc AS nombreFuncionario "
        + "FROM familiares "
        + "LEFT JOIN funcionarios ON familiares.idFuncionario = funcionarios.idFuncionario";
    
    private static final String CREATE_GRUPOFAMILIAR = 
        "INSERT INTO familiares (idFuncionario, cedFamiliar, tipoIdentificacion, nombreTipoId, nombresFam, apellidosFam, "
        + "parentesco, , estadoCivil, nombreEstadoCivil, sexo, nombreSexo, direccionFam, telefonoFam, fechaNacimientoFam) "
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    private static final String GET_GRUPOFAMILIAR_BY_ID = 
        "SELECT familiares.*, funcionarios.IdFuncionario AS IdFuncionario "
        + "FROM familiares "
        + "LEFT JOIN funcionarios ON familiares.idFuncionario = funcionarios.idFuncionario "
        + "WHERE familiares.idFamiliar = ?";
    
    private static final String UPDATE_GRUPOFAMILIAR = 
        "UPDATE familiares SET idFuncionario = ?, cedFamiliar = ?, tipoIdentificacion = ?, nombresFam = ?, "
        + "apellidosFam = ?, parentesco = ?, estadoCivil = ?, sexo = ?, direccionFam = ?, "
        + "telefonoFam = ?, fechaNacimientoFam = ? WHERE idFamiliar = ?";
    
    private static final String DELETE_GRUPOFAMILIAR = 
        "DELETE FROM familiares WHERE idFamiliar = ?";
    
    
    // MÉTODOS CRUD
   
    //Obtener todos los familiares registrados
    
    public List<GrupoFamiliar> getFamiliares() throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement= null;
        ResultSet resultSet = null;
        List<GrupoFamiliar> familiares = new ArrayList<>();
        
        try {
            connection = ConnectionConfig.getConnection();
            preparedStatement = connection.prepareStatement(GET_GRUPOOFAMILIAR);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                GrupoFamiliar fam = new GrupoFamiliar();
                fam.setIdFamiliar(resultSet.getInt("idFamiliar"));
                fam.setIdFamiliar(resultSet.getInt("idFamiliar"));
                fam.setCedFamiliar(resultSet.getString("cedFamiliar"));
                fam.setTipoIdentificacion(resultSet.getString("idTipoId"));
                fam.setNombreTipoId(resultSet.getString("nombreTipoId"));
                fam.setNombresFam(resultSet.getString("nombresFam"));
                fam.setApellidosFam(resultSet.getString("apellidosFam"));
                fam.setEstadoCivil(resultSet.getString("idEstadoCivil"));
                fam.setSexo(resultSet.getString("idSexo"));
                fam.setDireccionFam(resultSet.getString("direccionFam"));
                fam.setTelefonoFam(resultSet.getString("telefonoFam"));
                fam.setFechaNacimientoFam(resultSet.getDate("fechaNacimientoFam").toLocalDate());

                familiares.add(fam); // agrega a la lista correctamente
            }
            return familiares;
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
    
    
    //Crear un nuevo familiar
    public void create(GrupoFamiliar fam) throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = ConnectionConfig.getConnection();
            preparedStatement = connection.prepareStatement(CREATE_GRUPOFAMILIAR);
            preparedStatement.setInt(1, fam.getIdFamiliar());
            preparedStatement.setString(2, fam.getCedFamiliar());
            preparedStatement.setString(3, fam.getTipoIdentificacion());
            preparedStatement.setString(4, fam.getNombresFam());
            preparedStatement.setString(5, fam.getApellidosFam());
            preparedStatement.setString(6, fam.getParentesco());
            preparedStatement.setString(7, fam.getEstadoCivil());
            preparedStatement.setString(9, fam.getDireccionFam());
            preparedStatement.setString(10, fam.getTelefonoFam());
            preparedStatement.setDate(11, java.sql.Date.valueOf(fam.getFechaNacimientoFam()));
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
        
     //Obtener un familiar por su ID
    
    public GrupoFamiliar getGrupoFamiliar(int idFamiliar) throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        GrupoFamiliar fam = null;
        
        try {
            connection = ConnectionConfig.getConnection();
            preparedStatement = connection.prepareStatement(GET_GRUPOFAMILIAR_BY_ID);
            preparedStatement.setInt(1, idFamiliar);
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                fam = new GrupoFamiliar();
                fam.setIdFamiliar(resultSet.getInt("idFamiliar"));
                fam.setIdFuncionario(resultSet.getInt("idFuncionario"));
                fam.setCedFamiliar(resultSet.getString("cedFamiliar"));
                fam.setTipoIdentificacion(resultSet.getString("idTipoId"));
                fam.setNombresFam(resultSet.getString("nombresFam"));
                fam.setApellidosFam(resultSet.getString("apellidosFam"));
                fam.setParentesco(resultSet.getString("idParentesco"));
                fam.setEstadoCivil(resultSet.getString("idEstadocivil"));
                fam.setSexo(resultSet.getString("idSexo"));
                fam.setDireccionFam(resultSet.getString("direccionFam"));
                fam.setTelefonoFam(resultSet.getString("telefonoFam"));
                fam.setFechaNacimientoFam(resultSet.getDate("fechaNacimientoFam").toLocalDate());
            }
            
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return fam;
    }
    
    // Actualizar datos de un familiar existente
    
    public void update(GrupoFamiliar fam) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = ConnectionConfig.getConnection();
            preparedStatement = connection.prepareStatement(UPDATE_GRUPOFAMILIAR);
            preparedStatement.setInt(1, fam.getIdFuncionario());
            preparedStatement.setString(2, fam.getCedFamiliar());
            preparedStatement.setString(3, fam.getTipoIdentificacion());
            preparedStatement.setString(4, fam.getNombresFam());
            preparedStatement.setString(5, fam.getApellidosFam());
            preparedStatement.setString(6, fam.getParentesco());
            preparedStatement.setString(7, fam.getEstadoCivil());
            preparedStatement.setString(8, fam.getSexo());
            preparedStatement.setString(9, fam.getDireccionFam());
            preparedStatement.setString(10, fam.getTelefonoFam());
            preparedStatement.setDate(11, java.sql.Date.valueOf(fam.getFechaNacimientoFam()));
            preparedStatement.setInt(12, fam.getIdFamiliar());
            preparedStatement.executeUpdate();
            
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
    
    
     //Eliminar un familiar por su ID
    
    public void delete(int idFamiliar) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = ConnectionConfig.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_GRUPOFAMILIAR);
            preparedStatement.setInt(1, idFamiliar);
            preparedStatement.executeUpdate();
            
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}

