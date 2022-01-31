public class Burners {

    String name, typeOfFuel;
    int power;

    public Burners(String name, String typeOfFuel, int power) {
        this.name = name;
        this.typeOfFuel = typeOfFuel;
        this.power = power;
    }
    public void burn() {
        System.out.println("Ok");
    }
    public void work() {
        burn();
    }
}
