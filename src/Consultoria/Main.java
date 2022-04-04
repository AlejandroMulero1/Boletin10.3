package Consultoria;

public class Main {

    public static void main(String[] args) {
	Empleado empleado=new Administrativo ("Juan", "Rodriguez Moreno", "123456789M", "123456789J" ,"Paseo 6 de Julio"
                                   , 5, 9996993, 1200, 5);
        System.out.println(empleado.toString());
    }
}
