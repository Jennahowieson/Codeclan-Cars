package vehicle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {
    Engine engine;

    @Before
    public void before(){
        engine = new Engine(120);
    }


    @Test
    public void canGetHorsepower() {
        assertEquals(120, engine.getHorsepower());
    }
}