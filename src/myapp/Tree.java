package myapp;

public class Tree implements Hitable{

    private int health;
    private String name;

    public Tree() {
        this.health = 10;
        this.name = "tree";}

    public int getHealth() {
        return health;}
    public void setHealth(int Health) {this.health = health;}

    public String getName() {
        return name;}
    public void setName(String Name) {this.name = name;}


    //method
    public void hit(int damage){
        this.health -=damage;
    }

    @Override
    public String toString(){
        return "Tree{name=%s, health=%d}".formatted(name,health);
    }
}
