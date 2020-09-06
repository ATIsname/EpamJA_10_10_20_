package Collections;

import java.util.Comparator;

public class Vegetable extends ProductForCooking {
    public Vegetable(String nameOfProduct, double calories) {
        super(nameOfProduct, calories);
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", calories=" + calories +
                '}';
    }
}
