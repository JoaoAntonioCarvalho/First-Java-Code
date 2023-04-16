public class Init {

    public static void main(String[] args){

        double temperatureCelcius = 33;
        double temperatureKelvin = (temperatureCelcius * 1.8) + 32;

        System.out.println(String.format("A temperatura em %f convertida para kelvin é %f", temperatureCelcius, temperatureKelvin));    }
}