package Collections;

import java.util.Comparator;

public class IngredientAndItsServings {
    private Vegetable productObject;
    private double countOfServings;

    public Vegetable getProductObject() {
        return productObject;
    }

    public double getCountOfServings() {
        return countOfServings;
    }

    public IngredientAndItsServings(Vegetable productObject, double countOfServings) {
        this.productObject = productObject;
        this.countOfServings = countOfServings;
    }

    @Override
    public String toString() {
        return "IngredientAndItsServings{" +
                "productObject=" + productObject +
                ", countOfServings=" + countOfServings +
                '}';
    }
}
