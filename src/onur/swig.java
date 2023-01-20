package onur;

import javax.swing.*;

public class swig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pencere oluşturma
		JFrame frame = new JFrame("Example");

		// Menü çubuğu oluşturma
		JMenuBar menuBar = new JMenuBar();

		// Pencere boyutunu ayarla
		frame.setSize(300, 200);

		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");

		JMenu subMenu = new JMenu("New");
		subMenu.add(new JMenuItem("Text Document"));
		subMenu.add(new JMenuItem("Excel Document"));

		JMenuItem oldMenu = new JMenuItem("Open");

		// Menü çubuğuna menüleri ekleme
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		fileMenu.add(subMenu);
		fileMenu.add(oldMenu);

		// Menü çubuğunu pencereye ekleme
		frame.setJMenuBar(menuBar);

		// Pencere kapatıldığında programı sonlandır
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Pencereyi görünür hale getir
		frame.setVisible(true);
	}

}
