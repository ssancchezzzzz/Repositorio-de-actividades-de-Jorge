package ejercicios_de_seguridad;

public class ValidadorDNI {

    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static boolean validar(String dni) {

        int numero = Integer.parseInt(dni.substring(0, 8));

        char letra = dni.charAt(8);

        int resto = numero % 23;

        char letraCorrecta = LETRAS.charAt(resto);

        return letra == letraCorrecta;
    }
}