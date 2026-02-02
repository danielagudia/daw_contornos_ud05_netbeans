package cuentas;

public class Main {
/**
 * 
 * @param args 
 */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        float cantidad =0;
       

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1, cantidad);
    }
/**
 * 
 * @param cuenta1
 * @param cantidad 
 */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual;
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        
        System.out.print("Linea gregada desde Netbeans forma Gráfica");
        System.out.print("ultimas lineas");
    
    }
}
