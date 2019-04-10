/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.clases.Empleado;
import ec.edu.ups.clases.EmpleadoAsalariado;
import ec.edu.ups.clases.EmpleadoPorComision;
import ec.edu.ups.clases.EmpleadoPorHoras;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Gabriel León Paredes, PhD
 */
public class Prueba {
    public static void main(String[] args) {
               
        List<Empleado> lista = new ArrayList<>();
        
        GregorianCalendar fechaContratacionPepito = new GregorianCalendar(2010, 0, 1);
        EmpleadoAsalariado empleadoPepito = new EmpleadoAsalariado(1, "0101010101", "Pepito Perez", fechaContratacionPepito.getTime(), 500);
        double salarioFinalPepito = empleadoPepito.calcularSalarioFinal();
        System.out.println("Salario final Pepito: " + salarioFinalPepito);
        
        GregorianCalendar fechaContratacionJuanito = new GregorianCalendar(2015, 0, 1);
        EmpleadoPorHoras empleadoJuanito = new EmpleadoPorHoras(2, "0202022020", "Juanito Perez", fechaContratacionJuanito.getTime(), 350);
        empleadoJuanito.setCostoHoraExtra(10);
        empleadoJuanito.setNumeroHorasExtra(15);
        double salarioFinalJuanito = empleadoJuanito.calcularSalarioFinal();
        System.out.println("Salario final Juanito: " + salarioFinalJuanito);
        
        GregorianCalendar fechaContratacionMaria = new GregorianCalendar(2017, 0, 1);
        EmpleadoPorComision empleadaMaria = new EmpleadoPorComision(3, "0303030303", "María Perez", fechaContratacionMaria.getTime(), 450);
        empleadaMaria.setVentasMensuales(1200);
        double salarioFinalMaria = empleadaMaria.calcularSalarioFinal();
        System.out.println("Salario final Maria: " + salarioFinalMaria);
        
        
        lista.add(empleadoPepito);
        lista.add(empleadoJuanito);
        lista.add(empleadaMaria);
        
        for (Empleado empleado : lista) {
            if(empleado instanceof EmpleadoAsalariado){
                EmpleadoAsalariado temp = (EmpleadoAsalariado) empleado;                
            }else if( empleado instanceof EmpleadoPorComision){
                EmpleadoPorComision temp = (EmpleadoPorComision) empleado;
            }else if (empleado instanceof EmpleadoPorHoras){
                EmpleadoPorHoras temp = (EmpleadoPorHoras) empleado;
            }            
        }
        
        Empleado empleadoAnonimo = new Empleado(4, "04040404040", "Anonimo Perez", fechaContratacionPepito.getTime(), 250){
            @Override
            public double calcularSalarioFinal() {
                return this.getSalario() + 50;
            }
        };
        
        System.out.println(empleadoAnonimo);
    }
}
