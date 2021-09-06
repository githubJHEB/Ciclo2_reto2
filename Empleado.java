import java.util.ArrayList;

public class Empleado {
    private int id;
    private String nombre;
    int horasExtra;
    boolean auxilioTransporte;
    int salario;

    public Empleado(String nombre, int horasExtra, boolean auxilioTransporte, int salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.horasExtra = horasExtra;
        this.auxilioTransporte = auxilioTransporte;
    }
}