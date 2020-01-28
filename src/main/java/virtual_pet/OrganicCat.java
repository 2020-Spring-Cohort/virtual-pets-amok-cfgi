package virtual_pet;

public class OrganicCat extends Organic {

    public OrganicCat(String name) {
        super(name);
        type = "Cat";
    }

    @Override
    protected void decreaseCleanliness() {
        petCleanliness -= 1;
        if (petCleanliness < 0) {
            petCleanliness = 0;
        }
    }
}