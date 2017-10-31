import main.Controller;
import main.Model;
import main.View;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

/**
 * THis is to test Controller
 * that clicking on Cell[0,0] shows 'X' that listener works.
 * more testings can be added.
 */
public class TestController {
    @Test
    public void test() {
        View view = new View();
        Model model = new Model(view);
        Controller ctr = new Controller(model);
        JButton[][] blocks = view.getBlocks();
        blocks[0][0].doClick();
        assertEquals(blocks[0][0].getText(),"X");

    }
}

