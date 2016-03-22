package pokerEnums;
import java.util.ArrayList;

public enum eGameType {

	TEXAS(1), OMAHA(2), GAMETHREE(3), GAMEFOUR(4);

	private int gameType;

	private eGameType(final int gameType){
		this.gameType = gameType;
	}
	public int getGameType(){
		return gameType;
	}


}
