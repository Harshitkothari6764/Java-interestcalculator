package interestCalculator;


import java.math.BigDecimal;
public class calculator {
	
	BigDecimal principal, rate, year;
	
	public calculator(String principal, String rate, String year) {
		
		this.principal = new BigDecimal("1000");
		this.rate = new BigDecimal("1.5");
		this.year = new BigDecimal("2");
		}
	
	public BigDecimal value() {
		
		BigDecimal value = principal.add(principal.multiply(rate.divide(new BigDecimal(100))));
		
		return value;
	}
	 	
}
