package model;

import utils.MathUtils;
import utils.UIUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DataSource {
    List<String> words;

    public DataSource (String filePath) {
        try {
            words = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            UIUtils.outInput("Error during reading file!");
        }
    }

    public String getRandomWord () {
        return words.get(MathUtils.generateRandomNumber(words.size()));
    }
}
