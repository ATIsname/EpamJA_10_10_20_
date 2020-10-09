package training.Collections;

public class Vegetable extends ProductForCooking {
    protected GroupOfVegetable groupOfVegetable;

    public Vegetable(String nameOfProduct, double calories, GroupOfVegetable groupOfVegetable) {
        super(nameOfProduct, calories);
        this.groupOfVegetable = groupOfVegetable;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "groupOfVegetable=" + groupOfVegetable +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", calories=" + calories +
                '}';
    }
}
