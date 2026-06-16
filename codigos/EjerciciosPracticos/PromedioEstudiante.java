public class PromedioEstudiante {

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void mostrarResultado(String nombre, double promedio) {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + promedio);
        if (promedio >= 6.0) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: Reprobado");
        }
    }

    public static void main(String[] args) {
        double promedio = calcularPromedio(7.5, 6.0, 8.0);
        mostrarResultado("Ana", promedio);
    }
}