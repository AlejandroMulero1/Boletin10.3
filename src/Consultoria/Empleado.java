package Consultoria;

public abstract class Empleado {
    private String  nombre, apellidos, dni, direccion, dniSupervisor;
    private int antiguedad, telefonoContacto, salario;


    public Empleado(String nombre, String apellidos, String dni, String dniSupervisor,
                    String direccion, int antiguedad, int telefonoContacto, int salario) {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.direccion=direccion;
        this.dniSupervisor=dniSupervisor;
        this.antiguedad=antiguedad;
        this.telefonoContacto=telefonoContacto;
        this.salario=salario;
    }

    public void setDniSupervisor(String dniSupervisor) {
        this.dniSupervisor = dniSupervisor;
    }

    public abstract void incrementarSalario();

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
