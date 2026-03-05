package ejercicios_de_seguridad;

public class CifradoTexto {

    public static String encriptar(String texto) {

        String textoEncriptado = "";

        for (int i = 0; i < texto.length(); i++) {

            char c = texto.charAt(i);

            switch (Character.toLowerCase(c)) {

                case 'a':
                    textoEncriptado += "1";
                    break;
                case 'e':
                    textoEncriptado += "2";
                    break;
                case 'i':
                    textoEncriptado += "3";
                    break;
                case 'o':
                    textoEncriptado += "4";
                    break;
                case 'u':
                    textoEncriptado += "5";
                    break;

                default:

                    int ascii = (int) c;
                    ascii++;

                    char nuevo = (char) ascii;

                    textoEncriptado += nuevo;
            }
        }

        return textoEncriptado;
    }

    public static String desencriptar(String texto) {

        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {

            char c = texto.charAt(i);

            switch (c) {

                case '1':
                    resultado += "a";
                    break;
                case '2':
                    resultado += "e";
                    break;
                case '3':
                    resultado += "i";
                    break;
                case '4':
                    resultado += "o";
                    break;
                case '5':
                    resultado += "u";
                    break;

                default:

                    int ascii = (int) c;
                    ascii--;

                    resultado += (char) ascii;
            }
        }

        return resultado;
    }
}