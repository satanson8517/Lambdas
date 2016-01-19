package functionals._02_fp4j.v_isolation;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import org.junit.Test;

public class TimingTest {
    @Test
    public void testTimed() throws Exception {

        final String description = "Supply a carrot";
        final Supplier<String> carrotSupplier = () -> "Carrot";
        final AtomicReference<String> recordedOutput = new AtomicReference<>();

        final String result = Timing.timed(description,
                recordedOutput::set,
                carrotSupplier);

        assert(recordedOutput.get().contains(description));
    }

}
