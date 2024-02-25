package cuentas;
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(2500);
    }

	private static void operativa_cuenta(float cantidad) {
		CCuenta Cuenta1;
        double saldoActual;

        Cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidad,0);
        saldoActual = Cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            Cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            Cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
