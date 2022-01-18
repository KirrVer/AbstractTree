package СoniferTree;

import TreeOfNature.BrunchTree;
import TreeOfNature.LeafTree;

public class ConiferBrunch extends BrunchTree {
    public ConiferBrunch(int age, String name, int ageBranch, boolean isLifeTree, LeafTree leafTree) {
        super(age, name, ageBranch, isLifeTree, new NeedlesTree());
    }

    public ConiferBrunch() {
    }

    @Override
    public BrunchTree addBrunch(int age, String name, int ageBranch, boolean isLifeTree, LeafTree leafTree) {
        return new ConiferBrunch(age,name,ageBranch,isLifeTree,leafTree);
    }

    @Override
    public void detourLeaves(int k) {
        super.detourLeaves(k+3);
    }
}
