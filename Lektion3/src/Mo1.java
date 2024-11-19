public class Mo1 {
    public static void main(String[] args) {

        double diameter1 = 26.0;
        double price1 = 8.0;

        double diameter2 = 30.0;
        double price2 = 10.0;


        double area1 = Math.PI * Math.pow(diameter1 / 2.0, 2);
        double area2 = Math.PI * Math.pow(diameter2 / 2.0, 2);

        double value1 = price1 / area1;
        double value2 = price2 / area2;


        if (value1 < value2) {
            System.out.println("Pizza 1 has the better price-to-size ratio.");
        } else if (value1 > value2) {
            System.out.println("Pizza 2 has the better price-to-size ratio.");
        } else {
            System.out.println("Both pizzas have the same price-to-size ratio.");
        }
    }
}

