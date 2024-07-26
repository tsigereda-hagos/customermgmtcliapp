package edu.miu.cs.cs425;

import edu.miu.cs.cs425.model.Customer;

import java.time.LocalDate;
import java.util.Arrays;

public class CustomerMgmtApp {
    public static void main(String[] args) {
        var customers = new Customer[]{
                new Customer(1, "Anna Smith", LocalDate.of(1998,12,31)),
                new Customer(2, "Bob Jones",LocalDate.of(2002, 1, 15))
        };
        System.out.println(Arrays.toString(customers));

    }
}