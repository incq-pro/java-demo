package pro.incq.cleancode.kata.flashcard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class FlashCardGameTest {


    @Test
    public void rightAndWrongShouldBeZeroIfGamePlayWithNoCards() throws Exception {
        FlashCardGame flashCardGame = new FlashCardGame();
        List<FlashCard> emptyList = new ArrayList<>();
        flashCardGame.playGame(emptyList);

        assertEquals(0, flashCardGame.getRightAnswers());
        assertEquals(0, flashCardGame.getWrongAnswers());
    }

    @Test
    public void rightShouldBeOneIfOneRightAnswer() throws Exception {
        FlashCard card = new FlashCard("Q", "A");
        List<FlashCard> cards = new ArrayList<>();
        cards.add(card);
        FlashCardGame flashCardGame = new FlashCardGame();
        flashCardGame.playGame(cards);
        assertEquals(1, flashCardGame.getRightAnswers());
        assertEquals(0, flashCardGame.getWrongAnswers());
    }

}