package meli.java.e1;

public class PasswordMedia extends Password{
    /*
        (?=.*[0-9]) a digit must occur at least once
        (?=.*[a-z]) a lower case letter must occur at least once
        (?=.*[A-Z]) an upper case letter must occur at least once
        (?=\\S+$) no whitespace allowed in the entire string
        .{8,} at least 8 characters
     */
    public PasswordMedia() {
        super("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}");
        setFormat("La contraseña debe contener al menos un número, una mayúscula, " +
                "una minúscula y una longitud mínima de 8 caracteres.");
    }

    public static void main(String[] args) {
        Password pass2 = new PasswordMedia();
        // PASA
        try {
            pass2.setValue("Probando123");
            System.out.println(pass2);
        } catch (Exception E) {
            System.out.println(E.toString());
        }
        // NO PASA
        try {
            pass2.setValue("probando123");
            System.out.println(pass2);
        } catch (Exception E) {
            System.out.println(E.toString());
        }
    }
}
