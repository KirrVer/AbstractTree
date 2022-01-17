
import DeciduousTree.DeciduousTree;

import СoniferTree.ConiferTree;

import TreeOfNature.Seasons;


public class Main {
    public static void main(String[] args) {
        DeciduousTree deciduousTree = new DeciduousTree("Oak", 500);
        deciduousTree.growthWithSeason(50, Seasons.SPRING);
        System.out.println(deciduousTree.listOfLeaves());

        System.out.println(deciduousTree.whatLeaves());
        ConiferTree coniferTree = new ConiferTree("Pine", 300);
        coniferTree.growthWithSeason(20, Seasons.FALL);
        System.out.println(coniferTree.listOfLeaves());

        System.out.println(coniferTree.whatLeaves());


    }
}
