package patterns;

import java.util.List;

public class ImmutableAnimal {

    private final String species;
    private final int age;
    private final List<String> favouriteFoods;

    public ImmutableAnimal(String species, int age, List<String> favouriteFoods) {
        this.species = species;
        this.age = age;
        if (favouriteFoods == null) {
            throw new RuntimeException("Favourite Foods is Required");
        }
        this.favouriteFoods = favouriteFoods;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getFavouriteFood(int index) {
        return favouriteFoods.get(index);
    }

    public int getFavouriteFoodsCount() {
        return favouriteFoods.size();
    }
}
