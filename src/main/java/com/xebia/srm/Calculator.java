package com.xebia.srm;

public class Calculator {
	private float i;
	private float j;

	public Calculator(float i, float j) {
		this.i = i;
		this.j = j;
	}

	public float add() {
		return i + j;
	}

	public float sub() {
		if (i > j) {
			return i - j;
		} else {
			return j - i;
		}
	}

	public float multiply() {
		return i * j;
	}
}
