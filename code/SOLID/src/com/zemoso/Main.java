package com.zemoso;

public class Main {

    public static void main(String[] args) {
	// write your code here
        callingBook();
        callingBus();
    }

    private static void callingBus() {
        BusSolid bus = new BusSolid();
        bus.startTrip();
        Seller seller = new Seller();
        seller.calculateFare();
        seller.sellCandy();
        bus.honk();
        ToyBus tb = new ToyBus();
        tb.honk();
    }

    private static void callingBook() {
        System.out.println("Single Operation Only");
        BookNotSolid bns = new BookNotSolid("1984", "George Orwell");
        bns.printBookDetails();
        BookSolid bs = new BookSolid("The Immortals of Meluha", "Amish Tripathi");
        BookDetailsPrinter printer = new BookDetailsPrinter();
        printer.printBookDetails(bs);
    }
}
