/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *  Clase Empleado
 * 
 * 
 *  Clase PADRE abstracta que tiene atributos en común entre
 *  diferentes tipos de empleados (Asalarido, Por Comisión, Por Horas).
 * 
 *  En esta clase se implementa el método abstracto calcularSalarioFinal
 *  el cuál será implementado en cada clase hija
 * 
 * @author Gabriel León Paredes, PhD
 * 
 */
public abstract class Empleado {
   
    private int codigo;
    private String cedula;
    private String nombre;
    private Date fechaContratacion;
    private double salario;

    public Empleado() {
    }

    public Empleado(int codigo, String cedula, String nombre, Date fechaContratacion, double salario) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalarioFinal();
    
    
    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", fechaContratacion=" + fechaContratacion + ", salario=" + salario + '}';
    }
    
        
}
