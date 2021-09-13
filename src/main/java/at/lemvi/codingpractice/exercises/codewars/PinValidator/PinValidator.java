package at.lemvi.codingpractice.exercises.codewars.PinValidator;

public class PinValidator {
    public static boolean validatePin(String pin) {
        if(pin.matches("\\d{6}|\\d{4}"))
            return true;
        return false;
    }
}
