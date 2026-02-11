package feature.java_collection_streams.JavaGeneric;

public class MealApp {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal =
                new Meal<>(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                new Meal<>(new VeganMeal());

        vegMeal.serveMeal();
        veganMeal.serveMeal();
    }
}