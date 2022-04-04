package Consultoria;

import java.util.Scanner;

public abstract class Empleado {
    private String  nombre, apellidos, dni, direccion, dniSupervisor;
    private int antiguedad, telefonoContacto;
    double salario;


    public Empleado(String nombre, String apellidos, String dni, String dniSupervisor,
                    String direccion, int antiguedad, int telefonoContacto, double salario) {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.direccion=direccion;
        this.dniSupervisor=dniSupervisor;
        this.antiguedad=antiguedad;
        this.telefonoContacto=telefonoContacto;
        this.salario=salario;
    }

    public void cambiarSupervisor() {
        Scanner sc=new Scanner(System.in);
        String dniSupervisor;
        System.out.println("Introduzca el DNI del nuevo supervisor");
        dniSupervisor=sc.next();
        this.dniSupervisor = dniSupervisor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public abstract void incrementarSalario();



    @Override
    public String toString(){
        String saltolinea = System.getProperty("line.separator");
        return "Nombre Completo: " + nombre + " " + apellidos + saltolinea +
                "Datos " + saltolinea +
                "DNI: "+ dni + saltolinea +
                "DNI de su Supervisor: " + dniSupervisor + saltolinea +
                "Dirección: " + direccion + saltolinea +
                "Antigüedad: " + antiguedad + " años" + saltolinea +
                "Telefono de Contacto: " + telefonoContacto + saltolinea +
                "Salario: " + salario;

    }


}
