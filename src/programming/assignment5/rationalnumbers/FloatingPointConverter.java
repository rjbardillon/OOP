package programming.assignment5.rationalnumbers;

import java.text.NumberFormat;
import java.text.DecimalFormat;

public class FloatingPointConverter {
    public String convertToFloatingPoint(double maxInteger) {
        NumberFormat formatter;
        formatter = new DecimalFormat("0.#####E0");
        return String.valueOf(formatter.format(maxInteger));
    }
}
