import java.awt.*;

import javax.swing.*;


public class App {
    public static void main(String[] args){
    JFrame frame = new JFrame("Exercicio-Swing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.LEADING));
    JLabel lbUser = new JLabel("ID ");
    JTextField tfUser = new JTextField(20);
    linha1.add(lbUser);
    linha1.add(tfUser);
    
    JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
    JLabel lbPass = new JLabel("Nome ");
    JPasswordField pfPass = new JPasswordField(20);
    linha2.add(lbPass);
    linha2.add(pfPass);
   
    
    JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.LEADING));
    JLabel lbSal = new JLabel("Salario ");
    JLabel lbEmpty = new JLabel(" ");
    JTextField tfSal = new JTextField(20);
    linha3.add(lbSal);
    linha3.add(lbEmpty);
    linha3.add(tfSal);
    
    JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JButton btClean = new JButton("Limpar");
    JLabel lbEmpty2 = new JLabel(" ");
    JButton btLogin = new JButton("Salvar");
    linha4.add(btLogin);
    linha4.add(lbEmpty2);
    linha4.add(btClean);


    
    
    
    JFrame frame2 = new JFrame("Exemplo - menus");
 frame.setSize(400, 400);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JMenu fileMenu = new JMenu("Arquivo");
 fileMenu.add(new JMenuItem("Abrir texto"));
 fileMenu.add(new JMenuItem("Abrir binário"));
 fileMenu.add(new JMenuItem("Abrir json"));
 fileMenu.addSeparator();
 fileMenu.add(new JMenuItem("Salvar texto"));
 fileMenu.add(new JMenuItem("Salvar binário"));
 fileMenu.add(new JMenuItem("Salvar json"));

 JMenu editMenu = new JMenu("Ajuda");
 JMenuBar menubar = new JMenuBar();
 menubar.add(fileMenu);
 menubar.add(editMenu);

 frame.setJMenuBar(menubar);
 frame.setVisible(true);

    Container contentPane = frame.getContentPane();
    Container contentPane2 = frame2.getContentPane();
    contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.PAGE_AXIS));
    contentPane2.setLayout(new BoxLayout(contentPane,BoxLayout.PAGE_AXIS));
    contentPane.add(linha1);
    contentPane.add(linha2);
    contentPane.add(linha3);
    contentPane.add(linha4);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    }
}