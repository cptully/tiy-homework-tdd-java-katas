/**
 * Last update date: Jun 28, 2009, 5:41:00 PM
 *
 * @author isa
 * @version 1.0
 */
public class PrimeNumberValidator {
    public Boolean validate(final Integer primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }

        return true;
    }
}
