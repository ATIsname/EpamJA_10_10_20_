package training.Collections;

import java.util.Objects;

public abstract class ProductForCooking {
    protected static final int weightInGrams = 100;
    protected String nameOfProduct;
    protected double calories;

    public ProductForCooking(String nameOfProduct, double calories) {
        this.nameOfProduct = nameOfProduct;
        this.calories = calories;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "ProductForCooking{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", calories=" + calories +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductForCooking)) return false;
        ProductForCooking that = (ProductForCooking) o;
        return nameOfProduct.equals(that.nameOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfProduct);
    }
}
