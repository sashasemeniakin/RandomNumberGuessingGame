
//inheritance or interface
public class RandomGuess implements Guess {

    int randomNumber;

    public RandomGuess(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public boolean isCorrect(int guess) {
        return guess == randomNumber;
    }

    public boolean isHigher(int guess) {
        if (randomNumber > guess) {
            return true;
        }
        return false;
    }
}
