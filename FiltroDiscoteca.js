// 1. Guardamos la edad en una variable
let edad = 15;
let esVip= false;
// 2. El programa toma la decisión
if (edad >= 18 || esVip === true) {
    // Si la edad es 18 o más, o si está en la lista de Vip, hace esto:
    console.log("¡Bienvenido al club! Puedes pasar.");
} else {
    // Si la edad es menor de 18 años, hace esto:
    console.log("Lo siento, eres menor de edad. No puedes entrar.");
}
