package com.mycompany.recursoshumanos.View;

import com.mycompany.recursoshumanos.controller.FuncionarioController;
import com.mycompany.recursoshumanos.domain.Funcionario;
import com.mycompany.recursoshumanos.domain.GrupoFamiliar;
import java.sql.SQLException;
import java.util.List;

public class RecursosHumanos {
    
    public static void getFuncionarios(FuncionarioController funcionariosController){
        try {
            List<Funcionario> funcionarios = funcionariosController.getFuncionarios();
            if (funcionarios.isEmpty()){
                System.out.println("No hay datos");
            }else{
                funcionarios.forEach(funcionario -> {
                    System.out.println("id: "+ funcionario.getIdFuncionario());
                    System.out.println("Cédula: "+ funcionario.getCedFuncionario());
                    System.out.println("Tipo de identificación: "+ funcionario.getTipoIdentificacion());
                    System.out.println("Nombres: "+ funcionario.getNombresFunc());
                    System.out.println("Apellidos: "+ funcionario.getApellidosFunc());
                    System.out.println("Estado Civil: "+ funcionario.getEstadoCivil());
                    System.out.println("Sexo: "+ funcionario.getSexo());
                    System.out.println("Dirección: "+ funcionario.getDireccionFunc());
                    System.out.println("Teléfono: " + funcionario.getTelefonoFunc());
                    System.out.println("Fecha de Nacimiento: " + funcionario.getFechaNacimientoFunc());
                                      
                    System.out.println("**********************************************");
                    System.out.println("**********************************************");
                });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //para poder utilizar los métodos del control
        FuncionarioController funcionariosController = new FuncionarioController();
        getFuncionarios(funcionariosController);
    }
}
