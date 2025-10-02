package CodingQuestions.LambdasAndStreams.Code_Period_YT.BigProblems.Prob_45;

import java.util.*;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(
                Arrays.asList(
                        new Product(1,"Powder",99.1,"Cleaning"),
                        new Product(1,"Mobile",9999.6,"Electronics"),
                        new Product(1,"Comb",29,"Grooming")
                )
        );
        // 1. price less than 100
        List<String> products = productList.stream().filter(p->p.getPrice()<100).map(n->n.getName()).toList();
        System.out.println(products);

        // 3. average price
        double average = productList.stream().mapToDouble(d->d.getPrice()).average().getAsDouble();
        System.out.println(average);

        // 4. product with lowest price
        Product cheapest = productList.stream()
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow();

        System.out.println("Cheapest Product: "
                + cheapest.getName() + " - " + cheapest.getPrice());

    }
}
