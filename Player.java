
public class Player {
	private String playerCountry, playerName;
	
	public Player() {
		//this("MS Dhoni");
		this.playerCountry="India";
	}
	public Player(String playerName) {
		this();
		this.playerName= playerName;
		
	}
	
	public String toString() {
		return "Player = ["+ playerName +" Country = "+ playerCountry +"] ";
	}
	
	public static void main(String[] args) {
		Player p = new Player("MS Dhoni");
		System.out.println(p);
	}
}
