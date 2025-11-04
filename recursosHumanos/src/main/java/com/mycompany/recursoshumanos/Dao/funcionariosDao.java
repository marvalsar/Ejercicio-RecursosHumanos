
package com.mycompany.recursoshumanos.Dao;

import com.mycompany.recursosHumanos.config.ConnectionConfig;
import com.mycompany.recursoshumanos.domain.funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class funcionariosDao {
    private static final String GET_FUNCIONARIOS = "select funcionarios.*, familiares.nombresFam" 
            +"from funcionarios" 
            +"inner join familiares on funcionarios.idFuncionario = familiares.idFuncionario";
    
    private static final String CREATE_FUNCIONARIOS = "insert into funcionarios (cedFuncionario, tipoIdentificacion, nombresFunc, apellidosFunc, "
           + "estadoCivil, sexoFunc, direccionFunc, telefonoFunc, fechaNacimientoFunc) "
           + "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
     
    private static final String UPDATE_FUNCIONARIOS = "update funcionarios set cedFuncionario = ?, "
            + "tipoIdentificacion = ?, nombresFunc = ?, apellidosFunc = ?, estadoCivil = ?, sexoFunc = ?, "
            + "direccionFunc = ?, telefonoFunc = ?, fechaNacimientoFunc = ? where idFuncionario = ?";
    
    private static final String DELETE_FUNCIONARIOS = "delete from funcionarios where idFuncionario = ?";
    
    public List<funcionario> getfuncionarios() throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement= null;
        ResultSet resultSet = null;
        List<funcionario> funcionarios = new ArrayList<>();
        
        try {
            connection = ConnectionConfig.getConnection();
            String GET_FUNCIONARIOS;
            PreparedStatement PreparedStatement = connection.prepareStatement(GET_FUNCIONARIOS);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Funcionario funcionario = new Funcionario();
                funcionarios.setIdFuncionario(resultSet.getInt("idFuncionario"));
                funcionarios.setCedFuncionario(resultSet.getString("cedFuncionario"));
                funcionarios.setTipoIdentificacion(resultSet.getString("tipoIdentificacion"));
                funcionarios.setNombresFunc(resultSet.getString("nombresFunc"));
                funcionarios.setApellidosFunc(resultSet.getString("apellidosFunc"));
                funcionarios.setEstadoCivil(resultSet.getString("estadoCivil"));
                funcionarios.setSexoFunc(resultSet.getString("sexoFunc"));
                funcionarios.setDireccionFunc(resultSet.getString("direccionFunc"));
                funcionarios.setTelefonoFunc(resultSet.getString("telefonoFunc"));
                funcionarios.setFechaNacimientoFunc(resultSet.getDate("fechaNacimientoFunc").toLocalDate());
                Funcionario.add(funcionarios);
            }
            return Funcionario;
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
    
    public void create ()
}
