package main;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Model{
    private int player, movesLeft;
    private View view;
    public Model(View view) {
        this.view = view;
        player = 1;
        movesLeft = 9;
    }

    public void resetGame() {
        JButton[][] blocks = view.getBlocks();
        for(int row = 0; row<blocks.length ;row++) {
            for(int column = 0; column<blocks[row].length ;column++) {
                blocks[row][column].setText("");
                blocks[row][column].setEnabled(true);
            }
        }
        player = 1;
        movesLeft = 9;
        view.setInitTxt();
    }

    public JButton[][] getGrid(){
        return view.getGrid();
    }
    public JButton getResetBtn(){
        return view.getResetBtn();
    }

    public void getGameState(ActionEvent e) {
        --movesLeft;
        if(movesLeft%2 == 1) {
            view.getPlayerturn().setText("'X': Player 1");
        } else{
            view.getPlayerturn().setText("'O': Player 2");
        }

        if(player==1) {
            // Check whether player 1 won
            if(e.getSource()==view.getBlocks()[0][0]) {
                view.getBlocks()[0][0].setText("X");
                view.getBlocks()[0][0].setEnabled(false);
                player = 2;
                if(movesLeft<7) {
                    if((view.getBlocks()[0][0].getText().equals(view.getBlocks()[0][1].getText()) &&
                            view.getBlocks()[0][1].getText().equals(view.getBlocks()[0][2].getText())) ||
                            (view.getBlocks()[0][0].getText().equals(view.getBlocks()[0][1].getText()) &&
                                    view.getBlocks()[1][0].getText().equals(view.getBlocks()[2][0].getText())) ||
                            (view.getBlocks()[0][0].getText().equals(view.getBlocks()[1][1].getText()) &&
                                    view.getBlocks()[1][1].getText().equals(view.getBlocks()[2][2].getText()))) {
                        view.getPlayerturn().setText("Player 1 wins!");
                        for(int i=0; i<3; i++) {
                            for(int j=0; j<3; j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[0][1]) {
                view.getBlocks()[0][1].setText("X");
                view.getBlocks()[0][1].setEnabled(false);
                player = 2;
                if(movesLeft<7) {
                    if((view.getBlocks()[0][1].getText().equals(view.getBlocks()[0][0].getText()) &&
                            view.getBlocks()[0][0].getText().equals(view.getBlocks()[0][2].getText())) ||
                            (view.getBlocks()[0][1].getText().equals(view.getBlocks()[1][1].getText()) &&
                                    view.getBlocks()[1][1].getText().equals(view.getBlocks()[2][1].getText()))) {
                        view.getPlayerturn().setText("Player 1 wins!");
                        for(int i=0; i<3; i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[0][2]) {
                view.getBlocks()[0][2].setText("X");
                view.getBlocks()[0][2].setEnabled(false);
                player = 2;
                if(movesLeft<7) {
                    if((view.getBlocks()[0][2].getText().equals(view.getBlocks()[0][1].getText()) &&
                            view.getBlocks()[0][1].getText().equals(view.getBlocks()[0][0].getText())) ||
                            (view.getBlocks()[0][2].getText().equals(view.getBlocks()[1][2].getText()) &&
                                    view.getBlocks()[1][2].getText().equals(view.getBlocks()[2][2].getText()))) {
                        view.getPlayerturn().setText("Player 1 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[1][0]) {
                view.getBlocks()[1][0].setText("X");
                view.getBlocks()[1][0].setEnabled(false);
                player = 2;
                if(movesLeft<7) {
                    if((view.getBlocks()[1][0].getText().equals(view.getBlocks()[1][1].getText()) &&
                            view.getBlocks()[1][1].getText().equals(view.getBlocks()[1][2].getText())) ||
                            (view.getBlocks()[1][0].getText().equals(view.getBlocks()[0][0].getText()) &&
                                    view.getBlocks()[0][0].getText().equals(view.getBlocks()[2][0].getText()))) {
                        view.getPlayerturn().setText("Player 1 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[1][1]) {
                view.getBlocks()[1][1].setText("X");
                view.getBlocks()[1][1].setEnabled(false);
                player = 2;
                if(movesLeft<7) {
                    if((view.getBlocks()[1][1].getText().equals(view.getBlocks()[1][0].getText()) &&
                            view.getBlocks()[1][0].getText().equals(view.getBlocks()[1][2].getText())) ||
                            (view.getBlocks()[1][1].getText().equals(view.getBlocks()[0][1].getText()) &&
                                    view.getBlocks()[0][1].getText().equals(view.getBlocks()[2][1].getText())) ||
                            (view.getBlocks()[1][1].getText().equals(view.getBlocks()[0][0].getText()) &&
                                    view.getBlocks()[0][0].getText().equals(view.getBlocks()[2][2].getText())) ||
                            (view.getBlocks()[1][1].getText().equals(view.getBlocks()[0][2].getText()) &&
                                    view.getBlocks()[0][2].getText().equals(view.getBlocks()[2][0].getText()))) {
                        view.getPlayerturn().setText("Player 1 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[1][2]) {
                view.getBlocks()[1][2].setText("X");
                view.getBlocks()[1][2].setEnabled(false);
                player = 2;
                if(movesLeft<7) {
                    if((view.getBlocks()[1][2].getText().equals(view.getBlocks()[0][2].getText()) &&
                            view.getBlocks()[0][2].getText().equals(view.getBlocks()[2][2].getText())) ||
                            (view.getBlocks()[1][2].getText().equals(view.getBlocks()[1][1].getText()) &&
                                    view.getBlocks()[1][1].getText().equals(view.getBlocks()[1][0].getText()))) {
                        view.getPlayerturn().setText("Player 1 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[2][0]) {
                view.getBlocks()[2][0].setText("X");
                view.getBlocks()[2][0].setEnabled(false);
                player = 2;
                if(movesLeft<7) {
                    if((view.getBlocks()[2][0].getText().equals(view.getBlocks()[2][1].getText()) &&
                            view.getBlocks()[2][1].getText().equals(view.getBlocks()[2][2].getText())) ||
                            (view.getBlocks()[2][0].getText().equals(view.getBlocks()[1][0].getText()) &&
                                    view.getBlocks()[1][0].getText().equals(view.getBlocks()[0][0].getText())) ||
                            (view.getBlocks()[2][0].getText().equals(view.getBlocks()[1][1].getText()) &&
                                    view.getBlocks()[1][1].getText().equals(view.getBlocks()[0][2].getText()))) {
                        view.getPlayerturn().setText("Player 1 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[2][1]) {
                view.getBlocks()[2][1].setText("X");
                view.getBlocks()[2][1].setEnabled(false);
                player = 2;
                if(movesLeft<7) {
                    if((view.getBlocks()[2][1].getText().equals(view.getBlocks()[2][0].getText()) &&
                            view.getBlocks()[2][0].getText().equals(view.getBlocks()[2][2].getText())) ||
                            (view.getBlocks()[2][1].getText().equals(view.getBlocks()[1][1].getText()) &&
                                    view.getBlocks()[1][1].getText().equals(view.getBlocks()[0][1].getText()))) {
                        view.getPlayerturn().setText("Player 1 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[2][2]) {
                view.getBlocks()[2][2].setText("X");
                view.getBlocks()[2][2].setEnabled(false);
                player = 2;
                if(movesLeft<7) {
                    if((view.getBlocks()[2][2].getText().equals(view.getBlocks()[2][1].getText()) &&
                            view.getBlocks()[2][1].getText().equals(view.getBlocks()[2][0].getText())) ||
                            (view.getBlocks()[2][2].getText().equals(view.getBlocks()[2][1].getText()) &&
                                    view.getBlocks()[2][1].getText().equals(view.getBlocks()[2][0].getText())) ||
                            (view.getBlocks()[2][2].getText().equals(view.getBlocks()[1][1].getText()) &&
                                    view.getBlocks()[1][1].getText().equals(view.getBlocks()[0][0].getText()))) {
                        view.getPlayerturn().setText("Player 1 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            }
        } else {
            // Check whether player 2 won
            if(e.getSource()==view.getBlocks()[0][0]) {
                view.getBlocks()[0][0].setText("O");
                view.getBlocks()[0][0].setEnabled(false);
                player = 1;
                if(movesLeft<7) {
                    if((view.getBlocks()[0][0].getText().equals(view.getBlocks()[0][1].getText()) &&
                            view.getBlocks()[0][1].getText().equals(view.getBlocks()[0][2].getText())) ||
                            (view.getBlocks()[0][0].getText().equals(view.getBlocks()[0][1].getText()) &&
                                    view.getBlocks()[1][0].getText().equals(view.getBlocks()[2][0].getText())) ||
                            (view.getBlocks()[0][0].getText().equals(view.getBlocks()[1][1].getText()) &&
                                    view.getBlocks()[1][1].getText().equals(view.getBlocks()[2][2].getText()))) {
                        view.getPlayerturn().setText("Player 2 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[0][1]) {
                view.getBlocks()[0][1].setText("O");
                view.getBlocks()[0][1].setEnabled(false);
                player = 1;
                if(movesLeft<7) {
                    if((view.getBlocks()[0][1].getText().equals(view.getBlocks()[0][0].getText()) &&
                            view.getBlocks()[0][0].getText().equals(view.getBlocks()[0][2].getText())) ||
                            (view.getBlocks()[0][1].getText().equals(view.getBlocks()[1][1].getText()) &&
                                    view.getBlocks()[1][1].getText().equals(view.getBlocks()[2][1].getText()))) {
                        view.getPlayerturn().setText("Player 2 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[0][2]) {
                view.getBlocks()[0][2].setText("O");
                view.getBlocks()[0][2].setEnabled(false);
                player = 1;
                if(movesLeft<7) {
                    if((view.getBlocks()[0][2].getText().equals(view.getBlocks()[0][1].getText()) &&
                            view.getBlocks()[0][1].getText().equals(view.getBlocks()[0][0].getText())) ||
                            (view.getBlocks()[0][2].getText().equals(view.getBlocks()[1][2].getText()) &&
                                    view.getBlocks()[1][2].getText().equals(view.getBlocks()[2][2].getText()))) {
                        view.getPlayerturn().setText("Player 2 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[1][0]) {
                view.getBlocks()[1][0].setText("O");
                view.getBlocks()[1][0].setEnabled(false);
                player = 1;
                if(movesLeft<7) {
                    if((view.getBlocks()[1][0].getText().equals(view.getBlocks()[1][1].getText()) &&
                            view.getBlocks()[1][1].getText().equals(view.getBlocks()[1][2].getText())) ||
                            (view.getBlocks()[1][0].getText().equals(view.getBlocks()[0][0].getText()) &&
                                    view.getBlocks()[0][0].getText().equals(view.getBlocks()[2][0].getText()))) {
                        view.getPlayerturn().setText("Player 2 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[1][1]) {
                view.getBlocks()[1][1].setText("O");
                view.getBlocks()[1][1].setEnabled(false);
                player = 1;
                if(movesLeft<7) {
                    if((view.getBlocks()[1][1].getText().equals(view.getBlocks()[1][0].getText()) &&
                            view.getBlocks()[1][0].getText().equals(view.getBlocks()[1][2].getText())) ||
                            (view.getBlocks()[1][1].getText().equals(view.getBlocks()[0][1].getText()) &&
                                    view.getBlocks()[0][1].getText().equals(view.getBlocks()[2][1].getText())) ||
                            (view.getBlocks()[1][1].getText().equals(view.getBlocks()[0][0].getText()) &&
                                    view.getBlocks()[0][0].getText().equals(view.getBlocks()[2][2].getText())) ||
                            (view.getBlocks()[1][1].getText().equals(view.getBlocks()[0][2].getText()) &&
                                    view.getBlocks()[0][2].getText().equals(view.getBlocks()[2][0].getText()))) {
                        view.getPlayerturn().setText("Player 2 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[1][2]) {
                view.getBlocks()[1][2].setText("O");
                view.getBlocks()[1][2].setEnabled(false);
                player = 1;
                if(movesLeft<7) {
                    if((view.getBlocks()[1][2].getText().equals(view.getBlocks()[0][2].getText()) &&
                            view.getBlocks()[0][2].getText().equals(view.getBlocks()[2][2].getText())) ||
                            (view.getBlocks()[1][2].getText().equals(view.getBlocks()[1][1].getText()) &&
                                    view.getBlocks()[1][1].getText().equals(view.getBlocks()[1][0].getText()))) {
                        view.getPlayerturn().setText("Player 2 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[2][0]) {
                view.getBlocks()[2][0].setText("O");
                view.getBlocks()[2][0].setEnabled(false);
                player = 1;
                if(movesLeft<7) {
                    if((view.getBlocks()[2][0].getText().equals(view.getBlocks()[2][1].getText()) &&
                            view.getBlocks()[2][1].getText().equals(view.getBlocks()[2][2].getText())) ||
                            (view.getBlocks()[2][0].getText().equals(view.getBlocks()[1][0].getText()) &&
                                    view.getBlocks()[1][0].getText().equals(view.getBlocks()[0][0].getText())) ||
                            (view.getBlocks()[2][0].getText().equals(view.getBlocks()[1][1].getText()) &&
                                    view.getBlocks()[1][1].getText().equals(view.getBlocks()[0][2].getText()))) {
                        view.getPlayerturn().setText("Player 2 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[2][1]) {
                view.getBlocks()[2][1].setText("O");
                view.getBlocks()[2][1].setEnabled(false);
                player = 1;
                if(movesLeft<7) {
                    if((view.getBlocks()[2][1].getText().equals(view.getBlocks()[2][0].getText()) &&
                            view.getBlocks()[2][0].getText().equals(view.getBlocks()[2][2].getText())) ||
                            (view.getBlocks()[2][1].getText().equals(view.getBlocks()[1][1].getText()) &&
                                    view.getBlocks()[1][1].getText().equals(view.getBlocks()[0][1].getText()))) {
                        view.getPlayerturn().setText("Player 2 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            } else if(e.getSource()==view.getBlocks()[2][2]) {
                view.getBlocks()[2][2].setText("O");
                view.getBlocks()[2][2].setEnabled(false);
                player = 1;
                if(movesLeft<7) {
                    if((view.getBlocks()[2][2].getText().equals(view.getBlocks()[2][1].getText()) &&
                            view.getBlocks()[2][1].getText().equals(view.getBlocks()[2][0].getText())) ||
                            (view.getBlocks()[2][2].getText().equals(view.getBlocks()[2][1].getText()) &&
                                    view.getBlocks()[2][1].getText().equals(view.getBlocks()[2][0].getText())) ||
                            (view.getBlocks()[2][2].getText().equals(view.getBlocks()[1][1].getText()) &&
                                    view.getBlocks()[1][1].getText().equals(view.getBlocks()[0][0].getText()))) {
                        view.getPlayerturn().setText("Player 2 wins!");
                        for(int i = 0;i<3;i++) {
                            for(int j = 0;j<3;j++) {
                                view.getBlocks()[i][j].setEnabled(false);
                            }
                        }
                    } else if(movesLeft==0) {
                        view.getPlayerturn().setText("Game ends in a draw");
                    }
                }
            }
        }
    }
    

}