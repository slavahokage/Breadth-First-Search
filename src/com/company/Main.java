package com.company;

public class Main {

    public static void main(String[] args) {
        Node start = new Node();
        start.setName("start");

        Node bob = new Node();
        bob.setName("bob");

        Node clarre = new Node();
        clarre.setName("clarre");

        Node alice = new Node();
        alice.setName("alice");

        Node anuj = new Node();
        anuj.setName("anuj");

        Node tom = new Node();
        tom.setName("tom");

        Node johnny = new Node();
        johnny.setName("johnny");

        Node peggie = new Node();
        peggie.setName("peggie");


        start.addNeighbour(bob);
        start.addNeighbour(alice);
        start.addNeighbour(clarre);

        bob.addNeighbour(anuj);
        bob.addNeighbour(peggie);

        clarre.addNeighbour(tom);
        clarre.addNeighbour(johnny);

        alice.addNeighbour(peggie);

        BreadthFirstSearchService breadthFirstSearchService = new BreadthFirstSearchService();
        System.out.println(breadthFirstSearchService.search(start, "slava"));
    }
}
