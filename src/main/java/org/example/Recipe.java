package org.example;

import java.util.HashMap;
import java.util.Map;

class Recipe {
    private Map<String, Integer> ingredientList;
    private String requirement;
    private String prepMethod;

    public Recipe() {
        this.ingredientList = new HashMap<>();
    }

    public void addIngredient(String ingredient, int quantity) {
        this.ingredientList.put(ingredient, quantity);}

    public void removeIngredient(String ingredient) {
        this.ingredientList.remove(ingredient);}

    public Map<String, Integer> getIngredientList() {
        return this.ingredientList;}

    public String getRequirement() {return requirement;}

    public void setRequirement(String requirement) {this.requirement = requirement;}

    public String getPrepMethod() {return prepMethod;}

    public void setPrepMethod(String prepMethod) {this.prepMethod = prepMethod;}

    @Override
    public String toString() {
        return "Recipe{" +
                "ingredientList=" + ingredientList +
                ", requirement='" + requirement + '\'' +
                ", prepMethod='" + prepMethod + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Recipe recipe = new Recipe();

        recipe.addIngredient("Milk", 200);
        recipe.addIngredient("Cheese", 100);
        recipe.setPrepMethod("Baking");
        recipe.setRequirement("Mixer");

        System.out.println(recipe);

    }
}