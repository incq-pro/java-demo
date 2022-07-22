package pro.incq.cleancode.kata.flashcard;

import java.util.List;

public class FlashCardGame {
    private int rightAnswers;

    public void playGame(List<FlashCard> cards) {
        if (cards.size() != 0) {
            rightAnswers += 1;
        }
    }

    public int getRightAnswers() {
        return rightAnswers;
    }

    public int getWrongAnswers() {
        return 0;
    }
}
