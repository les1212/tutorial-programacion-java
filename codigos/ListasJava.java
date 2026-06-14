import java.util.ArrayList;

public class ListasJava {

    public static void main(String[] args) {

        ArrayList<String> productos = new ArrayList<>();

        productos.add("Arroz");
        productos.add("Leche");
        productos.add("Pan");
        productos.add("Azucar");

        System.out.println("Lista de productos:");

        for (String producto : productos) {
            System.out.println(producto);
        }
    }
}