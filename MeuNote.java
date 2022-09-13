import javax.swing.JFrame;
import javax.swing.JTextArea;
 
public class MeuNote extends JFrame{
  
  private JTextArea texto = new JTextArea();
 
   public MeuNote(){
     super("Meu Notepad");
     this.montaJanela();
   } 
 
   private void montaJanela(){
      this.getContentPane().add(texto);
   }
    
     public static void main(String[] args){
       //Cria objeto:
       MeuNote janela = new MeuNote();
       janela.setSize(640,480);
       janela.setVisible(true);
   }
}
