package TreeOfNature;

/**
 * The base class of a tree that different types of trees inherit from.
 */
public class Tree {
    TrunkTree trunkTree;
    LeafTree leafTree;
    BrunchTree brunchTree;


    public Tree(String name, int maxAge) {
        this.leafTree = new LeafTree();
        this.trunkTree = new TrunkTree(name, maxAge);
        this.brunchTree = new BrunchTree(0, "", 0, false, this.leafTree);

    }

    /**
     * Outputting the tree state to the console after the growth method has been worked out.
     *
     * @return - returns the name, age, and height of the tree.
     */

    public String viewInfoOfTree() {

        return String.format("It is %s.\nThe age of the tree is %s years.\nThe height of the tree is %s meters.",
                trunkTree.getNameOfTree(), trunkTree.getAge(), trunkTree.getHigh());
    }

    /**
     * Tree growth method
     *
     * @param ageGrowth - tree growth age
     */

    public void growth(int ageGrowth) {
        int ageTree = ageGrowth;
        boolean isLifeTree = isLifeTree(ageGrowth);
        if (!isLifeTree) {
            ageTree = trunkTree.getMaxAge();
        }
        if (ageTree > 0) {
            for (BrunchTree brunchTree : trunkTree.getBrunchTrees()) {
                brunchTree.setAgeBranch(ageTree);
                brunchTree.newLeaves(trunkTree.getAge() + ageTree);
            }
            trunkTree.setCountBranches(ageTree);
            trunkTree.setHigh(ageTree * 2);
            int res = trunkTree.howManyCreateBranches(ageTree, trunkTree.getBrunchTrees().size());
            for (int i = 0; i < res; i++) {
                trunkTree.setBrunchTrees(new BrunchTree(ageTree, trunkTree.getAge() + i + " branch of " + trunkTree.getNameOfTree(),
                        ageTree - i, isLifeTree, leafTree.getLeaf()));
            }
            trunkTree.setAge(ageTree);
        }
    }

    /**
     * Growth with seasons
     *
     * @param ageGrowth - tree growth age
     * @param season    - season from enum
     */

    public void growthWithSeason(int ageGrowth, Seasons season) {
        int ageTree = ageGrowth;
        boolean isLifeTree = isLifeTree(ageGrowth);
        if (!isLifeTree) {
            ageTree = trunkTree.getMaxAge();
        }
        if (ageTree != 0) {
            if (Seasons.SPRING == season) {
                growth(ageTree);
            } else if (Seasons.SUMMER == season) {
                growth(ageTree);
            } else if (Seasons.FALL == season) {
                fallTree(ageGrowth, isLifeTree);
            } else if (Seasons.WINTER == season) {
                winterTree(ageGrowth, isLifeTree);
            }
        } else if (Seasons.SPRING == season | Seasons.SUMMER == season) {
            springOrSummer(ageGrowth, isLifeTree);
        } else if (Seasons.FALL == season) {
            onlyFall();
        } else if (Seasons.WINTER == season) {
            onlyWinter();
        }
    }

    /**
     * Tree growth in summer
     *
     * @param ageGrowth  - tree growth age
     * @param isLifeTree - tree status
     */
    protected void springOrSummer(int ageGrowth, boolean isLifeTree) {
        for (int i = 0; i < trunkTree.howManyCreateBranches(1, trunkTree.getBrunchTrees().size()); i++) {
            trunkTree.setBrunchTrees(new BrunchTree(ageGrowth, trunkTree.getAge() + i + " branch of "
                    + trunkTree.getNameOfTree(),
                    ageGrowth - i, isLifeTree, leafTree.getLeaf()));
        }
    }

    protected void onlyWinter() {
        for (BrunchTree brunchTree : trunkTree.getBrunchTrees()) {
            brunchTree.detourLeaves(2);
            brunchTree.leaves.clear();
        }
    }

    protected void onlyFall() {
        for (BrunchTree brunchTree : trunkTree.getBrunchTrees()) {
            brunchTree.detourLeaves(1);
        }
    }

    /**
     * Condition of the tree in the fall.
     *
     * @param ageGrowth  - tree growth age
     * @param isLifeTree - tree status
     */

