public class GastosEnvioJava {
public static void main(String[] args) {
    int totalCarrito = 45;
    boolean esPremium = true;
    double gastosEnvio = 4.95;

    if (totalCarrito >= 60 || esPremium) {
        gastosEnvio = 0;
        System.out.println("¡Envío gratis! Total a pagar: " + totalCarrito);
    } else {
        System.out.print("Total a pagar: " + (totalCarrito + gastosEnvio));
    }
}
}
