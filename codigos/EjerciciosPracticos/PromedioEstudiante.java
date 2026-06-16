
// Clase principal
public class PromedioEstudiante {

    // Método que calcula el promedio de tres notas
    public static double calcularPromedio(double n1, double n2, double n3) {
        // Suma las tres notas y divide entre 3
        return (n1 + n2 + n3) / 3;
    }

    // Método que muestra si el estudiante aprobó o no
    public static void mostrarResultado(String nombre, double promedio) {
        // Imprime el nombre y el promedio obtenido
        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + promedio);

        // Verifica si aprobó (promedio >= 6.0)
        if (promedio >= 6.0) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: Reprobado");
        }
    }

    // Método principal
    public static void main(String[] args) {

        // Calculamos el promedio con tres notas
        double promedio = calcularPromedio(7.5, 6.0, 8.0);

        // Mostramos el resultado del estudiante
        mostrarResultado("Ana", promedio);
    }
}
