
package com.mycompany.recursoshumanos.domain;

import java.time.LocalDate;


public class grupoFamiliar {
     private int idFamiliar;
    private int idFuncionario;
    private String cedFamiliar;
    private tipoIdentificacionFam tipoIdentificacion;
    private String nombresFam;
    private String apellidosFam;
    private parentescoFam parentesco;
    private estadoCivil estadoCivilFam; 
    private sexo sexoFam; // 
    private String direccionFam;
    private String telefonoFam;
    private LocalDate fechaNacimientoFam;

    private static class tipoIdentificacionFam {

        public enum TipoIdentificacionFam{
            CC, CE, TI, PA
        }
    }

    private static class parentescoFam {

        public enum ParentescoFam{
            Hijo, Esposo, Madre
        }
    }

    private static class estadoCivil {

        public enum EstadoCivilFunc {
            Soltero,
            Casado,
            Union_Libre,
            Viudo
        }
    }

    private static class sexo {

        public enum Sexo{
            M, F, Otro
        }
    }

    public grupoFamiliar() {
    }

    public grupoFamiliar(int idFamiliar) {
        this.idFamiliar = idFamiliar;
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

    public tipoIdentificacionFam getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(tipoIdentificacionFam tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
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

    public parentescoFam getParentesco() {
        return parentesco;
    }

    public void setParentesco(parentescoFam parentesco) {
        this.parentesco = parentesco;
    }

    public estadoCivil getEstadoCivilFam() {
        return estadoCivilFam;
    }

    public void setEstadoCivilFam(estadoCivil estadoCivilFam) {
        this.estadoCivilFam = estadoCivilFam;
    }

    public sexo getSexoFam() {
        return sexoFam;
    }

    public void setSexoFam(sexo sexoFam) {
        this.sexoFam = sexoFam;
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
        return "grupoFamiliar{" + "parentesco=" + parentesco + '}';
    }
    
    
    
    
}
