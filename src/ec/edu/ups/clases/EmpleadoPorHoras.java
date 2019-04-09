/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 * Clase Empleado por Horas
 * 
 * Clase hija que hereda de Empleado, en donde, se implementa el método
 * abstracto calcularSalarioFinal() con base a las horas extras y costo
 * de hora extra trabajada.
 * 
 * @author Gabriel León Paredes, PhD
 */
public class EmpleadoPorHoras extends Empleado {

    private int numeroHorasExtra;
    private double costoHoraExtra;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(int codigo, String cedula, String nombre, Date fechaContratacion, double salario) {
        super(codigo, cedula, nombre, fechaContratacion, salario);
    }        

    public EmpleadoPorHoras(int numeroHorasExtra, double costoHoraExtra, int codigo, String cedula, String nombre, Date fechaContratacion, double salario) {
        super(codigo, cedula, nombre, fechaContratacion, salario);
        this.numeroHorasExtra = numeroHorasExtra;
        this.costoHoraExtra = costoHoraExtra;
    }

    public EmpleadoPorHoras(int numeroHorasExtra, double costoHoraExtra) {
        this.numeroHorasExtra = numeroHorasExtra;
        this.costoHoraExtra = costoHoraExtra;
    }

    public int getNumeroHorasExtra() {
        return numeroHorasExtra;
    }

    public void setNumeroHorasExtra(int numeroHorasExtra) {
        this.numeroHorasExtra = numeroHorasExtra;
    }

    public double getCostoHoraExtra() {
        return costoHoraExtra;
    }

    public void setCostoHoraExtra(double costoHoraExtra) {
        this.costoHoraExtra = costoHoraExtra;
    }
    
    
    @Override
    public double calcularSalarioFinal() {
        return super.getSalario() + (numeroHorasExtra * costoHoraExtra);
    }
        

}
