import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SemanaDez extends JFrame implements ActionListener{
   
   
   
   private JLabel texto;
   private JTextField texto1;
   private JButton mostrar;
   private JButton sair;
   private JButton limpar;
   
   public SemanaDez (){
   
      super("Semana 10");
      
      JPanel painelEntrada = new JPanel(new FlowLayout());
      
      texto = new JLabel("Texto");
            
      texto1 = new JTextField(10);
      
      painelEntrada.add(texto);
      painelEntrada.add(texto1);
      
           
      JPanel painelBotoes = new JPanel(new FlowLayout());
      
      limpar = new JButton("Limpar");
      sair = new JButton("Sair");
      mostrar = new JButton("Mostar");

      painelBotoes.add(mostrar);
      painelBotoes.add(limpar);
      painelBotoes.add(sair);
      
      Container caixa = getContentPane();
      caixa.setLayout(new BorderLayout());
      caixa.add(painelEntrada, BorderLayout.WEST);
      
      caixa.add(painelBotoes, BorderLayout.SOUTH);
      mostrar.addActionListener(this);
      sair.addActionListener(this);
      limpar.addActionListener(this);
      
      setSize(710, 190);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
      
   }
   
       public void actionPerformed(ActionEvent e) {
       if (e.getSource() == mostrar) { 
           String textoEscrito = texto.getText();
           JOptionPane.showMessageDialog(null, textoEscrito);
       }else if (e.getSource() == limpar) { 
           texto1.setText("");
           
       }else if (e.getSource() == sair) { 
           System.exit(0);
       }
       
    }
   
}