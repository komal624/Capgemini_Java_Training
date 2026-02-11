package feature.java_collection_streams.JavaGeneric;

public class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void serveMeal() {
        System.out.println("Serving " + mealPlan.getMealType() + " Meal");
    }
}