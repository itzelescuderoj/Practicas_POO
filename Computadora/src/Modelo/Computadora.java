package Modelo;

public class Computadora {
    private String marca;
    private String modelo;
    private boolean encendida;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void encender() {
        if (!encendida) {
            System.out.println("Encendiendo computadora...");
            encendida = true;
        }
    }

    public void apagar() {
        if (encendida) {
            System.out.println("Apagando computadora...");
            encendida = false;
        }
    }
}
