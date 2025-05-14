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
        this.active = true;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getDt() {
        return dt;
    }

    public void setDt(boolean dt) {
        this.dt = dt;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + name + '\'' +
                ", edad=" + age +
                ", entrenador=" + dt +
                ", posicion=" + position + "}";



    }
}
