
package com.mycompany.recursoshumanos.domain;

import java.time.LocalDate;


public class GrupoFamiliar {
    
    
    private int idFamiliar;
    private int idFuncionario;
    private String cedFamiliar;
    private String tipoIdentificacion;
    private String nombreTipoId;
    private String nombresFam;
    private String apellidosFam;
    private String parentesco;
    private String nombreParentesco;
    private String estadoCivil; 
    private String nombreEstadoCivil;
    private String sexo; 
    private String nombreSexo;
    private String direccionFam;
    private String telefonoFam;
    private LocalDate fechaNacimientoFam;
         
        public GrupoFamiliar() {
    }

    public GrupoFamiliar(int idFamiliar, int idFuncionario, String cedFamiliar, String tipoIdentificacion, String nombreTipoId, String nombresFam, String apellidosFam, String parentesco, String nombreParentesco, String estadoCivil, String nombreEstadoCivil, String sexo, String nombreSexo, String direccionFam, String telefonoFam, LocalDate fechaNacimientoFam) {
        this.idFamiliar = idFamiliar;
        this.idFuncionario = idFuncionario;
        this.cedFamiliar = cedFamiliar;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombreTipoId = nombreTipoId;
        this.nombresFam = nombresFam;
        this.apellidosFam = apellidosFam;
        this.parentesco = parentesco;
        this.nombreParentesco = nombreParentesco;
        this.estadoCivil = estadoCivil;
        this.nombreEstadoCivil = nombreEstadoCivil;
        this.sexo = sexo;
        this.nombreSexo = nombreSexo;
        this.direccionFam = direccionFam;
        this.telefonoFam = telefonoFam;
        this.fechaNacimientoFam = fechaNacimientoFam;
    }

    public int getIdFamiliar() {
        return idFamiliar;
    }

    public void setIdFamiliar(int idFamiliar) {
        this.idFamiliar = idFamiliar;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getCedFamiliar() {
        return cedFamiliar;
    }

    public void setCedFamiliar(String cedFamiliar) {
        this.cedFamiliar = cedFamiliar;
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

    public String getNombresFam() {
        return nombresFam;
    }

    public void setNombresFam(String nombresFam) {
        this.nombresFam = nombresFam;
    }

    public String getApellidosFam() {
        return apellidosFam;
    }

    public void setApellidosFam(String apellidosFam) {
        this.apellidosFam = apellidosFam;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getNombreParentesco() {
        return nombreParentesco;
    }

    public void setNombreParentesco(String nombreParentesco) {
        this.nombreParentesco = nombreParentesco;
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

    public String getDireccionFam() {
        return direccionFam;
    }

    public void setDireccionFam(String direccionFam) {
        this.direccionFam = direccionFam;
    }

    public String getTelefonoFam() {
        return telefonoFam;
    }

    public void setTelefonoFam(String telefonoFam) {
        this.telefonoFam = telefonoFam;
    }

    public LocalDate getFechaNacimientoFam() {
        return fechaNacimientoFam;
    }

    public void setFechaNacimientoFam(LocalDate fechaNacimientoFam) {
        this.fechaNacimientoFam = fechaNacimientoFam;
    }

    @Override
    public String toString() {
        return "GrupoFamiliar{" + "idFamiliar=" + idFamiliar + ", idFuncionario=" + idFuncionario + ", cedFamiliar=" + cedFamiliar + ", tipoIdentificacion=" + tipoIdentificacion + ", nombreTipoId=" + nombreTipoId + ", nombresFam=" + nombresFam + ", apellidosFam=" + apellidosFam + ", parentesco=" + parentesco + ", nombreParentesco=" + nombreParentesco + ", estadoCivil=" + estadoCivil + ", nombreEstadoCivil=" + nombreEstadoCivil + ", sexo=" + sexo + ", nombreSexo=" + nombreSexo + ", direccionFam=" + direccionFam + ", telefonoFam=" + telefonoFam + ", fechaNacimientoFam=" + fechaNacimientoFam + '}';
    }
        
    }
