package Contornos;

public class PasswordValidator {
    public static boolean isValid(String password) {
        if (password.length() < 8) { // arreglado que antes decia menor o igual a ocho
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) { // ARREGLADO QUE PONE LOWERCASE NO UPPERCASE
                hasUpperCase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        return hasUpperCase && hasDigit; // arreglado el return
    }

}

