public class EmpleadoTiempoCompleto extends Empleado {


    private String beneficios;

    public EmpleadoTiempoCompleto(double salarioBase, String nombre, String id) {
        super(salarioBase, nombre, id);
        this.beneficios = beneficios;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
}
