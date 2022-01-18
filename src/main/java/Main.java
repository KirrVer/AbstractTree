
import DeciduousTree.DeciduousTree;
import TreeOfNature.Seasons;
import СoniferTree.ConiferTree;


public class Main {
    public static void main(String[] args) {
        DeciduousTree deciduousTree = new DeciduousTree("Oak", 500);
        deciduousTree.growth(100);
        System.out.println(deciduousTree.viewInfoOfTree());
        System.out.println(deciduousTree.listOfLeaves());
        System.out.println(deciduousTree.whatLeaves());
        System.out.println("________________________________________");
        deciduousTree.growthWithSeason(10, Seasons.FALL);
        System.out.println(deciduousTree.viewInfoOfTree());
        System.out.println(deciduousTree.listOfLeaves());
        System.out.println(deciduousTree.whatLeaves());
        System.out.println("________________________________________");
        deciduousTree.growthWithSeason(20, Seasons.WINTER);
        System.out.println(deciduousTree.viewInfoOfTree());
        System.out.println(deciduousTree.listOfLeaves());
        System.out.println(deciduousTree.whatLeaves());
        System.out.println("________________________________________");
        ConiferTree coniferTree = new ConiferTree("Pine", 300);
        coniferTree.growth(50);
        System.out.println(coniferTree.viewInfoOfTree());
        System.out.println(coniferTree.listOfLeaves());
        System.out.println(coniferTree.whatLeaves());
        System.out.println("________________________________________");
        coniferTree.growthWithSeason(20, Seasons.FALL);
        System.out.println(coniferTree.viewInfoOfTree());
        System.out.println(coniferTree.listOfLeaves());
        System.out.println(coniferTree.whatLeaves());
        System.out.println("________________________________________");
        coniferTree.growthWithSeason(30, Seasons.WINTER);
        System.out.println(coniferTree.viewInfoOfTree());
        System.out.println(coniferTree.listOfLeaves());
        System.out.println(coniferTree.whatLeaves());


    }
}
