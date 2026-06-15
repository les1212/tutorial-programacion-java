import java.io.BufferedReader;
import java.io.FileReader;

public class EjercicioLeerArchivo {
    public static void main(String[] args) {
        String archivo = "datos.csv";
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                System.out.println("--------------------------");
                System.out.println("Nombre: " + datos[0]);
                System.out.println("Edad: " + datos[1]);
                System.out.println("Ciudad: " + datos[2]);
            }
            br.close();
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
