import java.util.ArrayList;

public class mainEmpleado {
    public static void main(String[] args) {
        ArrayList<Empleado> datoNomina;
        datoNomina = new ArrayList<Empleado>();
        ArrayList<Empleado> datoParafiscal;
        datoParafiscal = new ArrayList<Empleado>();

        datoNomina.add(new Empleado("Ada", 5, true, 1500000));
        datoNomina.add(new Empleado("Laura", 5, true, 1085000));

        //datoParafiscal.add(new Empleado("Ada", 5, true, 1500000));
        //datoParafiscal.add(new Empleado("Laura", 5, true, 1085000));
        //dato.add(new Empleado("Laura", 2, true, 1050000));
        //dato.add(new Empleado("Carmen", 5, true, 1085000));    
        
        //dato.add(new Empleado("Carmen", 4, true, 1500000)); 
        //dato.add(new Empleado("Pablo", 2, true, 1200000)); 
        //dato.add(new Empleado("Laura", 5, false, 2000000)); 
        //dato.add(new Empleado("Eloisa", 0, false, 2500000)); 
        //dato.add(new Empleado("Miguel", 0, false, 2500000));
        //dato.add(new Empleado("Mateo", 0, false, 2500000)); 
        //dato.add(new Empleado("Alfonsina", 0, true, 0));
        //dato.add(new Empleado("Angel", 0, true, 1200000));

        System.out.print(Empresa.liquidarNominaEmp(datoNomina));
        System.out.print(Empresa.liquidarParafiscales(datoParafiscal));

    }
}