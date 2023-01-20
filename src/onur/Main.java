package onur;
import javax.swing.*;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		JTextField usernameField = new JTextField(20);
		JPasswordField passwordField = new JPasswordField(20);
		JPanel panel = new JPanel(new GridLayout(0,1));
		
		panel.add(new JLabel("Kullanıcı Adı:"));
		panel.add(usernameField);
		panel.add(new JLabel("Parola:"));
		panel.add(passwordField);
		int result = JOptionPane.showConfirmDialog(null, panel,"Giriş",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		if(result == JOptionPane.OK_OPTION) {
			char[] password = passwordField.getPassword();
			String username = usernameField.getText();
			System.out.println("Kullanıcı Adı: "+ username);
			System.out.print("Parola: "+ new String(password));
			
		}else {
			System.out.println("Giriş iptal edildi.");
		}
		
		
	}

}
