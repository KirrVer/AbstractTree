package СoniferTree;

import TreeOfNature.Tree;
/**
* Conifer class.
 */
public class ConiferTree extends Tree {
    public ConiferTree(String name, int maxAge) {
        super(name, maxAge);
        super.setLeafTree(new NeedlesTree());
    }

    @Override
    protected void winterTree(int ageGrowth, boolean isLifeTree) {
        super.fallTree(ageGrowth, isLifeTree);
    }

}
