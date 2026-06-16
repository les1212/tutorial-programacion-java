public class VectoresMatrices {

    // Método principal donde inicia el programa
    public static void main(String[] args) {

        // Creamos un vector con cuatro números enteros
        int[] vector = {5, 10, 15, 20};

        // Variable para acumular la suma de los elementos
        int suma = 0;

        // Recorremos el vector para sumar cada elemento
        for(int i = 0; i < vector.length; i++) {
            // Acumulamos el valor actual en la variable suma
            suma += vector[i];
        }

        // Mostramos el resultado de la suma
        System.out.println("Suma = " + suma);

        // Creamos una matriz de 3 filas y 3 columnas
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Recorremos la matriz con ciclos anidados
        for(int i = 0; i < matriz.length; i++) {

            // Recorremos cada columna de la fila actual
            for(int j = 0; j < matriz[i].length; j++) {
                // Mostramos el elemento con espacio para separar
                System.out.print(matriz[i][j] + " ");
            }

            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}
