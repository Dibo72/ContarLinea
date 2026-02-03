import java.io.BufferedReader;
import java.io.FileReader;
public class ContarLinea {
    public static void main(String[] args) {
        int contador = 0;
        System.out.println("Palabra a contar: Pastel");
        try(BufferedReader lector = new BufferedReader(new FileReader("archivo.txt"))){
            String linea;
            System.out.println("Archivo:");
            while ((linea = lector.readLine()) != null){
                System.out.println(linea);
                linea = linea.toLowerCase();
                if (linea.contains("pastel")){
                    contador ++;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("Numero de lineas que contienen la palabra: " + contador);
    }
}