package СoniferTree;

import TreeOfNature.LeafTree;

public class NeedlesTree extends LeafTree {
    public NeedlesTree() {
        super.setColor("green");
        super.setLiveBranch(true);
        super.setName("needles");
    }

    @Override
    public void dying() {
        setColor("brown");
    }

    @Override
    protected LeafTree getLeaf() {
        return new NeedlesTree();
    }
}
