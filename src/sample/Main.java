package com.company;
public class Main {

    public static void main(String[] args) {

        AnimalCamp MagicCamp=new MagicCamp("Pikachu", 21,"Electrocutarea",3,"MagicCamp",6);
        System.out.print("\n\n");
        System.out.print("class PokemonTeam --> class AnimalCamp --> MagicCamp");
        System.out.print("\n");
        System.out.println(MagicCamp.getNameTeam());
        System.out.println(MagicCamp.getNrPokemons());
        System.out.println(MagicCamp.getSuperPower());
        System.out.println(MagicCamp.getNrBadEnemies());
        System.out.println(MagicCamp.getNameCamp());
        System.out.println(MagicCamp.getNrDetachments());
        System.out.print("\n\n\n");


        Market Panda=new Market("Panda" , "Strada Cuza Vodă 37, Chișinău", 14 , 342214.45);
        System.out.print("class Market --> Panda");
        System.out.print("\n\n");
        System.out.println(Panda.getName());
        System.out.println(Panda.getLocation());
        System.out.println(Panda.getNrStaff());
        System.out.println(Panda.getProfitPerYear());

    }
}