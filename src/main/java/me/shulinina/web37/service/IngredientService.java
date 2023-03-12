package me.shulinina.web37.service;
import me.shulinina.web37.model.Ingredient;
public interface IngredientService {
    long addIngredient(Ingredient ingredient);
    default Ingredient getIngredient(long id) {
        return null;
    }
    Ingredient getAllIngredient();
    Ingredient editIngredient(long id, Ingredient ingredient);
    boolean deleteIngredient(long id);
    void deleteAllIngredient();
}