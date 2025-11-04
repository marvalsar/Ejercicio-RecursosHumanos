package com.mycompany.recursoshumanos.domain;

import java.time.LocalDate;

public class funcionario {
        private int idFuncionario;
	private String cedFuncionario;
	private tipoIdentificacionFunc tipoIdentificacion;
  	private String nombresFunc;
  	private String apellidosFunc;
  	private estadoCivilFunc estadoCivl;
  	private sexo sexoFunc;
  	private String direccionFunc;
  	private String telefonoFunc;
  	private LocalDate fechaNacimientoFunc;

    private static class estadoCivilFunc {

        public enum EstadoCivilFunc {
            Soltero,
            Casado,
            Union_Libre,
            Viudo
        }
    }

    private static class sexo {

        public enum Sexo {
            M, F, Otro
        }
    }
    
    private static class tipoIdentificacionFunc{
        public enum TipoIdentificacion{
            CC,CE,TI,PA
        }   
    }

    public funcionario() {
    }

    public funcionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getCedFuncionario() {
        return cedFuncionario;
    }

    public void setCedFuncionario(String cedFuncionario) {
        this.cedFuncionario = cedFuncionario;
    }

    public tipoIdentificacionFunc getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(tipoIdentificacionFunc tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNombresFunc() {
        return nombresFunc;
    }

    public void setNombresFunc(String nombresFunc) {
        this.nombresFunc = nombresFunc;
    }

    public String getApellidosFunc() {
        return apellidosFunc;
    }

    public void setApellidosFunc(String apellidosFunc) {
        this.apellidosFunc = apellidosFunc;
    }

    public estadoCivilFunc getEstadoCivl() {
        return estadoCivl;
    }

    public void setEstadoCivl(estadoCivilFunc estadoCivl) {
        this.estadoCivl = estadoCivl;
    }

    public sexo getSexoFunc() {
        return sexoFunc;
    }

    public void setSexoFunc(sexo sexoFunc) {
        this.sexoFunc = sexoFunc;
    }

    public String getDireccionFunc() {
        return direccionFunc;
    }

    public void setDireccionFunc(String direccionFunc) {
        this.direccionFunc = direccionFunc;
    }

    public String getTelefonoFunc() {
        return telefonoFunc;
    }

    public void setTelefonoFunc(String telefonoFunc) {
        this.telefonoFunc = telefonoFunc;
    }

    public LocalDate getFechaNacimientoFunc() {
        return fechaNacimientoFunc;
    }

    public void setFechaNacimientoFunc(LocalDate fechaNacimientoFunc) {
        this.fechaNacimientoFunc = fechaNacimientoFunc;
    }

    @Override
    public String toString() {
        return "funcionarios{" + "cedFuncionario=" + cedFuncionario + ", nombresFunc=" + nombresFunc + ", apellidosFunc=" + apellidosFunc + '}';
    }

    
    
}
