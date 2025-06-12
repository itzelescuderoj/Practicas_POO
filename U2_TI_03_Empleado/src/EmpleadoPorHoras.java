public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;

    public EmpleadoPorHoras(double salarioBase, String nombre, String id) {
        super(salarioBase, nombre, id);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        setSalarioBase(getSalarioBase() * horasTrabajadas);
        return getSalarioBase();
    }
}
