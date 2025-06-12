public class Main {
    public static void main(String[] args)  throws  Exception {

        Cuenta cuentaComun = new CuentaComun("Itzel Escudero", "12345", 1000);
        cuentaComun.deposito(500);
        cuentaComun.retiro(500);

        CuentaAhorros cuentaAhorros = new CuentaAhorros( "12345", "Jane Granados", 1000);
        cuentaAhorros.deposito(700);
        cuentaAhorros.retiro(700);
        cuentaAhorros.aplicarInteres();

//        Cuenta[] cuentas =  { cuentaComun, cuentaAhorros };
//        for (Cuenta cuenta : cuentas) {
//            if (cuenta instanceof CuentaAhorros) {
//                ((CuentaAhorros) cuenta).aplicarInteres();
//            }
//        }
    }
}