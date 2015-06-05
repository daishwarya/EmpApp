package ngtutorial.main.service;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MedianServiceImplTest {

	@InjectMocks
	MedianServiceImpl medianService;

	private String temperatures;

	@Before
	public void setup() {
		temperatures = "98, 76, 89, 99, 75, 83, 20, 91, 45, 78, 67, 88";
	}

	@Test
	public void testRecordTemperature() {

		List<Integer> sortedList = medianService
				.recordTemperature(temperatures);

		Assert.assertThat(sortedList.size(), CoreMatchers.is(12));
		Assert.assertThat(sortedList.get(0), CoreMatchers.is(20));
		Assert.assertThat(sortedList.get(11), CoreMatchers.is(99));
	}

	@Test
	public void testGetCurrentMedian() {

		List<Integer> temperatureList = medianService
				.recordTemperature(temperatures);
		double currentMedian = medianService.getCurrentMedian(temperatureList);

		Assert.assertThat(currentMedian, CoreMatchers.is(80.5));

	}

}
