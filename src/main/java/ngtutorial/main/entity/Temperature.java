package ngtutorial.main.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Temperature implements Serializable{
	
	private static final long serialVersionUID = 6488773257818709174L;
	
	private String values;
	private String median;
	
	/**
	 * @return the values
	 */
	public String getValues() {
		return values;
	}

	/**
	 * @param values the values to set
	 */
	public void setValues(String values) {
		this.values = values;
	}

	/**
	 * @return the median
	 */
	public String getMedian() {
		return median;
	}

	/**
	 * @param median the median to set
	 */
	public void setMedian(String median) {
		this.median = median;
	}

}
