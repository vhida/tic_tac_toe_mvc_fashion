import org.junit.Test;
import static org.junit.Assert.*;
import main.*;

import javax.swing.*;

/**
 * this is to test Model that initial state is each cell is ""
 * more testing functions can be added
 */
public class TestModel {
    @Test
    public void test() {
        View view = new View();
        Model model = new Model(view);
        JButton[][] blocks = view.getBlocks();
        for(int row = 0; row<blocks.length ;row++) {
            for(int column = 0; column<blocks[row].length ;column++) {
                assertEquals(blocks[row][column].getText(),"");
            }
        }
    }

}
