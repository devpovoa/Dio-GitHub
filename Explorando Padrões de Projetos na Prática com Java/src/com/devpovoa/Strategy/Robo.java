package com.devpovoa.Strategy;

public class Robo {

	private Behavior strategy;

	public void setStrategy(Behavior strategy) {
		this.strategy = strategy;
	}

	public void mover() {
		strategy.mover();
	}
}
