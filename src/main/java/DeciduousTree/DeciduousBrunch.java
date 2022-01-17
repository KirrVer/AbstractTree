package DeciduousTree;

import TreeOfNature.BrunchTree;
import TreeOfNature.LeafTree;
import СoniferTree.NeedlesTree;

public class DeciduousBrunch extends BrunchTree {
    public DeciduousBrunch(int age, String name, int ageBranch, boolean isLifeTree) {
        super(age, name, ageBranch, isLifeTree, new DeciduousLeaves());
    }
}
