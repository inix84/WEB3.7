package me.shulinina.web37.service;
import java.io.File;
import java.nio.file.Path;
public interface RecipeFilesService {
    boolean saveRecipesToFile(String json);
    String readRecipesFromFile();
    File getFile();
    Path createTempFile(String suffix);
    boolean cleanRecipesFile();
}