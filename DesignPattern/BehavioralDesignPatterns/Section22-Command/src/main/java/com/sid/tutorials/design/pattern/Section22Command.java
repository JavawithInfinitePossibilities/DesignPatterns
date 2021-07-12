/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Section22Command {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();
		Light light = new Light();
		ICommand lightsOn = new LightOnCommand(light);
		ICommand lightsOff = new LightOffCommand(light);

		// switch on
		control.setCommand(lightsOn);
		control.pressButton();

		// switch off
		control.setCommand(lightsOff);
		control.pressButton();

		StockBroker broker = new StockBroker();
		Stock stock = new Stock();

		ICommand buy = new StockBuyCommend(stock);
		broker.setCommand(buy);
		broker.brokerExecution();

		ICommand sell = new StockSellCommend(stock);
		broker.setCommand(sell);
		broker.brokerExecution();
	}

}
