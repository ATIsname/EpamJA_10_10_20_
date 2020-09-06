package Collections;

public class CollectionsMain {

    public static void main(String[] args) {
        Vegetable tomato = new Vegetable("Red tomato", 18);
        Vegetable cucumber = new Vegetable("Cucumber", 16);
        Vegetable bulbOnion = new Vegetable("Bulb onion", 40);
        Vegetable carrot = new Vegetable("Carrot", 35);

        IngredientAndItsServings tomatoIngredient = new IngredientAndItsServings(tomato, 3);
        IngredientAndItsServings cucumberIngredient = new IngredientAndItsServings(cucumber, 2);
        IngredientAndItsServings bulbOnionIngredient = new IngredientAndItsServings(bulbOnion, 1);
        IngredientAndItsServings carrotIngredient = new IngredientAndItsServings(carrot, 1);

        Salad simpleSalad = new Salad();
        simpleSalad.AddIngredientAndItsServingsToList(tomatoIngredient);
        simpleSalad.AddIngredientAndItsServingsToList(cucumberIngredient);
        simpleSalad.AddIngredientAndItsServingsToList(bulbOnionIngredient);
        simpleSalad.AddIngredientAndItsServingsToList(carrotIngredient);
        simpleSalad.ShowIngredients();
        System.out.println(simpleSalad.getCalorieContent() + " calories");
        System.out.println(simpleSalad.GetSaladWeightInKg() + " gram");
        System.out.println(simpleSalad.GetIngredientsWhichCaloriesValueFitsInRange(0,20));
        simpleSalad.SortByCaloriesOfIngredient();
        System.out.println();
        simpleSalad.ShowIngredients();
        System.out.println();

        Chef GordonRamsay = new Chef(1, "Gordon Ramsay");
        GordonRamsay.MakeSalad(simpleSalad);

    }
}
