import java.util.ArrayList;

public class ModificarLista {
    public static void main(String[] args) {

        ArrayList<String> colores = new ArrayList<>();

        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Amarillo");

        colores.set(1, "Naranja");
        colores.remove(2);

        System.out.println("Colores finales:");
        for (String color : colores) {
            System.out.println(color);
        }

        System.out.println("Total de colores: " + colores.size());
    }
}
