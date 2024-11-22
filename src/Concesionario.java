

import java.util.ArrayList;
import dominio.VehiculoTurismo;

public class Concesionario {

    public static void main(String[] args) throws Exception {
        
        ArrayList<VehiculoTurismo> al = new ArrayList<VehiculoTurismo>();

        // Me guardo uno para comprobar que pasa al intentar hacer remove()
        VehiculoTurismo variable_para_guardarlo = new VehiculoTurismo("Ford", "Fiesta", 12000, 5);
        al.add(variable_para_guardarlo);

        // Codigo normal
        al.add(new VehiculoTurismo("Honda", "Civic", 14000, 7));
        al.add(new VehiculoTurismo("Mini", "Cooper", 10000, 2));


        // Intentos de borrar el coche "Ford"

        //al.remove(0);
        //al.remove(new VehiculoTurismo("Honda", "Fiesta", 12000, 5));
        //al.remove(variable_para_guardarlo);

        System.out.println(al);
    }
}
