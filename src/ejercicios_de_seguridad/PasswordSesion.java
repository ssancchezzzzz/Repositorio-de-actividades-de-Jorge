package ejercicios_de_seguridad;

import java.time.Duration;
import java.time.LocalDateTime;

public class PasswordSesion {

    private String passwordCifrado;
    private LocalDateTime fecha;

    public void crearSesion(String password) {

        fecha = LocalDateTime.now();

        String combinado = password + "|" + fecha.toString();

        passwordCifrado = CifradoTexto.encriptar(combinado);

        System.out.println("Sesion creada: " + passwordCifrado);
    }

    public void verificarSesion() {

        String desencriptado = CifradoTexto.desencriptar(passwordCifrado);

        String[] partes = desencriptado.split("\\|");

        String password = partes[0];
        LocalDateTime fechaSesion = LocalDateTime.parse(partes[1]);

        Duration tiempo = Duration.between(fechaSesion, LocalDateTime.now());

        if (tiempo.getSeconds() > 60) {

            System.out.println("Sesion caducada hace "
                    + tiempo.toMinutes() + " minutos y "
                    + (tiempo.getSeconds() % 60) + " segundos");

        } else {

            System.out.println("Password correcto: " + password);

        }
    }
}
