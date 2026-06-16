public class EjercicioVectoresMatrices {

    // Método principal donde inicia el programa
    public static void main(String[] args) {

        // Creamos un vector con cinco números enteros
        int[] numeros = {10, 20, 30, 40, 50};

        // Variable para acumular la suma de los elementos
        int suma = 0;

        // Recorremos el vector para sumar cada número
        for(int i = 0; i < numeros.length; i++) {
            // Sumamos el valor actual al acumulador
            suma += numeros[i];
        }

        // Calculamos el promedio convirtiendo suma a double
        double promedio = (double) suma / numeros.length;

        // Mostramos el resultado en pantalla
        System.out.println("Promedio = " + promedio);
    }
}
