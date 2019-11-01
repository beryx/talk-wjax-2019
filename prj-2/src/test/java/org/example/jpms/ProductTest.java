package org.example.jpms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    public void testToString() {
        Product p = new Product(33, "spaghetti", 2.15);
        Assertions.assertEquals("spaghetti: 2.15", p.toString());
        System.out.printf("\n\nExecuted on the module-path: %b\n",
                            ProductTest.class.getModule().isNamed());
    }
}
