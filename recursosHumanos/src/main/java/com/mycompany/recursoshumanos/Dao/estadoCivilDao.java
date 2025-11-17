
package com.mycompany.recursoshumanos.Dao;

import com.mycompany.recursoshumanos.config.ConnectionConfig;
import com.mycompany.recursoshumanos.domain.estadoCivil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class estadoCivilDao {
    
    private static final String GET_ESTADOCIVIL = "select * from EstadoCivil";
    
    public List<estadoCivil> getEstadoCivil() throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement= null;
        ResultSet resultSet = null;
        List<estadoCivil> EstadoCivil = new ArrayList<>();
        
        try {
            connection = ConnectionConfig.getConnection();
            preparedStatement = connection.prepareStatement(GET_ESTADOCIVIL);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                estadoCivil estadoCivil = new estadoCivil();
                estadoCivil.setIdEstadocivil(resultSet.getInt("idEstadoCivil"));
                estadoCivil.setNombreEstadoCivil(resultSet.getString("nombreEstadoCivil"));
                

                EstadoCivil.add(estadoCivil); // agrega a la lista correctamente
            }
            return EstadoCivil;
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
}
