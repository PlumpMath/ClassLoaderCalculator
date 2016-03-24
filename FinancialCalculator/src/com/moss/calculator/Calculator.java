package com.moss.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

	public static BigDecimal round(double number) {
		return new BigDecimal(number).setScale(0, RoundingMode.HALF_EVEN);
	}

}
