package com.icodeuplay.sales.management.client.screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.icodeuplay.base.common.utils.ImageUtils;
import com.icodeuplay.base.common.utils.MessageUtils;
import com.icodeuplay.base.common.utils.ScreenUtils;
import com.icodeuplay.base.view.swing.containers.ApplicationContainer;

public class LoginScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private static Logger LOGGER = LoggerFactory.getLogger(LoginScreen.class);
	private JTextField textfieldLogin;
	private JPasswordField textfieldPassword;
	private JButton button;

	public LoginScreen() {
		try {

			setLayout(null);
			setBounds(ScreenUtils.getBounds(600, 600, true));

			JLabel labelImage = new JLabel();
			labelImage.setBounds(325, 80, 150, 150);
			labelImage.setIcon(ImageUtils.getImage(MessageUtils.getString("app.images.login.logo")));
			add(labelImage);

			JLabel labelLogin = new JLabel("Username");
			labelLogin.setBounds(300, 260, 100, 25);
			// labelLogin.setHorizontalAlignment(SwingConstants.RIGHT);
			add(labelLogin);

			textfieldLogin = new JTextField();
			textfieldLogin.setBounds(400, 260, 100, 25);
			add(textfieldLogin);

			JLabel labelPassword = new JLabel("Password");
			labelPassword.setBounds(300, 290, 100, 25);
			// labelPassword.setHorizontalAlignment(SwingConstants.RIGHT);
			add(labelPassword);

			textfieldPassword = new JPasswordField();
			textfieldPassword.setBounds(400, 290, 100, 25);
			add(textfieldPassword);

			button = new JButton("Login");
			button.setBounds(400, 330, 100, 25);
			add(button);

			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ApplicationContainer container = ApplicationContainer.getInstance();
					container.addPanel(new InitialScreen());
				}
			});

		} catch (Exception e) {
			LOGGER.error("Error trying to initialize LoginScreen panel", e);
		}
	}
}
