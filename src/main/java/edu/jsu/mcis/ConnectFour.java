package edu.jsu.mcis;

public class ConnectFour {
    public enum Location {EMPTY,RED,BLACK};
	public boolean nextTurn;
    private final int col = 7;
    private final int row = 6;
	private Location[][] game;
    
    public ConnectFour() {
		game = new Location[row][col];
        for(int i = 0; i < game.length; i++) {
            for(int j = 0; j < game[i].length; j++) {
                game[i][j] = Location.EMPTY;
            }
        }
        nextTurn = true;
    }
        
    
   
   public Location getTopOfColumn(int column) {
	return Location.EMPTY;
   }
    
    public int getHeightOfColumn(int column) {
       return 0;
    }
    
    public void dropToken(int column) {
        
    }
	
}