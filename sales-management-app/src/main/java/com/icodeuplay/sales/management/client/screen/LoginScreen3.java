package com.icodeuplay.sales.management.client.screen;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.icodeuplay.base.common.utils.ScreenUtils;
import com.icodeuplay.base.view.swing.containers.ApplicationContainer;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class LoginScreen3 extends JPanel {

	private static final long serialVersionUID = 1L;

	private static Logger LOGGER = LoggerFactory.getLogger(LoginScreen3.class);
	private JTextField textfieldLogin;
	private JPasswordField textfieldPassword;
	private JButton button;

	public LoginScreen3() {
		try {
			setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "message", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(135, 100, 158, 124);
			add(panel_1);

		} catch (Exception e) {
			LOGGER.error("Error trying to initialize LoginScreen panel", e);
		}
	}
}
