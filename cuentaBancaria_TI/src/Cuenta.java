public abstract class Cuenta {

    private String numeroCuenta;
    private String titular;
    protected double saldo;


    public Cuenta( String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void deposito(double cantidad) {
        if (cantidad > 0) {     //validacion para cantidad, mayor a 0 para el deposito
            saldo += cantidad;
        } else {
            System.out.println("No se puede hacer un de posito de: " + cantidad);
        }
    }
    public void retiro(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad ){
            if (cantidad %100 == 0){
                saldo -= cantidad;
            }else {
                System.out.println("Solo puedes retirar multiplos de 100 ");
            }

        }else {
            System.out.println("No tienes suficiente saldo ");
        }
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

}
