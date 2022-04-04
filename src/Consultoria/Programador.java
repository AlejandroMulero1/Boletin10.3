package Consultoria;

public class Programador extends Empleado {
    public Programador(String nombre, String apellidos, String dni, String dniSupervisor, String direccion, int antiguedad, int telefonoContacto, double salario) {
        super(nombre, apellidos, dni, dniSupervisor, direccion, antiguedad, telefonoContacto, salario);
    }

    @Override
    public void incrementarSalario() {

    }
}
