import java.io.BufferedWriter;
import java.io.FileWriter;

public class EjemploEscribirArchivo {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt", true));
            bw.write("Nueva linea de texto");
            bw.newLine();
            bw.close();
            System.out.println("Archivo escrito correctamente.");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
