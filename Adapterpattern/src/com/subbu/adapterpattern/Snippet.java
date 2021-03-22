package com.subbu.adapterpattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Snippet {
 @Test 
 public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() 
	{ 
	Movable bugattiVeyron = new BugattiVeyron();
	MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);	
	assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}
}

