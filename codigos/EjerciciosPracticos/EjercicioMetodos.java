
// Clase principal del ejercicio
public class MetodoMayor {

    // Método que recibe dos números y devuelve el mayor
    public static int mayor(int a, int b) {
        // Si a es mayor que b, devuelve a
        if (a > b) {
            return a;
        } else {
            // Si no, devuelve b
            return b;
        }
    }

    // Método principal (punto de entrada del programa)
    public static void main(String[] args) {

        // Llamamos al método mayor con los valores 15 y 8
        int resultado = mayor(15, 8);

        // Mostramos el resultado en pantalla
        System.out.println("El número mayor es: " + resultado);  // Imprime: El número mayor es: 15
    }
}
