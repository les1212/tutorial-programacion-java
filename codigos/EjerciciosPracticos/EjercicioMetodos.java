public class EjercicioMetodos {

     public static int mayor(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) {
        int resultado = mayor(15, 8);
        System.out.println("El número mayor es: " + resultado);
    }
}