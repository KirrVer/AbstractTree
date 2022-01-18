package TreeOfNature;

public class LeafTree{
    private String name;
    boolean isLiveBranch;
    String color;

    public LeafTree() {
            this.name = "leaf";
            this.isLiveBranch = true;
            this.color = "green";
    }

    protected LeafTree getLeaf(){
        return new LeafTree();
    }

    public void dying() {
        color = "yellow";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLiveBranch() {
        return isLiveBranch;
    }

    public void setLiveBranch(boolean liveBranch) {
        isLiveBranch = liveBranch;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
