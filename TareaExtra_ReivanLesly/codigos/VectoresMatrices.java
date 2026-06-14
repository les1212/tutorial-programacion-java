public class VectoresMatrices {
    
    public static void main(String[] args) {
        int[] vector = {5, 10, 15, 20};
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        System.out.println("Suma del vector: " + suma);

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\nMatriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}