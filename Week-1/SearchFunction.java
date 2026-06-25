import java.util.*;

class Dress {
    String name, color, size;
    Dress(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }
}

public class SearchFunction {
    public static void main(String[] args) {
        List<Dress> catalog = Arrays.asList(
                new Dress("Summer Dress", "Red", "M"),
                new Dress("Evening Gown", "Blue", "L"),
                new Dress("Party Dress", "Red", "S"),
                new Dress("Floral Dress", "Green", "M")
        );

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter keyword to search for dresses: ");
        String keyword = sc.nextLine();

        boolean found = false;
        for (Dress d : catalog) {
            if (d.name.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(d.name + " - " + d.color + " - " + d.size);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No dresses found with the keyword: " + keyword);
        }
    }
}
