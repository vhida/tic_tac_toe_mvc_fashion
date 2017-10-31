package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Controller{
    /**
     *
     * This is "Controller" component
     */
    Model tm;
    public Controller(Model tm){
        this.tm = tm;
        setGame(tm);
        setReset(tm);
    }



    private void setReset( Model tm){
        tm.getResetBtn().addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                tm.resetGame();
            }
        });
    }
    private void setGame(Model tm) {
        JButton[][] blocks = tm.getGrid();
        for(int row = 0; row< blocks.length;row++){
            for(int column = 0; column<blocks[row].length;column++){
                blocks[row][column].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        tm.getGameState(e);
                    }
                });
            }
        }

    }

}