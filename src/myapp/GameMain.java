package myapp;

import java.util.LinkedList;
import java.util.List;

public class GameMain {

    //entry point
    public static void main(String[] args) {

        List<Hitable> enemies = new LinkedList<>();
        for (int i =0 ; i <3; i++){
            enemies.add(new Troll());
        }
        enemies.add(new Tree());
        enemies.add(new Gnome());

        Hitable ht = new Tree();
        if (ht instanceof Tree){
            Tree t = (Tree)ht;
        }

        for(Hitable h:enemies) {
            System.out.printf(">>> %s\n", h);
        }


        // for (int i =0; i < enemies.size(); i++) {
        //     System.out.printf("%d: %s\n", i, enemies.get(i));
        // }
        // Troll t = new Troll();
        // System.out.println(t);

        //for each loop
        Link link = new Link();
        for (Hitable h: enemies){
            link.hit(h);
            System.out.printf(">> %s \n", h);
        }
    }
    
}
