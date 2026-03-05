package ejercicios_de_seguridad;

public class DniAscii {

    public static void convertir(String dni) {

        for (int i = 0; i < dni.length(); i++) {

            char c = dni.charAt(i);

            int ascii = (int) c;

            System.out.println(c + " ------> " + ascii);
        }
    }
}