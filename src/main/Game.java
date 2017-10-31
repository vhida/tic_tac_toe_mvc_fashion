package main;
public class Game{
    Model m;
    View v;
    Controller c;
    public Game(){
        this.v = new View();
        this.m = new Model(v);
        this.c = new Controller(m);
    }

    public static void main(String[] args){
        Game g = new Game();
    }

}