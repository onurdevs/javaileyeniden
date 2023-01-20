package onur;
import javax.swing.*;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		/*JTextField usernameField = new JTextField(20);
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
		}*/
		Frame frame = new Frame("My AWT Application");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        MenuBar menuBar = new MenuBar();
        frame.setMenuBar(menuBar);

        Menu fileMenu = new Menu("File");
        menuBar.add(fileMenu);

        MenuItem newItem = new MenuItem("New");
        fileMenu.add(newItem);

        MenuItem openItem = new MenuItem("Open");
        fileMenu.add(openItem);

        MenuItem saveItem = new MenuItem("Save");
        fileMenu.add(saveItem);

        fileMenu.addSeparator();

        MenuItem exitItem = new MenuItem("Exit");
        fileMenu.add(exitItem);

        Menu editMenu = new Menu("Edit");
        menuBar.add(editMenu);

        MenuItem cutItem = new MenuItem("Cut");
        editMenu.add(cutItem);

        MenuItem copyItem = new MenuItem("Copy");
        editMenu.add(copyItem);

        MenuItem pasteItem = new MenuItem("Paste");
        editMenu.add(pasteItem);
		
		
	}

}
