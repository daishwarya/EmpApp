package ngtutorial.main.service;

import java.util.List;

/**
 * Services to find median temperatures.
 *
 */
public interface MedianService {
	
	/**
	 * @param value
	 */
	List<Integer> recordTemperature(String numbers);
	
    /**
     * @return
     */
	double getCurrentMedian(final List<Integer> temperatureList);

}
