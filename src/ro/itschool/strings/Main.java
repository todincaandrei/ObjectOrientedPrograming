package ro.itschool.strings;

public class Main {
    public static void main(String[] args) {
        String a = "Gabi";
        String b = "Gabi";
        String c = new String("Gabi");


        System.out.println(a + b + c);
        if (a.equals(b)) {
            System.out.println("a == b TRUE");
        } else {
            System.out.println("a == b FALSE");
        }
        if (b.equals(c)) {
            System.out.println(" b == c TRUE");
        } else {
            System.out.println("b == c FALSE");
        }
        String userChoice = "Yes";
        System.out.println("YES".equalsIgnoreCase(userChoice));


        System.out.println("GABI".startsWith("GA"));

        String name = "Gabriel";
        System.out.println(name.length());

        char car = name.charAt(2);
        System.out.println(car);

        String result = name.concat("Ionescu");
        System.out.println(result);

        String fullName = "Ionescu Gabriel";

        String alternedFullName = fullName.replace('e', 'b');
        System.out.println(fullName);
        System.out.println(alternedFullName);

        String alternedFullName2 = fullName.replace("Ion", "Pop");
        System.out.println(alternedFullName2);


        String nume = "Gabriel Ionescu, Vladimir Popescu, Alexandru Bunescu";

        String [] names = name.split(", ");

        System.out.println(names[1]);

    }

}
