package com.icodeuplay.sales.management.client.screen;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.icodeuplay.base.common.utils.ImageUtils;
import com.icodeuplay.base.common.utils.MessageUtils;
import com.icodeuplay.base.common.utils.ScreenUtils;

public class InitialScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private static Logger LOGGER = LoggerFactory.getLogger(InitialScreen.class);

	public InitialScreen() {
		try {

			setLayout(null);
			setBounds(ScreenUtils.getBounds(600, 600, true));

			JLabel labelImage = new JLabel();
			labelImage.setBounds(325, 200, 150, 150);
			labelImage.setIcon(ImageUtils.getImage(MessageUtils.getString("app.images.login.logo")));
			add(labelImage);

		} catch (Exception e) {
			LOGGER.error("Error trying to initialize InitialScreen panel", e);
		}
	}
}
