public class AtmosphericBurners extends Burners{

    int fuelInjector;
    int thrust;

    public AtmosphericBurners(String name, String typeOfFuel, int power, int fuelInjector, int thrust) {
        super(name, typeOfFuel, power);
        this.fuelInjector = fuelInjector;
        this.thrust = thrust;
    }

    public void work() {
        if (thrust < 0) {
            System.out.println("Failure");//при запуске срабатывает датчик тяги, разрывая цепь безопасности
        } else {
            burn();
        }
    }
}
