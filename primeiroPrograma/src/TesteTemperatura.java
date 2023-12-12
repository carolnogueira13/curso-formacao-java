public class TesteTemperatura {
    public static void main(String[] args) {
        double celsius = 20.3;
        double fah = (celsius * 1.8) + 32;
        System.out.println("Temperatura em Celsius : " + celsius
        + " ºC");
        System.out.println("Temperatura em Fahrenheit: " +
                fah + " F");

        int fah2 = (int) fah;
        System.out.println("Temperatura em Fahrenheit (sem casas" +
                "decimais): " + fah2 + " F");

    }
}
