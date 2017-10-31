package main;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class View{
    /**
     * This is "main.View" component
     *
     */


    private JFrame gui;
    private JButton[][] blocks = new JButton[Constants.SIZE][Constants.SIZE];

    private JButton reset;
    private JTextArea playerturn;
    private JPanel game;
    public View() {
        initFrame();
        initGrid();
        render();
    }
    private void initFrame(){
        gui = new JFrame(Constants.NAME);

        reset = new JButton(Constants.RESET);
        playerturn= new JTextArea();



        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(new Dimension(Constants.D_X,Constants.D_Y));
        gui.setResizable(true);

        JPanel gamePanel = new JPanel(new FlowLayout());
        game = new JPanel(new GridLayout(Constants.SIZE,Constants.SIZE));
        gamePanel.add(game, BorderLayout.CENTER);

        JPanel options = new JPanel(new FlowLayout());
        options.add(reset);
        JPanel messages = new JPanel(new FlowLayout());
        messages.setBackground(Color.white);

        gui.add(gamePanel, BorderLayout.NORTH);
        gui.add(options, BorderLayout.CENTER);
        gui.add(messages, BorderLayout.SOUTH);


        messages.add(playerturn);
        setInitTxt();

    }

    private void initGrid(){

        for(int row = 0; row<3 ;row++) {
            for(int column = 0; column<3 ;column++) {
                blocks[row][column] = new JButton();
                blocks[row][column].setPreferredSize(new Dimension(Constants.CELL_SZ,Constants.CELL_SZ));
                blocks[row][column].setText("");
                game.add(blocks[row][column]);

            }
        }


    }

    private void render(){
        gui.setVisible(true);
    }

    public JButton[][] getGrid(){
        return blocks;
    }
    public JButton getResetBtn(){
        return reset;
    }
    public void setInitTxt(){
        playerturn.setText(Constants.INSTR_PLAYER_1);
    }

    public JTextArea getPlayerturn(){
        return playerturn;
    }

    public JButton[][] getBlocks(){
        return blocks;
    }
}