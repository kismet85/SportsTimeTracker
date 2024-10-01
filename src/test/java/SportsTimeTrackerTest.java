import com.ismet.SportsTimeTracker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SportsTimeTrackerTest {
    private SportsTimeTracker tracker;

    @BeforeEach
    public void setUp() {
        tracker = new SportsTimeTracker();
    }

    @Test
    public void testLogActivity() {
        tracker.logActivity("Running", 30);
        assertEquals(1, tracker.getActivities().size());
        assertTrue(tracker.getActivities().containsKey("Running"));
        assertEquals(30, tracker.getActivities().get("Running"));
    }

    @Test
    public void testViewActivities() {
        tracker.logActivity("Running", 30);
        tracker.logActivity("Swimming", 45);
        assertEquals(2, tracker.getActivities().size());
    }

    @Test
    public void testCalculateTotalTime() {
        tracker.logActivity("Running", 30);
        tracker.logActivity("Swimming", 45);
        assertEquals(75, tracker.calculateTotalTime());
    }
}
