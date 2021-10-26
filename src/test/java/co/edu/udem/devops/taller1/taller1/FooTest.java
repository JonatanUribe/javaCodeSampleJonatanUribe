package co.edu.udem.devops.taller1.taller1;

import co.edu.udem.devops.taller1.taller1.controller.FooController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooTest {
    @Test
    void Foo(){
        FooController fooController = new FooController();
        Foo foo = fooController.findById(1);
        Foo foo2 = new Foo();
        foo2.id = 1;
        foo2.name = "estefa";
        assertEquals(foo2.id,foo.id);
        assertEquals(foo2.name,foo.name);
    }
}
