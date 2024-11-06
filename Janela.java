import java.awt.*;
import java.util.*;

import javax.swing.*;

public class Janela{

    private ArrayList<Qqcoisa> umaLista;

    private JTextField tfUser;
    private JTextField pfPass;
    private JTextField tfSal;
    private JButton btLogin;
    private JRadioButton btSensivel, btSensivel2, btBicicletas, btMotocicletas, btVeiculosC, btCaminhoes, btCaminhoesRefri;


    public Janela(){
        this.umaLista = new ArrayList<>();

        JFrame frame = new JFrame("Exercicio-Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel lbUser = new JLabel("ID ");
        tfUser = new JTextField(20);
        linha1.add(lbUser);
        linha1.add(tfUser);
        
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel lbPass = new JLabel("Nome ");
        pfPass = new JTextField(20);
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
        JButton btImprime = new JButton("Imprimir");
        JLabel lbEmpty2 = new JLabel(" ");
        btLogin = new JButton("Salvar");
        linha4.add(btLogin);
        linha4.add(lbEmpty2);
        linha4.add(btImprime);

        JPanel linha5 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel label= new JLabel("Sensivel a calor");
        JLabel lbEmpty3= new JLabel(" ");
        btSensivel= new JRadioButton("Sim ");
        btSensivel2 = new JRadioButton("Não");
        linha5.add(label);
        linha5.add(lbEmpty3);
        linha5.add(btSensivel);
        linha5.add(btSensivel2);
        
        JPanel linha6 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel Trans= new JLabel("Escolha o método de transporte");
        btBicicletas = new JRadioButton("Bicicleta ");
        btMotocicletas = new JRadioButton("Motocicleta");
        btVeiculosC= new JRadioButton("Veiculo Convencional ");
        btCaminhoes = new JRadioButton("Caminhão");
        btCaminhoesRefri= new JRadioButton("Caminhão Refrigerado");
        linha6.add(Trans);
        linha6.add(btBicicletas);
        linha6.add(btMotocicletas);
        linha6.add(btVeiculosC);
        linha6.add(btCaminhoes);
        linha6.add(btCaminhoesRefri);
            
        
        
        
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


    //ACTIONLISTENER ZONE
        btLogin.addActionListener(e -> {
            String id = tfUser.getText();
            String nome = "Um nome qualquer";
            float salario = (float) Double.parseDouble(tfSal.getText());
            boolean sensivel = btSensivel.isSelected();

            umaLista.add(new Qqcoisa( id, nome, salario, sensivel));


        });

        btImprime.addActionListener(e -> {

            for(Qqcoisa q : umaLista)
                System.out.println(q);

        });

        Trans.addActionListener(e->{
            if()
        })




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
        contentPane.add(linha5);
        contentPane.add(linha6);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        }

}
