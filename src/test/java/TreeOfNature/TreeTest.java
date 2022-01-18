package TreeOfNature;

import org.junit.jupiter.api.Test;
import СoniferTree.ConiferTree;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @Test
    void viewInfoOfTree() {
        Tree tree = new Tree("Oak", 800);
        ConiferTree coniferTree = new ConiferTree("Pine", 300);
            tree.growth(250);
            coniferTree.growth(250);
            String actual = tree.viewInfoOfTree();
            String actual_1 = coniferTree.viewInfoOfTree();
            String expected  = """
                It is Oak.
                The age of the tree is 250 years.
                The height of the tree is 80 meters.""";
            String expected_1 = """
                It is Pine.
                The age of the tree is 250 years.
                The height of the tree is 30 meters.""";
            assertEquals(expected,actual);
            assertEquals(expected_1, actual_1);
    }

    @Test
    void listOfLeaves() {
        Tree tree = new Tree("Oak", 800);
        ConiferTree coniferTree = new ConiferTree("Pine", 300);
        coniferTree.growthWithSeason(20, Seasons.WINTER);
        tree.growthWithSeason(5, Seasons.SPRING);
        String actual = tree.listOfLeaves();
        String actual_1 = coniferTree.whatLeaves();
        String expected = "There are 200 leaves on the tree.";
        String expected_1 = "The tree has 770 brown and 2280 green needles.";
        assertEquals(expected,actual);
        assertEquals(expected_1,actual_1);
    }

    @Test
    void whatLeaves() {
        Tree tree = new Tree("Oak", 100);
        ConiferTree coniferTree = new ConiferTree("Pine", 100);
        tree.growthWithSeason(38, Seasons.FALL);
        coniferTree.growthWithSeason(15, Seasons.FALL);
        String actual = tree.whatLeaves();
        String actual_1 = coniferTree.whatLeaves();
        String expected = "The tree has 4006 yellow and 3994 green Leaf.";
        String expected_1= "The tree has 437 brown and 1288 green needles.";
        assertEquals(expected,actual);
        assertEquals(expected_1,actual_1);
    }
}