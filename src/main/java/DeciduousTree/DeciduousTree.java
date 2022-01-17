package DeciduousTree;

import TreeOfNature.Tree;

/**
 * Deciduous tree class.
 */
public class DeciduousTree extends Tree {
    public DeciduousTree(String name, int maxAge) {
        super(name, maxAge);
        super.setLeafTree(new DeciduousLeaves());
    }
}
