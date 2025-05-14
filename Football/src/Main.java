//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Player j1 = new Player("Cristiano", 40, false , "Delantero",
                72.5, 1.78, "Portugal", true);
        Player j2 = new Player("Casillas", 30, false, "Portero",
                80.0, 1.85, "España", true);

        Team team = new Team("Real Madrid", "Madrid","Bernabeu");
        team.agregarJugador(j1);
        team.agregarJugador(j2);

        team.mostrarEquipo();
    }
}