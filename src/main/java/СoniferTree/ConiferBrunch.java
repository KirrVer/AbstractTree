package СoniferTree;

import TreeOfNature.BrunchTree;
import TreeOfNature.LeafTree;

public class ConiferBrunch extends BrunchTree {
    public ConiferBrunch(int age, String name, int ageBranch, boolean isLifeTree, LeafTree leafTree) {
        super(age, name, ageBranch, isLifeTree, new NeedlesTree());
    }

}
