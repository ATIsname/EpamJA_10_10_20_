package training.Collections;

public class VegetableIngredientAndItsServings {
    private Vegetable productObject;
    private double countOfServings;

    public VegetableIngredientAndItsServings(Vegetable productObject, double countOfServings) {
        this.productObject = productObject;
        this.countOfServings = countOfServings;
    }

    public Vegetable getProductObject() {
        return productObject;
    }

    public double getCountOfServings() {
        return countOfServings;
    }

    @Override
    public String toString() {
        return "IngredientAndItsServings{" +
                "productObject=" + productObject +
                ", countOfServings=" + countOfServings +
                '}';
    }
}
