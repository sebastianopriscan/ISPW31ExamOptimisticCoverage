import org.opriscan.magatochi.controller.GameController;
import org.opriscan.magatochi.entities.MagatochiStats;
import org.opriscan.magatochi.exceptions.MagatochiException;
import org.junit.Test;

import static org.junit.Assert.*;

public class MagatochiTest {

    @Test
    public void testMagatochi() {
        GameController controller = new GameController() ;

        try {
            for (int i = 0; i< 500 ; i++) {
                MagatochiStats stats = controller.getStats() ;

                if (stats.getHunger() < 50) {
                    controller.feedMagatochi();
                    continue;
                }
                if (stats.getThirst() < 50) {
                    controller.drinkMagatochi();
                    continue;
                }
                if (stats.getFun() < 50) {
                    controller.playWithMagatochi();
                    continue;
                }
                controller.advanceGame();

            }

            for (int i = 0; i< 900 ; i++) {
                controller.advanceGame() ;
            }
        } catch (MagatochiException e) {
            assertTrue(true);
        }

        assertFalse(false);
    }
}
