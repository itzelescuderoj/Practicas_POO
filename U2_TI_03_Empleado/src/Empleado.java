public abstract class Empleado {


    private String id;
    private String nombre;
    private double salarioBase;

    public Empleado(double salarioBase, String nombre, String id) {
        this.salarioBase = salarioBase;
        this.nombre = nombre;
        this.id = id;
    }


    public abstract double calcularSalario();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}

