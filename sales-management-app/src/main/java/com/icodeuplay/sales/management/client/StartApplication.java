package com.icodeuplay.sales.management.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.icodeuplay.base.view.swing.containers.ApplicationContainer;
import com.icodeuplay.base.view.swing.util.LookAndFeelSelector;
import com.icodeuplay.sales.management.client.screen.LoginScreen;

public class StartApplication {

	private ApplicationContainer container;

	private static Logger LOGGER = LoggerFactory.getLogger(StartApplication.class);

	private StartApplication() {
		try {

			this.container = ApplicationContainer.getInstance();
			this.container.addPanel(new LoginScreen());

		} catch (Exception e) {
			LOGGER.error("Error initialize StartApplication", e);
		}
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LookAndFeelSelector.setBusinessBluesSteel();
				new StartApplication();
			}
		});
	}

}
