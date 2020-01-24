package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void shouldInstantiateShelter() {
        VirtualPetShelter shelter = new VirtualPetShelter();
    }

    @Test
    public void shouldInsertMultiplePets() {
        HashMap<String, VirtualPet> petHashMap = shelter.getPets();

        for (VirtualPet pet : petHashMap.values()) {
            assertEquals("John", pet.getName());
        }
    }

    @Test
    public void shouldAddAPetToShelter() {
        shelter.getPets().put("John", new VirtualPet());
        assertEquals(1, shelter.getPets().size());
        assertEquals(2, shelter.getPets().get("John").getAge());

        shelter.getPets().put("Colin", new VirtualPet("Colin"));
        assertEquals(2, shelter.getPets().size());
        assertEquals(2, shelter.getPets().get("Colin").getAge());

    }

    @Test
    public void shouldSayTheirName() {
        String result = pet.getName();

        assertEquals("John", result);
    }

    @Test
    public void shouldHaveTenHunger() {
        int result = pet.getHunger();

        assertEquals(20, result);
    }

    @Test
    public void shouldFeedAllShelterPets() {
        shelter.getPets().put("John", new VirtualPet());
        shelter.getPets().put("bob", new VirtualPet("bob"));
        shelter.feedAllPets();
    }

    @Test
    public void shouldTickAllPets() {
        shelter.getPets().put("John", new VirtualPet());
        shelter.getPets().put("bob", new VirtualPet("bob"));
        assertEquals(20, shelter.getPets().get("John").getHunger());
        assertEquals(50, shelter.getPets().get("bob").getHappiness());
        shelter.tickAllPets();
        assertEquals(23, shelter.getPets().get("John").getHunger());
        assertEquals(47, shelter.getPets().get("bob").getHappiness());


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
        assertEquals(20, pet.getHunger());

        int result = pet.increaseHunger();

        assertEquals(23, result);
    }

    @Test
    public void shouldDecreaseHappiness() {
        assertEquals(50, pet.getHappiness());

        int result = pet.decreaseHappiness();

        assertEquals(47, result);
    }

    @Test
    public void shouldFeedThePet() {
        assertEquals(20, pet.getHunger());

        int result = pet.feed();

        assertEquals(0, pet.getHunger());
    }

    @Test
    public void shouldPlayWithThePet() {
        assertEquals(50, pet.getHappiness());

        int result = pet.play();

        assertEquals(70, pet.getHappiness());
    }

    @Test
    public void shouldTick() {
        assertEquals(20, pet.getHunger());
        assertEquals(50, pet.getHappiness());

        pet.tick();

        assertEquals(23, pet.getHunger());
        assertEquals(47, pet.getHappiness());
    }

    @Test
    public void petsShouldBeSad() {

        assertEquals("Happy", pet.getFeelings());

        pet.tick();

        assertEquals("Lonely", pet.getFeelings());
    }

    @Test
    public void petShouldBeOrganicDog() {
        VirtualPet organicDog = new OrganicDog();

        assertTrue(organicDog instanceof Organic);
    }

    @Test
    public void petShouldBeOrganicCat() {
        VirtualPet organicCat = new OrganicCat();

        assertTrue(organicCat instanceof Organic);
    }

    @Test
    public void petShouldBeRoboticDog() {
        VirtualPet roboticDog = new RoboticDog();

        assertTrue(roboticDog instanceof Robotic);
    }

    @Test
    public void petShouldBeRoboticCat() {
        Robotic roboticCat = new RoboticCat();

        assertTrue(roboticCat instanceof Robotic);
    }

}
