package СoniferTree;

import TreeOfNature.BrunchTree;

public class ConiferBrunch extends BrunchTree {
    public ConiferBrunch(int age, String name, int ageBranch, boolean isLifeTree) {
        super(age, name, ageBranch, isLifeTree, new NeedlesTree());
    }

}
