package com.icodeuplay.sales.management.client.screen;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.icodeuplay.base.common.utils.MessageUtils;
import com.icodeuplay.base.common.utils.ScreenUtils;
import com.icodeuplay.base.view.swing.containers.ApplicationContainer;
import com.icodeuplay.sales.management.client.LoginActionListener;

public class LoginScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private static Logger LOGGER = LoggerFactory.getLogger(LoginScreen.class);
	private JTextField textfieldUsername;
	private JPasswordField textfieldPassword;
	private JButton button;

	public LoginScreen() {
		try {

			setLayout(null);

			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBounds(ScreenUtils.getBounds(300, 150, true, ApplicationContainer.getInstance()));
			panel.setBorder(new TitledBorder(null, MessageUtils.getString("app.messages.login.title"),
					TitledBorder.LEADING, TitledBorder.TOP, null, null));
			add(panel);

			JLabel labelUsername = new JLabel(MessageUtils.getString("app.label.username"));
			labelUsername.setBounds(20, 50, 130, 25);
			panel.add(labelUsername);

			this.textfieldUsername = new JTextField();
			this.textfieldUsername.setBounds(150, 50, 130, 25);
			panel.add(this.textfieldUsername);

			JLabel labelPassword = new JLabel(MessageUtils.getString("app.label.password"));
			labelPassword.setBounds(20, 80, 130, 25);
			panel.add(labelPassword);

			this.textfieldPassword = new JPasswordField();
			this.textfieldPassword.setBounds(150, 80, 130, 25);
			panel.add(this.textfieldPassword);

			this.button = new JButton(MessageUtils.getString("app.label.login"));
			this.button.setBounds(200, 110, 80, 25);
			panel.add(this.button);

			this.button.addActionListener(new LoginActionListener());

		} catch (Exception e) {
			LOGGER.error("Error trying to initialize LoginScreen panel", e);
		}
	}
}
