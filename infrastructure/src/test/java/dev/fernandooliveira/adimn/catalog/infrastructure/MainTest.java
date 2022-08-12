package dev.fernandooliveira.adimn.catalog.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testMaim(){
        Assertions.assertNotNull(new Main());
        Main.main(new String[]{});
    }

}