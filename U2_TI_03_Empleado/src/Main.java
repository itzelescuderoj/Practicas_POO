public class Main {
    public static void main(String[] args) {

        Empleado empleadoTiempoCompleto = new EmpleadoTiempoCompleto(1500, "Itzel Escudero", "06");
        System.out.println("Salario de: " + empleadoTiempoCompleto.calcularSalario());


        Empleado empleadoPorHoras = new EmpleadoPorHoras(1500, "Itzel Escudero", "06");
       System.out.println("Salario de:" + empleadoPorHoras.calcularSalario());




    }
}