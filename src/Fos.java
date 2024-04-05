import java.io.*;
import java.util.Random;

public class Fos {
    public static void main(String[] args) {
        String archivoOrigen = "C:\\Users\\alumno\\Desktop\\archivo_origen.txt";
        String archivoDestino = "C:\\Users\\alumno\\Desktop\\archivo_destino.txt";
        int longitudFrase = 100; // Longitud de la frase aleatoria

        try {
            // Genera una frase aleatoria con la longitud especificada
            String fraseAleatoria = generarFrase(longitudFrase);
            
            // Escribe la frase aleatoria en el archivo de origen
            FileWriter fw = new FileWriter(archivoOrigen);
            fw.write(fraseAleatoria);
            fw.close();

            // Copia el archivo de origen al archivo de destino
            copiarArchivo(archivoOrigen, archivoDestino);

            System.out.println("Archivos creados y copiados correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para generar una frase aleatoria de la longitud especificada
    private static String generarFrase(int longitud) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            sb.append(c);
        }
        return sb.toString();
    }

    // Método para copiar un archivo a otro
    private static void copiarArchivo(String origen, String destino) throws IOException {
        FileInputStream fis = new FileInputStream(origen);
        FileOutputStream fos = new FileOutputStream(destino);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }

        fis.close();
        fos.close();
    }
}

