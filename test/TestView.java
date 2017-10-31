import org.junit.Test;
import static org.junit.Assert.*;
import main.*;
/**
 * this is to test View that 9 cells are present and the initial display is corrent
 * more testing functions can be added
 */
public class TestView {
    @Test
    public void test() {
        View view = new View();
        assertEquals(9, view.getGrid().length*view.getGrid()[0].length);
        assertEquals(Constants.INSTR_PLAYER_1, view.getPlayerturn().getText());
    }

}
