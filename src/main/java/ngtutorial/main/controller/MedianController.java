package ngtutorial.main.controller;

import java.util.List;

import ngtutorial.main.entity.Temperature;
import ngtutorial.main.service.MedianService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MedianController {

	@Autowired
	MedianService medianService;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping(value = "/median/temperature", method = RequestMethod.POST)
	public @ResponseBody String createNewUser(
			@RequestBody Temperature temperatures) {

		List<Integer> temperatureList = medianService
				.recordTemperature(temperatures.getValues());

		double currentMedian = medianService.getCurrentMedian(temperatureList);

		return String.valueOf(currentMedian);
	}

}
