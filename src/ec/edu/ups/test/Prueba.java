/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.clases.EmpleadoAsalariado;
import ec.edu.ups.clases.EmpleadoPorComision;
import ec.edu.ups.clases.EmpleadoPorHoras;
import java.util.GregorianCalendar;

/**
 *
 * @author Gabriel León Paredes, PhD
 */
public class Prueba {
    public static void main(String[] args) {
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
        
    }
}
