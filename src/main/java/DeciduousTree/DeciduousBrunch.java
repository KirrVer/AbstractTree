package DeciduousTree;

import TreeOfNature.BrunchTree;
import TreeOfNature.LeafTree;
import СoniferTree.NeedlesTree;

public class DeciduousBrunch extends BrunchTree {
    public DeciduousBrunch(int age, String name, int ageBranch, boolean isLifeTree, LeafTree leafTree) {
        super(age, name, ageBranch, isLifeTree, new DeciduousLeaves());
    }

    public DeciduousBrunch() {
    }

    @Override
    public BrunchTree addBrunch(int age, String name, int ageBranch, boolean isLifeTree, LeafTree leafTree) {
        return new DeciduousBrunch(age,name,ageBranch,isLifeTree,leafTree);
    }

    @Override
    public void detourLeaves(int k) {
        super.detourLeaves(k+1);
    }
}
