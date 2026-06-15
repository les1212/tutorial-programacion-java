public class EjemploWhile {
    public static void main(String[] args) {
        int i = 1;  // Inicializamos la variable fuera del ciclo
        while(i <= 5) {
            System.out.println("Numero: " + i);  // Imprime el valor actual
            i++;  // Incrementamos la variable para evitar ciclo infinito
        }
    }
}