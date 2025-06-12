public class CuentaAhorros extends Cuenta {
    private double tasaInteresAnual;

    public CuentaAhorros(  String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
        this.tasaInteresAnual = tasaInteresAnual;
    }
    public void  aplicarInteres() {
        double interes = saldo * (tasaInteresAnual / 12);
                //saldo = saldo + interes;
                saldo += interes;
                //setSaldo(getSaldo() + interes);
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }



    public void setTasaInteresAnual(double tasaInteresAnual) {

        this.tasaInteresAnual = tasaInteresAnual;
    }
}
