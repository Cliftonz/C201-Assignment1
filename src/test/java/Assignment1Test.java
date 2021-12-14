import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assignment1Test {
    // Notice that the tests are extremely descriptive; this is the industry standard and is expected
    @Test
    @DisplayName("1000 With 4.25 Percent Over 1 Year")
    void calculateFutureInvestment1000With425PercentOver1Year() {
        assertEquals(1647.83, Assignment1.CalculateFutureInvestment(1000,4.25,1),0.01);
    }

    @Test
    @DisplayName("1000 With 4.25 Percent Over 5 Year")
    void calculateFutureInvestment1000With425PercentOver5Years() {
        assertEquals(12149.65, Assignment1.CalculateFutureInvestment(1000,4.25,5), 0.01);
    }

    @Test
    @DisplayName("1000 With 7.73 Percent Over 7 Year")
    void calculateFutureInvestment1000With7Point73PercentOver7Years() {
        assertEquals(520330.67, Assignment1.CalculateFutureInvestment(1000,7.73,7), 0.01);
    }

    @Test
    @DisplayName("3861 With 2.654 Percent Over 11 Year")
    void calculateFutureInvestment3861With2Point654PercentOver11Years() {
        assertEquals(122550.62, Assignment1.CalculateFutureInvestment(3861,2.654,11), 0.01);
    }

    @Test
    @DisplayName("10000 With 3.75 Percent Over 30 Year")
    void calculateFutureInvestment10000With3Point75PercentOver30Years() {
        assertEquals(5.697940872912674E9, Assignment1.CalculateFutureInvestment(10000,3.75,30), 0.01);
    }

}