package dev.fernandooliveira.adimn.catalog.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserCaseTest {

    @Test
    public void testCreateUserCase(){
        Assertions.assertNotNull(new UserCase());
        Assertions.assertNotNull(new UserCase().execute());
    }

}