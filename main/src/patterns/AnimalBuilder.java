package patterns;

import java.util.List;

public class AnimalBuilder {

    private String species;
    private int age;
    private List<String> favouriteFoods;


    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }

    public AnimalBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public AnimalBuilder setFavouriteFoods(List<String> favouriteFoods) {
        this.favouriteFoods = favouriteFoods;
        return this;
    }

    public ImmutableAnimal build() {
        return new ImmutableAnimal(species, age, favouriteFoods);
    }

}
