package TreeOfNature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @Test
    void viewInfoOfTree() {
        Tree tree = new Tree("Oak", 800);
            tree.growth(250);
            String actual = tree.viewInfoOfTree();
            String expected  = """
                It is Oak.
                The age of the tree is 250 years.
                The height of the tree is 80 meters.""";
            assertEquals(expected,actual);
    }

    @Test
    void listOfLeaves() {
        Tree tree = new Tree("Oak", 800);
        tree.growthWithSeason(5, Seasons.SPRING);
        String actual = tree.listOfLeaves();
        String expected = "There are 200 leaves on the tree.";
        assertEquals(expected,actual);
    }

    @Test
    void whatLeaves() {
        Tree tree = new Tree("Oak", 100);
        tree.growthWithSeason(38, Seasons.FALL);
        String actual = tree.whatLeaves();
        String expected = "The tree has 4006 yellow and 3994 green Leaf.";
        assertEquals(expected,actual);
    }
}