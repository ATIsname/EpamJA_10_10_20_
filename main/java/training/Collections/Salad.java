package training.Collections;


import java.util.ArrayList;
import java.util.List;

public class Salad {
    private ArrayList<VegetableIngredientAndItsServings> VegetableIngredientAndItsServingsObjectList;

    public Salad() {
        this.VegetableIngredientAndItsServingsObjectList = new ArrayList<VegetableIngredientAndItsServings>();
    }

    public Salad(ArrayList<VegetableIngredientAndItsServings> ingredientAndItsServingsObjectList) {
        this.VegetableIngredientAndItsServingsObjectList = ingredientAndItsServingsObjectList;
    }

    public double getCalorieContent() {
        double resultCalorieContent = 0;
        for (VegetableIngredientAndItsServings i :
                VegetableIngredientAndItsServingsObjectList) {
            resultCalorieContent += i.getCountOfServings() * i.getProductObject().getCalories();
        }
        return resultCalorieContent;
    }

    public List<VegetableIngredientAndItsServings> getVegetables() {
        return VegetableIngredientAndItsServingsObjectList;
    }

    public double GetSaladWeightInKg() {
        double resultWeight = 0;
        for (VegetableIngredientAndItsServings i :
                VegetableIngredientAndItsServingsObjectList) {
            resultWeight += i.getCountOfServings();
        }
        return resultWeight * 100;
    }

    public void AddIngredientAndItsServingsToList(VegetableIngredientAndItsServings ingredientAndItsServingsObject) {
        VegetableIngredientAndItsServingsObjectList.add(ingredientAndItsServingsObject);
    }

    public void RemoveIngredientAndItsServingsToList(VegetableIngredientAndItsServings ingredientAndItsServingsObject) {
        VegetableIngredientAndItsServingsObjectList.remove(ingredientAndItsServingsObject);
    }

    public void SortByNameOfIngredient() {
        VegetableIngredientAndItsServingsObjectList.sort((x1, x2) ->
                x1.getProductObject().getNameOfProduct().compareTo(x2.getProductObject().getNameOfProduct()));
    }

    public void SortByCountOfServingsOfIngredient() {
        VegetableIngredientAndItsServingsObjectList.sort((x1, x2) ->
                Double.compare(x1.getCountOfServings(), x2.getCountOfServings()));
    }

    public void SortByCaloriesOfIngredient() {
        VegetableIngredientAndItsServingsObjectList.sort((x1, x2) ->
                Double.compare(x1.getProductObject().getCalories(), x2.getProductObject().getCalories()));
    }

    public ArrayList<VegetableIngredientAndItsServings> GetIngredientsWhichCaloriesValueFitsInRange(double beginRange,
                                                                                                    double endRange) {
        ArrayList<VegetableIngredientAndItsServings> suitableVegetables = new ArrayList<VegetableIngredientAndItsServings>();
        for (VegetableIngredientAndItsServings i :
                VegetableIngredientAndItsServingsObjectList) {
            double caloriesValue = i.getProductObject().getCalories();
            if (caloriesValue > beginRange && caloriesValue < endRange) suitableVegetables.add(i);
        }
        return suitableVegetables;
    }

    public void ShowIngredients() {
        VegetableIngredientAndItsServingsObjectList.forEach(System.out::println);
    }
}
