import java.awt.*;
import java.util.*;

import javax.swing.*;

public class Janela{

    private ArrayList<Qqcoisa> umaLista;

    private JTextField tfDesc;
    private JTextField pfPeso;
    private JTextField tfVol;
    private JTextField tfValor;
    private JButton btLogin;
    private JRadioButton btSensivel, btSensivel2;


    public Janela(){
        this.umaLista = new ArrayList<>();

        JFrame frame = new JFrame("Trabalho POO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel lbDesc = new JLabel("Descricao ");
        tfDesc = new JTextField(20);
        linha1.add(lbDesc);
        linha1.add(tfDesc);
        
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel lbPass = new JLabel("Peso em KiloGramas ");
        pfPeso = new JTextField(20);
        linha2.add(lbPass);
        linha2.add(pfPeso);
    
        
        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel lbVol = new JLabel("Volume em Litros ");
        tfVol = new JTextField(20);
        linha3.add(lbVol);
        linha3.add(tfVol);

        JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel lbValor = new JLabel("Valor aproximado da carga ");
        tfValor = new JTextField(20);
        linha3.add(lbValor);
        linha3.add(tfValor);
        
        JPanel linha5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btImprime = new JButton("Imprimir");
        JLabel lbEmpty2 = new JLabel(" ");
        btLogin = new JButton("Salvar");
        linha4.add(btLogin);
        linha4.add(lbEmpty2);
        linha4.add(btImprime);

        JPanel linha6 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel label= new JLabel("Sensivel a calor");
        JLabel lbEmpty3= new JLabel(" ");
        btSensivel= new JRadioButton("Sim ");
        ButtonGroup bGroup= new ButtonGroup();
        btSensivel2 = new JRadioButton("Não");
        linha5.add(label);
        linha5.add(lbEmpty3);
        linha5.add(btSensivel);
        linha5.add(btSensivel2);
        bGroup.add(btSensivel);
        bGroup.add(btSensivel2);

        

        
        
       
            
        
        
        
        JFrame frame2 = new JFrame("Exemplo - menus");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    //ACTIONLISTENER ZONE
        btLogin.addActionListener(e -> {
            try {
                String descricao = tfDesc.getText();
                float peso = (float) Double.parseDouble(pfPeso.getText()); 
                float volume = (float) Double.parseDouble(tfVol.getText());
                float valor = (float) Double.parseDouble(tfValor.getText());
                boolean sensivel = btSensivel.isSelected();
                umaLista.add(new Qqcoisa(descricao,peso,volume,valor,sensivel));

            } catch (Exception exc) {
                JOptionPane.showMessageDialog(null, "erro de conversao de tipo", "Erro", JOptionPane.WARNING_MESSAGE);
            }


        });

        btImprime.addActionListener(e -> {

            for(Qqcoisa q : umaLista)
                System.out.println(q);

        });



        
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
