package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    private VirtualPet pet;
    private VirtualPetShelter shelter;

    @BeforeEach
    void setUp() {
        pet = new VirtualPet();
        shelter = new VirtualPetShelter();
    }

    @Test
    public void shouldInstantiate() {
        VirtualPet pet = new VirtualPet();
    }

    @Test
    public void shouldInstantiateShelter(){
        VirtualPetShelter shelter = new VirtualPetShelter();
    }

    @Test
    public void shouldInsertMultiplePets() {
        List<VirtualPet> list = shelter.getPets();

        for (VirtualPet pet : list) {
            assertEquals("John", pet.getName());
        }
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

        assertEquals(47, result);
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
    @Test
    public void shouldTick(){

        assertEquals(10, pet.getHunger());

        assertEquals(50, pet.getHappiness());

         pet.tick();

        assertEquals(13, pet.getHunger());
        assertEquals(47, pet.getHappiness());
    }

}
