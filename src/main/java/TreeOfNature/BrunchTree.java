package TreeOfNature;



import java.util.ArrayList;
import java.util.List;

public class BrunchTree {
    String name;
    int ageBranch;
    int maxLeaves;
    boolean isLiveBranch;
    int countLevers;
    List<LeafTree> leaves;
    LeafTree leafTree;

    public BrunchTree(int age, String name, int ageBranch, boolean isLifeTree, LeafTree leafTree) {

        this.name = name;
        this.ageBranch += ageBranch;
        this.maxLeaves += this.ageBranch/2;
        countLevers += 5;
        isLiveBranch = isLifeTree;
        this.leaves = new ArrayList<>();
        this.leafTree = leafTree;
        int countLeaves = 0;
        if (isLifeTree) {
            countLeaves = this.countLevers * (age + this.ageBranch);
        }
        for (int i = 0; i < countLeaves; i++) {
            leaves.add(leafTree.getLeaf());
        }
    }

    public void newLeaves(int ageGrowth) {
        leaves.clear();
        int countLeaves = this.countLevers * (ageGrowth + this.ageBranch);
        for (int i = 0; i < countLeaves; i++) {
            leaves.add(leafTree);
        }
    }

    public void detourLeaves(int k) {
        for (int i = 0; i < leaves.size(); i += k) {
            if (!leaves.get(i).isLiveBranch()) {
                leaves.remove(i);
            } else leaves.get(i).dying();
        }
    }

    public List<LeafTree> getLeaves() {
        return leaves;
    }

    public String getName() {
        return name;
    }

    public int getAgeBranch() {
        return ageBranch;
    }

    public void setAgeBranch(int ageBranch) {

        this.ageBranch = this.ageBranch + ageBranch;
    }

    public int getCountLevers() {
        return countLevers;
    }

    public boolean isLiveBranch() {
        return isLiveBranch;
    }

    public void setLiveBranch(boolean liveBranch) {
        isLiveBranch = liveBranch;
    }

}
