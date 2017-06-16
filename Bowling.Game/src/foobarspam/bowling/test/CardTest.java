package foobarspam.bowling.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

	@Test
	public void TotalScoreHittingPins(){
		
		// Hitting pins total = 60
		String pins = "12345123451234512345";
		int total = 60;
		
		ScoreCard scoreCard = new ScoreCard(pins);
		
		calculateScore(scoreCard);
		
		assertEquals(total, scoreCard.getTotalScore());			
	}

}
