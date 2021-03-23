package meli.java.e1;

public class PasswordSimple extends Password{
    /*
        (?=\\S+$) no whitespace allowed in the entire string
        .{8,} at least 8 characters
     */
    public PasswordSimple() {
        super("(?=\\S+$).{8,}");
        setFormat("La contraseña debe contener una longitud mínima de 8 caracteres.");
    }

    public static void main(String[] args) {
        Password pass3 = new PasswordSimple();
        // PASA
        try {
            pass3.setValue("probando");
            System.out.println(pass3);
        } catch (Exception E) {
            System.out.println(E.toString());
        }
        // NO PASA
        try {
            pass3.setValue("prbando");
            System.out.println(pass3);
        } catch (Exception E) {
            System.out.println(E.toString());
        }
    }
}
