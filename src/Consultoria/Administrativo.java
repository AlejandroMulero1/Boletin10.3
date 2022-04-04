package Consultoria;

public class Administrativo extends Empleado {
    private int numFax;
    private boolean despacho;

    public Administrativo(String nombre, String apellidos, String dni, String dniSupervisor, String direccion, int antiguedad, int telefonoContacto, int salario, int numFax) {
        super(nombre, apellidos, dni, dniSupervisor, direccion, antiguedad, telefonoContacto, salario);
        this.numFax=numFax;
        this.despacho=true;
    }

    @Override
    public void incrementarSalario() {
        for(int i=1; i<=getAntiguedad(); i++) {
            setSalario(getSalario() * 1.05);
        }
    }

    @Override
    public String toString() {
        String saltolinea = System.getProperty("line.separator");
        String datos=super.toString();
        return datos + saltolinea +
                "Numero Fax:" + this.numFax + saltolinea +
                "Cargo: " + this.getClass().getSimpleName();
    }

}
