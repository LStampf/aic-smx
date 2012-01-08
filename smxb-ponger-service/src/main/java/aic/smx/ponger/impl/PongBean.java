package aic.smx.ponger.impl;

import aic.smx.ponger.Pong;

public class PongBean implements Pong {

	@Override
	public String pong(String message) {
		return "Pong from service to [" + message + "]";
	}

}
