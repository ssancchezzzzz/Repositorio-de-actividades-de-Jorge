package ejercicios_de_seguridad;

public class Main {

    public static void main(String[] args) {

        String texto = "hola mundo, mi nombre es Pablo y este es mi ejercicio de extensión de programación";

        String cifrado = CifradoTexto.encriptar(texto);

        System.out.println(cifrado);

        System.out.println(CifradoTexto.desencriptar(cifrado));


        DniAscii.convertir("02730964V");


        System.out.println(
                ValidadorDNI.validar("02730964V")
        );


        AnalizadorPassword.validar("Thepowertero|34!");

        int puntos = AnalizadorPassword.puntuacion("Thepowertero|34!");

        AnalizadorPassword.clasificar(puntos);
    }
}