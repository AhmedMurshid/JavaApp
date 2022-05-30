import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyAppBlog {
   private JFrame mainFrame;
   private JFrame subFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private JLabel msglabel;
   
   public MyAppBlog(){
      prepareGUI();
   }
   public static void main(String[] args){
      MyAppBlog MyAppBlog = new MyAppBlog();  
      MyAppBlog.SignInPage(); 
   }
   private void prepareGUI(){
      mainFrame = new JFrame("My Blog");
      mainFrame.setSize(542,808);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        
      statusLabel.setSize(650,100);
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());
      

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   public void SignInPage(){
      headerLabel.setText("Start making blogs!!!"); 
      headerLabel.setFont(new Font("Calibri", Font.BOLD, 40));
      statusLabel.setText("it is me!!");
      JPanel panel = new JPanel();
      //panel.setBackground(Color.gray);
      panel.setSize(500,500);
      GridLayout layout = new GridLayout(0,1);
      layout.setHgap(100);
      layout.setVgap(20);
      
      JButton signup = new JButton("Sign up");
      JButton signin = new JButton("Sign in");
      signin.setPreferredSize(new Dimension(350, 50));
      signup.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e)            {
                //Here goes the action (method) you want to execute when clicked
                System.out.println("You clicked the button load");
                SignUp();
            }
        });       
      
      panel.setLayout(layout);        
      panel.add(signin);
      panel.add(signup); 
      controlPanel.add(panel);
      mainFrame.setVisible(true);  
   }
   private void SignUp(){
    subFrame = new JFrame("My Blog");
    subFrame.setSize(342,208);
    subFrame.setLayout(new GridLayout(3, 1));
    subFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });   
      
    JLabel headerLabel = new JLabel("",JLabel.CENTER);
    headerLabel.setText("Make an account!");
    headerLabel.setFont(new Font("Calibri", Font.BOLD, 40));
    
    JTextField un,pw;  
    un =new JTextField("Enter a username.");  
    un.setBounds(50,50, 50,30);  
    pw=new JTextField("Enter a password.");  
    pw.setBounds(50,50, 50,30);  
    
    JPanel p = new JPanel();
    p.setSize(10,10);

    GridLayout layout = new GridLayout(0,1);
    
    p.setLayout(layout);
    subFrame.add(headerLabel);
    p.add(un);
    p.add(pw);
    subFrame.add(p);
    subFrame.setVisible(true);
    //headerLabel.setVisible(true);
    }
    
}