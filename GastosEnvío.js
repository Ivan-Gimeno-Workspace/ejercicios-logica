let totalCarrito = 45;
let esPremium = false;
let gastosEnvio = 4.95;
if (totalCarrito >= 60 || esPremium) {
    gastosEnvio = 0;
    console.log("¡Envío gratis! Total a pagar: " + totalCarrito);
} else {
    console.log("Total a pagar: " + (totalCarrito + gastosEnvio));
}