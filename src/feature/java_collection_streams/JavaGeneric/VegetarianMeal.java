package feature.java_collection_streams.JavaGeneric;

public class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }

    public boolean isValid() {
        return true;
    }
}