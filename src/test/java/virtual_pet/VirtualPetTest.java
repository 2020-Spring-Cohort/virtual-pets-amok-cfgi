package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    private VirtualPet pet;

    @BeforeEach
    void setUp() {
        pet = new VirtualPet();
    }

    @Test
    public void shouldInstantiate() {
        VirtualPet pet = new VirtualPet();
    }

    @Test
    public void shouldSayTheirName() {
        

        String result = pet.getName();

        System.out.println("hi");

        assertEquals("John", result);
    }

    @Test
    public void shouldHaveTenHunger() {
    

        int result = pet.getHunger();

        assertEquals(10, result);
    }

    @Test
    public void shouldSayTheirFeelings() {


        String result = pet.getFeelings();

        assertEquals("Happy", result);
    }

    @Test
    public void shouldHaveDefaultHappiness() {


        int result = pet.getHappiness();

        assertEquals(50, result);
    }

    @Test
    public void shouldHaveDefaultColor() {


        String result = pet.getColor();

        assertEquals("Brown", result);
    }

    @Test
    public void shouldHaveDefaultAge() {


        int result = pet.getAge();

        assertEquals(2, result);
    }

    @Test
    public void shouldIncreaseHunger() {


        assertEquals(10, pet.getHunger());

        int result = pet.increaseHunger();

        assertEquals(13, result);
    }

    @Test
    public void shouldDecreaseHappiness() {

        assertEquals(50, pet.getHappiness());

        int result = pet.decreaseHappiness();

        assertEquals(45, result);
    }

    @Test
    public void shouldFeedThePet() {


        assertEquals(10, pet.getHunger());

        int result = pet.feed();

        assertEquals(5, pet.getHunger());
    }

    @Test
    public void shouldPlayWithThePet() {


        assertEquals(50, pet.getHappiness());

        int result = pet.play();

        assertEquals(60, pet.getHappiness());
    }
}
