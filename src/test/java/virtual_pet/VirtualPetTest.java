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

        System.out.println("hi");

        assertEquals("John", result);
    }

    @Test
    public void shouldHaveTenHunger() {
        VirtualPet pet = new VirtualPet();

        int result = pet.getHunger();

        assertEquals(10, result);
    }

    @Test
    public void shouldSayTheirFeelings() {
        VirtualPet pet = new VirtualPet();

        String result = pet.getFeelings();

        assertEquals("Happy", result);
    }

    @Test
    public void shouldHaveDefaultHappiness() {
        VirtualPet pet = new VirtualPet();

        int result = pet.getHappiness();

        assertEquals(50, result);
    }

    @Test
    public void shouldHaveDefaultColor() {
        VirtualPet pet = new VirtualPet();

        String result = pet.getColor();

        assertEquals("Brown", result);
    }

    @Test
    public void shouldHaveDefaultAge() {
        VirtualPet pet = new VirtualPet();

        int result = pet.getAge();

        assertEquals(2, result);
    }

    @Test
    public void shouldIncreaseHunger() {
        VirtualPet pet = new VirtualPet();

        assertEquals(10, pet.getHunger());

        int result = pet.increaseHunger();

        assertEquals(13, result);
    }

    @Test
    public void shouldDecreaseHappiness() {
        VirtualPet pet = new VirtualPet();

        assertEquals(50, pet.getHappiness());

        int result = pet.decreaseHappiness();

        assertEquals(45, result);
    }

    @Test
    public void shouldFeedThePet() {
        VirtualPet pet = new VirtualPet();

        assertEquals(10, pet.getHunger());

        int result = pet.feed();

        assertEquals(5, pet.getHunger());
    }

    @Test
    public void shouldPlayWithThePet() {
        VirtualPet pet = new VirtualPet();

        assertEquals(50, pet.getHappiness());

        int result = pet.play();

        assertEquals(60, pet.getHappiness());
    }
}
