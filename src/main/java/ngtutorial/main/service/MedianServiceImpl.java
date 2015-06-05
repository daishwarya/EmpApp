package ngtutorial.main.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MedianServiceImpl implements MedianService {

	@Override
	public List<Integer> recordTemperature(final String temperatures) {
		final List<Integer> temperatureList = new ArrayList<Integer>();
		
		final String delimiter = ",";
		final String[] temp = temperatures.split(delimiter);
		
		for(int i =0; i < temp.length ; i++){
			temperatureList.add(Integer.parseInt(temp[i].trim()));
		}
		
		Collections.sort(temperatureList);

		return temperatureList;
	}

	@Override
	public double getCurrentMedian(final List<Integer> temperatureList) {
		
		final double median;
		
		if (temperatureList.size() % 2 == 1){
			median = temperatureList.get((temperatureList.size()+1)/2-1);
			
		} else {
			double lower = temperatureList.get(temperatureList.size()/2-1);
			double upper = temperatureList.get(temperatureList.size()/2);
			
			median = (lower + upper) / 2.0;
		}
		 
		return median;
	}

}
