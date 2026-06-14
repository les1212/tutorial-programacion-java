import java.io.BufferedReader;
import java.io.FileReader;

public class ManejoArchivos {

    public static void main(String[] args) {
        String archivo = "datos.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}