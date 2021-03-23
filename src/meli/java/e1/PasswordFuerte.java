package meli.java.e1;

public class PasswordFuerte extends Password{
    /*
        (?=.*[0-9]) a digit must occur at least once
        (?=.*[a-z]) a lower case letter must occur at least once
        (?=.*[A-Z]) an upper case letter must occur at least once
        (?=.*[@#$%^&+=]) a special character must occur at least once
        (?=\\S+$) no whitespace allowed in the entire string
        .{8,} at least 8 characters
     */
    public PasswordFuerte() {
        super("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
        setFormat("La contraseña debe contener al menos un número, un caracter especial, una mayúscula, " +
                "una minúscula y una longitud mínima de 8 caracteres.");
    }

    public static void main(String[] args) {
        Password pass1 = new PasswordFuerte();
        // PASA
        try {
            pass1.setValue("Probando%123");
            System.out.println(pass1);
        } catch (Exception E) {
            System.out.println(E.toString());
        }
        // No PASA
        try {
            pass1.setValue("Probando123");
            System.out.println(pass1);
        } catch (Exception E) {
            System.out.println(E.toString());
        }
    }
}
