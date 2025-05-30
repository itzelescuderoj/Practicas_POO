package Model;

public class UsuarioSeguro {
    private String nombreUsuario;
    private String contrasena;


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null && nombreUsuario.length() == 0) {
            System.out.println("El nombre del usuario no debe estar vacio");
        }
        this.nombreUsuario = nombreUsuario;
    }
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {

        boolean tieneMayus=false;
        boolean tieneMinus=false;
        boolean tieneDigitos=false;
        if (contrasena != null && contrasena.length() >7) {
            for (int i = 0; i < contrasena.length(); i++) {
                Character c = contrasena.charAt(i);
                if (Character.isUpperCase(c)) {

                    tieneMayus = true;
                }
                if (Character.isLowerCase(c)) {

                    tieneMinus = true;
                }
                if (Character.isDigit(c)) {

                    tieneDigitos = true;
                }
            }if(tieneDigitos && tieneMayus && tieneMinus){
                System.out.println("La contraseña correcta");
                this.contrasena = contrasena;
            }else {
                System.out.println("La contraseña es incorrecta");
                System.out.println("Acceso Denegado");
            }
        }else {
            System.out.println("La contraseña debe tener 8 caracteres");
        }


    }
    public boolean autentic(String intentPassword) {
        return this.contrasena != null && this.contrasena.equals(intentPassword);
    }
}