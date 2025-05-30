import Model.UsuarioSeguro;


public class Main {
    public static void main(String[] args) throws Exception {
        UsuarioSeguro usse = new UsuarioSeguro();
        usse.setContrasena("abcd");

        // Prueba con contraseña correcta
        if (UsuarioSeguro.autentic("abcd")) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        // Prueba con contraseña incorrecta
        if (UsuarioSeguro.autentic("incorrecta")) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    }

}

