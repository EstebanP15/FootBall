public class Player {
    private String name;
    private int age;
    private boolean dt;
    private String position;
    private double weight;
    private double height;
    private String nationality;
    private boolean active;

    public Player(String name, int age, boolean dt, String position, double weight, double height, String nationality, boolean active) {
        this.name = name;
        this.age = age;
        this.dt = dt;
        this.position = position;
        this.weight = weight;
        this.height = height;
        this.nationality = nationality;
        this.active = active;

    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Director Técnico: " + dt);
        System.out.println("Posición: " + position);
        System.out.println("Peso: " + weight + " kg");
        System.out.println("Altura: " + height + " m");
        System.out.println("Nacionalidad: " + nationality);
        System.out.println("¿Activo?: " + (active ? "Sí" : "No"));
        System.out.println("--------------------------------");
    }
}







