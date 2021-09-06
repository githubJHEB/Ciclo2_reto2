import java.util.ArrayList;

public class Empresa {
    ArrayList<Empleado> empleados;
    

    public static ArrayList<Double> liquidarNominaEmp(ArrayList<Empleado> empleados) {

        ArrayList<Double> valueToRerun = new ArrayList<Double>();
        for (int i = 0; i < empleados.size(); i++) {
            valueToRerun.add(calculosNominaEmp(empleados, i));
        }
        return valueToRerun;
    }

    public static ArrayList<Double> liquidarParafiscales(ArrayList<Empleado> empleados) {

        ArrayList<Double> valueToRerun = new ArrayList<Double>();
        for (int i = 0; i < empleados.size(); i++) {
            valueToRerun.add(calculosParafiscales(empleados, i));
        }
        return valueToRerun;
    }


    private static double calculosNominaEmp(ArrayList<Empleado> empleados, int i) {
        int auxilioTrans = 0;
        int salario30dias = 0;
        int valorHorasExtra = 0;
        int paraFiscales = 0;
        int valorMensualidad = 0;

        if (empleados.get(i).auxilioTransporte) {
            auxilioTrans = 106454;
        }
        salario30dias = empleados.get(i).salario;
        valorHorasExtra = (salario30dias / 240) * empleados.get(i).horasExtra;
        paraFiscales = (int)((salario30dias + valorHorasExtra) * 0.08);
        valorMensualidad = ((salario30dias + auxilioTrans + valorHorasExtra)) - paraFiscales;
        return valorMensualidad;
    }

    private static double calculosParafiscales(ArrayList<Empleado> empleados, int i) {
        int auxilioTrans = 0;
        int salario30dias = 0;
        int valorHorasExtra = 0;
        int paraFiscales = 0;
        int valorMensual = 0;
        int valorParafiscales = 0;

        if (empleados.get(i).auxilioTransporte) {
            auxilioTrans = 106454;
        }
        salario30dias = empleados.get(i).salario;
        valorHorasExtra = (salario30dias / 240) * empleados.get(i).horasExtra;
        paraFiscales = ((salario30dias + valorHorasExtra) * 8)/100;
        valorMensual = ((salario30dias + auxilioTrans + valorHorasExtra));
        valorParafiscales = (valorMensual-auxilioTrans) * 9/100;
        return valorParafiscales;
    }
}