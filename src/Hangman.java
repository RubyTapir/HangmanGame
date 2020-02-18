import model.DataSource;
import model.Gamer;
import model.MaskedWord;
import utils.UIUtils;

public class Hangman {
    private Gamer gamer = new Gamer("Yura");
    private DataSource ds = new DataSource("c:/Users/Yury_Rubis/Downloads/words.txt");
    private MaskedWord maskedWord;

    public void start() {
        String word = ds.getRandomWord();

        maskedWord = new MaskedWord(word);

        while (gamer.getAttempts() > 0 && !word.equalsIgnoreCase(maskedWord.getMaskedWord())) {
            UIUtils.outInput(maskedWord.getMaskedWord());

            String letter = UIUtils.readInput("Please type a letter: ");

            if (letter.length() != 1) {
                UIUtils.outInput("You should enter only one letter!");

                continue;

            }

            if (!word.contains(letter)) {
                UIUtils.outInput("There is not such letter in this word!");

                gamer.decreaseAttempts();
            } else {
                UIUtils.outInput("Letter is presented in this word!");

                maskedWord.addLetter(letter);

            }
        }

        UIUtils.outInput("Game over! Dear " + gamer.getName() + " you " + (word.equalsIgnoreCase(maskedWord.getMaskedWord()) ? "win" : "lose"));
    }
}
