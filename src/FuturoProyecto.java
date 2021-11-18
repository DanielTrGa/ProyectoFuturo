public class FuturoProyecto {

    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] + ": " + veredicto (args[1], args[2]));

    }
    static String veredicto (String valor1, String valor2) {

        if (valor1.equals(valor2)) {
            return "Bien, Pero una hora de estudio cada módulo puede ser insuficiente.";
        }

        if (Integer.valueOf(valor1) > Integer.valueOf(valor2)) {
            //He tenido que cambiar el simbolo de "<" a ">" para que funcione la lógica (sino aún estudiando más horas qué asignaturas pone que no dedicas las horas suficientes)
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        else
            return "Ideal. Trabajas los contenidos en casa.";
    }
}