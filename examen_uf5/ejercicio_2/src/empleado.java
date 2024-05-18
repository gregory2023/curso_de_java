import java.util.ArrayList;

 class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // calcular el salario promedio
    public static double calcularSalarioPromedio(ArrayList<Empleado> empleados) {
        double totalSalario = 0;
        for (Empleado empleado : empleados) {
            totalSalario += empleado.getSueldo();
        }
        return totalSalario / empleados.size();
    }

    // empleado que gana mas
    public static Empleado encontrarEmpleadoMayorSalario(ArrayList<Empleado> empleados) {
        Empleado empleadoMayorSalario = null;
        double maxSalario = Double.MIN_VALUE;
        for (Empleado empleado : empleados) {
            if (empleado.getSueldo() > maxSalario) {
                maxSalario = empleado.getSueldo();
                empleadoMayorSalario = empleado;
            }
        }
        return empleadoMayorSalario;
    }
}
