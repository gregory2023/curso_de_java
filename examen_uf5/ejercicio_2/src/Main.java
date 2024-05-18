import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear algunos empleados
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("grego", 21, 2500000));
        empleados.add(new Empleado("raul", 22, 7000000));
        empleados.add(new Empleado("samu", 23, 2500000));

        // salario promedio de todos los empleados
        double salarioPromedio = Empleado.calcularSalarioPromedio(empleados);
        System.out.println("Salario promedio de los empleados: " + salarioPromedio);

        // Encontrar al empleado que gana más
        Empleado empleadoMayorSalario = Empleado.encontrarEmpleadoMayorSalario(empleados);
        System.out.println("Empleado que gana más: " + empleadoMayorSalario.getNombre() +
                " con un salario de " + empleadoMayorSalario.getSueldo());
    }
}
