import java.util.ArrayList;

public class ListaEstudiantes {

    public static void main(String[] args) {

        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Juan");
        estudiantes.add("María");
        estudiantes.add("Pedro");
        estudiantes.add("Ana");
        estudiantes.add("Carlos");

        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
