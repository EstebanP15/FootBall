import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private String city;
    private String stadium;

    public Team(String name, String city, String stadium) {
        this.name = name;
    }
    public void addPlayer(Player player){
        this.players.add(player);
    }

}
