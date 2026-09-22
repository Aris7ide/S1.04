public class CalculoDni {

    static int dni = ConsoleReader.readInt("Escribe los 8 numeros del DNI");
    private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static String calculateDni() {
        String dniFull;
        char finalChar;

        int numberChar = dni % 23;
        finalChar = LETRAS_DNI.charAt(numberChar);

        dniFull = String.valueOf(dni) + finalChar;
        return dniFull;
    }

}
