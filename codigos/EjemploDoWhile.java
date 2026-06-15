public class EjemploDoWhile {
    public static void main(String[] args) {
        int opcion = 1;  // Opcion inicial
        do {
            System.out.println("1. Ingresar datos");
            System.out.println("2. Mostrar resultados");
            System.out.println("3. Salir");
            System.out.println("Opcion elegida: " + opcion);
            opcion++;  // Simulamos que el usuario cambia de opcion
        } while(opcion <= 3);
    }
}