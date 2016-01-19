package lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michal Nedbálek <michal.nedbalek@avg.com> on 05/01/2016
 */
public class DoubleColon implements Runnable {

    @Override
    public void run() {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

//        names.forEach(System.out::println);
        names.forEach(DoubleColon::sout);
    }
    
    private static void sout(Object s){
        System.out.println(s);
    }

}
