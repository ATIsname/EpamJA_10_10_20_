package training.Collections;

public class CollectionsMain {

    public static void main(String[] args) {
        Vegetable tomato = new Vegetable("Red tomato", 18, GroupOfVegetable.FRUIT);
        Vegetable cucumber = new Vegetable("Cucumber", 16, GroupOfVegetable.FRUIT);
        Vegetable bulbOnion = new Vegetable("Bulb onion", 40, GroupOfVegetable.FRUIT);
        Vegetable carrot = new Vegetable("Carrot", 35, GroupOfVegetable.FRUIT);

        VegetableIngredientAndItsServings tomatoIngredient =
                new VegetableIngredientAndItsServings(tomato, 3);
        VegetableIngredientAndItsServings cucumberIngredient =
                new VegetableIngredientAndItsServings(cucumber, 2);
        VegetableIngredientAndItsServings bulbOnionIngredient =
                new VegetableIngredientAndItsServings(bulbOnion, 1);
        VegetableIngredientAndItsServings carrotIngredient =
                new VegetableIngredientAndItsServings(carrot, 1);

        Salad simpleSalad = new Salad();
        simpleSalad.AddIngredientAndItsServingsToList(tomatoIngredient);
        simpleSalad.AddIngredientAndItsServingsToList(cucumberIngredient);
        simpleSalad.AddIngredientAndItsServingsToList(bulbOnionIngredient);
        simpleSalad.AddIngredientAndItsServingsToList(carrotIngredient);
        simpleSalad.ShowIngredients();
        System.out.println(simpleSalad.getCalorieContent() + " calories");
        System.out.println(simpleSalad.GetSaladWeightInKg() + " gram");
        System.out.println(simpleSalad.GetIngredientsWhichCaloriesValueFitsInRange(0, 20));
        simpleSalad.SortByCaloriesOfIngredient();
        System.out.println();
        simpleSalad.ShowIngredients();
        System.out.println();

        Chef GordonRamsay = new Chef(1, "Gordon Ramsay");
        GordonRamsay.MakeSalad(simpleSalad);

    }
}
