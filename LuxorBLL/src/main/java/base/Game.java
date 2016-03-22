package base;
import java.util.UUID;
import java.util.ArrayList;

public class Game {
	
	private UUID GameID;
	private UUID TableID;
	private ArrayList<Player>GamePlayers;

	public Game() {
		// TODO Auto-generated constructor stub
	}

	public UUID getGameID() {
		return GameID;
	}

	public void setGameID(UUID gameID) {
		GameID = gameID;
	}

	public UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}

	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}

	public void setGamePlayers(ArrayList<Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}

}
