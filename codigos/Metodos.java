public class Metodos {
    // Método que suma dos números enteros y devuelve el resultado
    public static int sumar(int a, int b) {
        // Retorna la suma de los dos parámetros
        return a + b;
    }

    // Método principal (punto de entrada del programa)
    public static void main(String[] args) {

        // Llamamos al método sumar con los valores 10 y 5
        int resultado = sumar(10, 5);

        // Mostramos el resultado en pantalla
        System.out.println("La suma es: " + resultado);  // Imprime: La suma es: 15
    }
}
