package Collections;


import java.util.*;

public class Salad {
    private ArrayList<IngredientAndItsServings> ingredientAndItsServingsObjectList;

    public double getCalorieContent() {
        double resultCalorieContent = 0;
        for (IngredientAndItsServings i:
             ingredientAndItsServingsObjectList) {
            resultCalorieContent+=i.getCountOfServings()*i.getProductObject().getCalories();
        }
        return resultCalorieContent;
    }

    public List<IngredientAndItsServings> getVegetables() {
        return ingredientAndItsServingsObjectList;
    }

    public double GetSaladWeightInKg() {
        double resultWeight = 0;
        for (IngredientAndItsServings i:
             ingredientAndItsServingsObjectList) {
            resultWeight+=i.getCountOfServings();
        }
        return resultWeight*100;
    }

    public Salad() {
        this.ingredientAndItsServingsObjectList = new ArrayList<IngredientAndItsServings>();
    }

    public Salad(ArrayList<IngredientAndItsServings> ingredientAndItsServingsObjectList) {
        this.ingredientAndItsServingsObjectList = ingredientAndItsServingsObjectList;
    }

    public void AddIngredientAndItsServingsToList(IngredientAndItsServings ingredientAndItsServingsObject){
        ingredientAndItsServingsObjectList.add(ingredientAndItsServingsObject);
    }

    public void RemoveIngredientAndItsServingsToList(IngredientAndItsServings ingredientAndItsServingsObject){
        ingredientAndItsServingsObjectList.remove(ingredientAndItsServingsObject);
    }

    public void SortByNameOfIngredient(){
        ingredientAndItsServingsObjectList.sort((x1,x2) -> x1.getProductObject().getNameOfProduct().compareTo(x2.getProductObject().getNameOfProduct()));
    }

    public void SortByCountOfServingsOfIngredient(){
        ingredientAndItsServingsObjectList.sort((x1,x2) -> Double.compare(x1.getCountOfServings(), x2.getCountOfServings()));
    }

    public void SortByCaloriesOfIngredient(){
        ingredientAndItsServingsObjectList.sort((x1,x2) -> Double.compare(x1.getProductObject().getCalories(), x2.getProductObject().getCalories()));
    }

    public ArrayList<IngredientAndItsServings> GetIngredientsWhichCaloriesValueFitsInRange(double beginRange, double endRange){
        ArrayList<IngredientAndItsServings> suitableVegetables = new ArrayList<IngredientAndItsServings>();
        for (IngredientAndItsServings i:
                ingredientAndItsServingsObjectList) {
            double caloriesValue = i.getProductObject().getCalories();
            if(caloriesValue > beginRange && caloriesValue < endRange) suitableVegetables.add(i);
        }
        return suitableVegetables;
    }

    public void ShowIngredients(){
        ingredientAndItsServingsObjectList.forEach(System.out::println);
    }
}
