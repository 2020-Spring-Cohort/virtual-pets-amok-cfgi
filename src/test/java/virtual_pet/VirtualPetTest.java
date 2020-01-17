package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void shouldInstantiate() {
        VirtualPet pet = new VirtualPet();
    }

    @Test
    public void shouldSayTheirName() {
        VirtualPet pet = new VirtualPet();

        String result = pet.getName();

        assertEquals("John", result);
    }

    @Test
    public void shouldHaveTenHunger() {
        VirtualPet pet = new VirtualPet();

        int result = pet.getHunger();

        assertEquals(10, result);
    }
}
