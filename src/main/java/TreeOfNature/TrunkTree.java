package TreeOfNature;

import java.util.ArrayList;
import java.util.List;

public class TrunkTree {
    private final String nameOfTree;
    private int high;
    private int highMax;
    private int age;
    private final int maxAge;
    private int countBranches;
    private int maxBranches;
    private boolean isLife;
    List<BrunchTree> brunchTrees;




    public TrunkTree(String nameOfTree, int maxAge) {
        this.nameOfTree = nameOfTree;
        this.maxAge = maxAge;
        this.age = 0;
        maxBranches = maxAge / 2;
        isLife = true;
        this.highMax = maxAge / 10;
        this.brunchTrees = new ArrayList<>();

    }

    protected void setCountBranches(int countBranches) {
        this.countBranches = Math.min(this.countBranches + countBranches, maxBranches);
    }

//How many branches to add.
    public int howManyCreateBranches(int ageGrowth, int countBranches) {
        if (countBranches + ageGrowth < maxBranches) {
            return ageGrowth;
        } else {
            int res = (countBranches + ageGrowth) - maxBranches;
            return ageGrowth - res;
        }
    }

    public int getHigh() {
        return high;
    }

    private void setMaxBranches(int maxBranches) {
        this.maxBranches = maxBranches;
    }

    private void setHighMax(int highMax) {
        this.highMax = highMax;
    }

    public String getNameOfTree() {
        return nameOfTree;
    }

    protected void setHigh(int high) {
        if (this.high + high > highMax) {
            this.high = highMax;
        } else this.high += high;
    }

    protected void setBrunchTrees(BrunchTree brunchTrees) {
        this.brunchTrees.add(brunchTrees);
    }

    public List<BrunchTree> getBrunchTrees() {
        return brunchTrees;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = this.age + age;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public int getCountBranches() {
        return countBranches;
    }


    public int getMaxBranches() {
        return maxBranches;
    }

    public boolean isLife() {
        return isLife;
    }

    protected void setLife(boolean life) {
        isLife = life;
    }


}
