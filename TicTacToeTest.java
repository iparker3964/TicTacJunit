package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
	private TicTacToeModel model;
	
	@Before
    public void setup() {
		model = new TicTacToeModel();
    }
	@Test
	public void testInitialBoardIsEmpty() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				assertEquals("", model.getMark(i, j));
			}
		}
	}
	
	@Test
	public void testMarkXInUpperRightCorner() {
		model.makeMark("X", 0, 2);
		assertEquals("X", model.getMark(0, 2));
		
	}
	
	@Test
	public void testMarkOInBottomLeftCorner() {
		model.makeMark("O", 2, 0);
		assertEquals("O", model.getMark(2, 0));
	}
	
	@Test
	public void testUnableToMarkOverExistingMark() {
		model.makeMark("X", 1, 1);
		model.makeMark("O", 1, 1);
		assertEquals("X", model.getMark(1, 1));
	}
	
	@Test
	public void testGameIsNotOverAfterTheFirstMark() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
		model.makeMark("X", 0, 0);
		model.makeMark("X", 0, 1 );
		model.makeMark("X", 0, 2);
		assertTrue(model.checkForHorizontalWinner());
	}
	
	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() {
		model.makeMark("O", 0, 0);
		model.makeMark("X", 0, 1 );
		model.makeMark("X", 0, 2);
		model.makeMark("X", 1, 0);
		model.makeMark("O", 1, 1);
		model.makeMark("O", 1, 2 );
		model.makeMark("O", 2, 0);
		model.makeMark("O", 2, 1);
		model.makeMark("X", 2, 2 );
		assertTrue(model.checkForNoWinnerTie());
	}
	
	
    
    
    @Test
    public void testInitialModelLocationsAreAllEmpty() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				assertEquals("", model.getMark(i, j));
			}
		}
    }
	
	@Test
	public void testMarkXInCenter() {
		model.makeMark("X", 1, 1);
		assertEquals("X", model.getMark(1, 1));
	}
    /*
	@Test
	public void testMarkXInCenterThenOInCenter() {
		model.makeMark("X", 1, 1);
		assertEquals("X", model.getMark(1, 1));
		model.makeMark("O", 1, 1);
		assertEquals("X", model.getMark(1, 1));
	}
	//fix I'm thinking use this as 
	/*@Test
	public void testIfBoardIsCompletlyMarked(){
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				assertEquals("X" || "O", model.getMark(i, j));
			}
		}
	}
	@Test
	public void testPlayersMarkingOnSameField(){
		model.makeMark("X", 1, 1);
		model.makeMark("O", 1, 1);
		assertEquals("X", model.getMark(1, 1));
	}
	/*@Test
	public void testIfGameContinuesAfterTheFirstMark(){
		assertEquals("X", model.getMark(1, 1));
		assertEquals(model.getWinner.NONE);
	}
	@Test 
	public void testGameIsWonByXHorizontallyAcrossTheTopROW(){
		model.makeMark("X", 0, 0);
		assertEquals("X", model.getMark(0, 0));
		model.makeMark("X", 0, 1 );
		assertEquals("X", model.getMark(0, 1));
		model.makeMark("X", 0, 2);
		assertEquals("X", model.getMark(0, 2));
		assertEquals(model.getWinner()== "X" );
		
		
	}/*
	@Test 
	public void testGameIsAtieIfBoardIsFullOfMarks(){
		model.makeMark("X", 1, 1);
		assertEquals("X", model.getMark(1, 1));
		model.makeMark("O", 0, 0 );
		assertEquals("0", model.getMark(0, 0));
		model.makeMark("X", 0, 1);
		assertEquals("X", model.getMark(0, 1));
		model.makeMark("O", 2, 1);
		assertEquals("0", model.getMark(2, 1));
		model.makeMark("X", 2, 0);
		assertEquals("X", model.getMark(2, 0));
		assertEquals(model.getWinner("X"));
		model.makeMark("O", 0,2);
		assertEquals("0", model.getMark(0, 2));
		model.makeMark("X", 1, 2);
		assertEquals("X", model.getMark(1, 2));
		model.makeMark("O", 1, 0);
		assertEquals("0", model.getMark(1, 0));
		model.makeMark("X", 2, 2);
		assertEquals("X", model.getMark(2, 2));
		assertEquals(model.getWinner("TIE"));
	}	
	@Test
	public void testGameIsWonByXdiagonally(){
		model.makeMark("X", 1, 1);
		assertEquals("X", model.getMark(1, 1));
		model.makeMark("O", 0, 1 );
		assertEquals("0", model.getMark(0, 1));
		model.makeMark("X", 0, 0);
		assertEquals("X", model.getMark(0, 0));
		model.makeMark("O", 0, 2);
		assertEquals("0", model.getMark(0, 2));
		model.makeMark("X", 2, 2);
		assertEquals("X", model.getMark(2, 2));
		assertEquals(model.getWinner("X"));
	}*/
	
	 
 
}









