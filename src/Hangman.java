import model.DataSource;
import model.Gamer;
import model.MaskedWord;
import utils.UIUtils;

public class Hangman {
    private Gamer gamer = new Gamer();
    private DataSource ds = new DataSource();
    private MaskedWord maskedWord = new MaskedWord();

    public void start() {
        String word = ds.getRandomWord();

        String letter = UIUtils.readInput("Please type a letter: ");

        if (letter.length() != 1) {
            System.out.println("You should enter only one letter!");


        }

        if(!word.contains(letter)) {
            System.out.println("There is not such letter in this word!");

            gamer.decreaseAttempts();
        } else {
            System.out.println("Letter is presented in this word!");


        }
    }
}
