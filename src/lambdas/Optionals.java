package lambdas;

import java.util.Optional;

/**
 *
 * @author Michal Nedbálek <michal.nedbalek@avg.com> on 05/01/2016
 */
public class Optionals implements Runnable {

    @Override
    public void run() {
        Integer value1 = null;
        Integer value2 = null;

        //Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);

        //Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.ofNullable(value2);
        System.out.println(sum(a, b));
    }

    static Integer sum(Optional<Integer> a, Optional<Integer> b) {

        //Optional.isPresent - checks the value is present or not
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.orElse - returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.orElse(0);

        //Optional.get - gets the value, value should be present
        Integer value2 = b.orElse(0);
        return value1 + value2;
    }

}