    protected void fallTree(int ageGrowth, boolean isLifeTree) {
        for (BrunchTree brunchTree : trunkTree.getBrunchTrees()) {
            brunchTree.setAgeBranch(ageGrowth);
            brunchTree.newLeaves(trunkTree.getAge() + ageGrowth);
        }
        trunkTree.setCountBranches(ageGrowth);
        trunkTree.setHigh(ageGrowth * 2);
        for (int i = 0; i < trunkTree.howManyCreateBranches(ageGrowth, trunkTree.getBrunchTrees().size()); i++) {
            trunkTree.setBrunchTrees(new BrunchTree(ageGrowth, trunkTree.getAge() + i + " branch of "
                    + trunkTree.getNameOfTree(),
                    ageGrowth - i, isLifeTree, leafTree.getLeaf()));
        }
        for (BrunchTree brunchTree : trunkTree.getBrunchTrees()) {
            brunchTree.detourLeaves(2);
        }
        trunkTree.setAge(ageGrowth);
    }

    /**
     * Condition of the tree in the winter.
     *
     * @param ageGrowth  - tree growth age
     * @param isLifeTree - tree status
     */

    protected void winterTree(int ageGrowth, boolean isLifeTree) {
        for (BrunchTree brunchTree : trunkTree.getBrunchTrees()) {
            brunchTree.newLeaves(trunkTree.getAge() + ageGrowth);
        }
        trunkTree.setCountBranches(ageGrowth);
        trunkTree.setHigh(ageGrowth * 2);
        for (int i = 0; i < trunkTree.howManyCreateBranches(ageGrowth, trunkTree.getBrunchTrees().size()); i++) {
            trunkTree.setBrunchTrees(new BrunchTree(ageGrowth, trunkTree.getAge() + i + " branch of "
                    + trunkTree.getNameOfTree(),
                    ageGrowth - i, isLifeTree, leafTree.getLeaf()));
        }
        for (BrunchTree brunchTree : trunkTree.getBrunchTrees()) {
            brunchTree.detourLeaves(1);
            brunchTree.leaves.clear();
        }
        trunkTree.setAge(ageGrowth);
    }

    private boolean isLifeTree(int ageGrowth) {
        if (trunkTree.getAge() + ageGrowth > trunkTree.getMaxAge()) {
            trunkTree.setLife(false);
            System.out.println("The tree has lived " + trunkTree.getMaxAge() +
                    " for years. Now there are only branches left.");
            return false;
        }
        return true;
    }

    /**
     * Return all leaves;
     */
    public String listOfLeaves() {
        int leavesOfBranch = countOfLeaves();
        return String.format("There are %s leaves on the tree.", leavesOfBranch);
    }

    protected int countOfLeaves() {
        int leavesOfBranch = 0;
        for (BrunchTree brunchTree : trunkTree.getBrunchTrees()) {
            leavesOfBranch += brunchTree.leaves.size();
        }
        return leavesOfBranch;
    }

    /**
     * What are the leaves on the tree
     *
     * @return - returns a string describing the color of the leaves on the tree.
     */
    public String whatLeaves() {
        String nameOfLeaves = "";
        String colorOfLeaves = "";
        String twoColorOfLeaves = "";
        String response = "";
        int countLeaves = 0;
        int twoCountLeaves = 0;
        if (countOfLeaves() == 0) {
            response = "There are no leaves on the tree now.";
            return response;
        }
        for (BrunchTree brunchTree : trunkTree.getBrunchTrees()) {
            for (int i = 0; i < brunchTree.leaves.size(); i++) {
                if (colorOfLeaves.equals("")) {
                    nameOfLeaves = brunchTree.leaves.get(0).getName();
                    colorOfLeaves = brunchTree.leaves.get(0).getColor();
                }
                if (!colorOfLeaves.equals(brunchTree.leaves.get(i).getColor())) {
                    twoColorOfLeaves = brunchTree.leaves.get(i).getColor();
                }
                if (brunchTree.leaves.get(i).getColor().equals(colorOfLeaves)){
                    countLeaves++;
                }
                if (brunchTree.leaves.get(i).getColor().equals(twoColorOfLeaves)){
                    twoCountLeaves++;
                }
            }
        }
        if (!twoColorOfLeaves.equals("")) {
            response = String.format("The tree has %s %s and %s %s %s.", countLeaves, colorOfLeaves, twoCountLeaves,twoColorOfLeaves, nameOfLeaves);
        } else {
            response = String.format("The tree has %s %s %s.",countLeaves, colorOfLeaves, nameOfLeaves);
        }
        return response;
    }

    protected void setLeafTree(LeafTree leafTree) {
        this.leafTree = leafTree;
    }

}
