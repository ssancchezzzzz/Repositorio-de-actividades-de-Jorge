package ejercicios_de_seguridad;

import java.util.List;

public class AnalizadorPassword {

    public static boolean validar(String pass) {

        if (pass.length() < 12) {
            System.out.println("Debe tener mínimo 12 caracteres");
            return false;
        }

        boolean mayus = false;
        boolean numero = false;
        boolean simbolo = false;

        for(char c : pass.toCharArray()){

            if(Character.isUpperCase(c)) mayus = true;
            if(Character.isDigit(c)) numero = true;

            if("!@#$%&*?".indexOf(c) >= 0)
                simbolo = true;
        }

        if(!mayus) System.out.println("Falta mayúscula");
        if(!numero) System.out.println("Falta número");
        if(!simbolo) System.out.println("Falta símbolo");

        return mayus && numero && simbolo;
    }

    public static int puntuacion(String pass){

        int puntos = 0;

        int len = pass.length();

        if(len < 8) puntos -= 2;
        else if(len <= 11) puntos += 1;
        else if(len <= 15) puntos += 2;
        else puntos += 3;

        if(pass.matches(".*[a-z].*")) puntos++;
        if(pass.matches(".*[A-Z].*")) puntos++;
        if(pass.matches(".*[0-9].*")) puntos++;
        if(pass.matches(".*[!@#$%&*?].*")) puntos++;

        String[] patrones = {
                "123","abc","qwerty","aaaa","1111","password","admin"
        };

        int encontrados = 0;

        for(String p : patrones){

            if(pass.toLowerCase().contains(p))
                encontrados++;
        }

        if(encontrados == 1) puntos -= 2;
        if(encontrados > 1) puntos -= 3;

        return puntos;
    }

    public static void clasificar(int puntos){

        if(puntos <= 3)
            System.out.println("Débil");

        else if(puntos <= 5)
            System.out.println("Media");

        else if(puntos <= 7)
            System.out.println("Fuerte");

        else
            System.out.println("Muy fuerte");
    }
}
