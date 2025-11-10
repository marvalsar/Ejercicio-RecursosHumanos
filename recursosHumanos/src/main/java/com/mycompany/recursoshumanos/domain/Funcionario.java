package com.mycompany.recursoshumanos.domain;

import java.time.LocalDate;

public class Funcionario {
       
    private int idFuncionario;
    private String cedFuncionario;
    private String tipoIdentificacion;
    private String nombreTipoId;
    private String nombresFunc;
    private String apellidosFunc;
    private String estadoCivil;
    private String nombreEstadoCivil;
    private String sexo;
    private String nombreSexo;
    private String direccionFunc;
    private String telefonoFunc;
    private LocalDate fechaNacimientoFunc;

    public Funcionario() {
    }

    public Funcionario(int idFuncionario, String cedFuncionario, String tipoIdentificacion, String nombreTipoId, String nombresFunc, String apellidosFunc, String estadoCivil, String nombreEstadoCivil, String sexo, String nombreSexo, String direccionFunc, String telefonoFunc, LocalDate fechaNacimientoFunc) {
        this.idFuncionario = idFuncionario;
        this.cedFuncionario = cedFuncionario;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombreTipoId = nombreTipoId;
        this.nombresFunc = nombresFunc;
        this.apellidosFunc = apellidosFunc;
        this.estadoCivil = estadoCivil;
        this.nombreEstadoCivil = nombreEstadoCivil;
        this.sexo = sexo;
        this.nombreSexo = nombreSexo;
        this.direccionFunc = direccionFunc;
        this.telefonoFunc = telefonoFunc;
        this.fechaNacimientoFunc = fechaNacimientoFunc;
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

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNombreTipoId() {
        return nombreTipoId;
    }

    public void setNombreTipoId(String nombreTipoId) {
        this.nombreTipoId = nombreTipoId;
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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNombreEstadoCivil() {
        return nombreEstadoCivil;
    }

    public void setNombreEstadoCivil(String nombreEstadoCivil) {
        this.nombreEstadoCivil = nombreEstadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombreSexo() {
        return nombreSexo;
    }

    public void setNombreSexo(String nombreSexo) {
        this.nombreSexo = nombreSexo;
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
        return "Funcionario{" + "idFuncionario=" + idFuncionario + ", cedFuncionario=" + cedFuncionario + ", tipoIdentificacion=" + tipoIdentificacion + ", nombreTipoId=" + nombreTipoId + ", nombresFunc=" + nombresFunc + ", apellidosFunc=" + apellidosFunc + ", estadoCivil=" + estadoCivil + ", nombreEstadoCivil=" + nombreEstadoCivil + ", sexo=" + sexo + ", nombreSexo=" + nombreSexo + ", direccionFunc=" + direccionFunc + ", telefonoFunc=" + telefonoFunc + ", fechaNacimientoFunc=" + fechaNacimientoFunc + '}';
    }

       
      
}
