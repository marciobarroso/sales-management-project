package com.icodeuplay.sales.management.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.icodeuplay.base.common.utils.MessageUtils;
import com.icodeuplay.base.view.swing.containers.ApplicationContainer;
import com.icodeuplay.sales.management.client.screen.InitialScreen;

public class LoginActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		ApplicationContainer container = ApplicationContainer.getInstance();

		// do the logic to load menus

		// default application menu
		JMenu system = new JMenu(MessageUtils.getString("app.menu.system"));
		JMenuItem exit = new JMenuItem(MessageUtils.getString("app.menu.exit"));
		system.add(exit);
		
		// add menu
		container.addMenu(system);
		
		// add actions
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (MessageUtils.showConfirmDialog(null, MessageUtils.getString("app.messages.exit.confirm"),
						MessageUtils.getString("app.messages.exit.confirm.title"),
						MessageUtils.INFORMATION_MESSAGE_TYPE)) {
					System.exit(1);
				}
			}
		});
		
		// set initial screen
		container.addPanel(new InitialScreen());
	}

}