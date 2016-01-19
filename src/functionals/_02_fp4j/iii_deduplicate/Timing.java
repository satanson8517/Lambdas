package functionals._02_fp4j.iii_deduplicate;

import java.util.Date;
import java.util.function.Supplier;

public class Timing {

    public static Double timed(String description, Supplier<Double> code) {
        final Date before = new Date();
        final Double result = code.get();
        final Long duration = new Date().getTime() - before.getTime();
        System.out.println(description + " took " + duration + " ms");
        return result;
    }
}
