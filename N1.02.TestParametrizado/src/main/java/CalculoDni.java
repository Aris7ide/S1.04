public class CalculoDni {

    private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    public char calculateDniLetter(int dni) {
        char finalChar;

        int numberChar = dni % 23;
        finalChar = LETRAS_DNI.charAt(numberChar);

        return finalChar;
    }

}
