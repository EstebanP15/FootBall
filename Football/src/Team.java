import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private String city;
    private String stadium;

    public Team(String name, String city, String stadium) {
        this.name = name;
        this.city = city;
        this.players = new ArrayList<>();
    }

    public void agregarJugador(Player player) {
        players.add(player);
    }

    public void mostrarEquipo() {
        System.out.println("=== Equipo: " + name + " ===");
        System.out.println("Ciudad: " + city);
        System.out.println("Jugadores:");
        for (Player j : players) {
            j.mostrarInfo();
        }
    }
}



