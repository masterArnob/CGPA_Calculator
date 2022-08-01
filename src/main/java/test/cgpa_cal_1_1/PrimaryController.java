package test.cgpa_cal_1_1;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable{

    
    @FXML
    private TextField tID;
    @FXML
    private TextField Sub1TF;
    @FXML
    private TextField g1;
    @FXML
    private TextField Sub2TF;
    @FXML
    private TextField g2;
    @FXML
    private TextField Sub3TF;
    @FXML
    private TextField g3;
    @FXML
    private TextField Sub4TF;
    @FXML
    private TextField g4;
    @FXML
    private Label Status;
    @FXML
    private TextField Sub5TF;
    @FXML
    private TextField g5;
    @FXML
    private Button Calculate;
    @FXML
    private Button Save;
    @FXML
    private Button Update;
    @FXML
    private Button Delete;
    @FXML
    private Button Clear;
    @FXML
    private TextField gpaTF;


      @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    
    
    

    @FXML
    private Button primaryButton;

    
    
    
    
    
    
    Statement st;
    ResultSet rs;
    Connection con;
 
    
    String userName="root";
    String password="MiniSh03@";
    String dbMachine="localhost";
    String dbName="Calculate_CGPA";
    String url="jdbc:mysql://" +dbMachine +  "/" + dbName;
    
    
    
    @FXML
     public void doCalculate(ActionEvent event)
    {
        
        String sub1, sub2, sub3, sub4,sub5;
        
        sub1 = Sub1TF.getText();
        sub2=Sub2TF.getText();
        sub3=Sub3TF.getText();
        sub4=Sub4TF.getText();
        sub5 = Sub5TF.getText();
        
        
        double gpa=0;
        String num1,num2,num3,num4,num5;
        
        num1 = g1.getText();
        num2 = g2.getText();
        num3 = g3.getText();
        num4=  g4.getText();
        num5 = g5.getText();
        
        if(num1.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num1.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num1.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num1.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num1.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num1.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num1.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num1.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num1.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num1.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        if(num2.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num2.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num2.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num2.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num2.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num2.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num2.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num2.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num2.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num2.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        
        
        
        if(num3.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num3.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num3.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num3.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num3.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num3.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num3.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num3.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num3.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num3.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        
        
        if(num4.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num4.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num4.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num4.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num4.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num4.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num4.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num4.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num4.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num4.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        
        
        
        
        
        
        if(num5.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num5.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num5.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num5.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num5.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num5.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num5.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num5.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num5.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num5.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        
        gpa  = gpa / 5 ;
        gpaTF.setText(Double.toString(gpa));
        
        
        
        
    

    }

    @FXML
    void doClear(ActionEvent event) 
    {
        Sub1TF.setText("");
        Sub2TF.setText("");
        Sub3TF.setText("");
        Sub4TF.setText("");
        Sub5TF.setText("");
        gpaTF.setText("");
        g1.setText("");
        g2.setText("");
        g3.setText("");
        g4.setText("");
        g5.setText("");
        tID.setText("");

    }

    @FXML
    void doDelete(ActionEvent event) 
    {
        
        
        
         int ID=Integer.parseInt(tID.getText());
       
      
       String sql = "delete from Calculate_CGPA where ID = " +ID ;
     
       
       try{
            
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection(url, userName, password);
             st = con.createStatement();
            
            st.executeUpdate(sql);
           
            Status.setText("Successfully deleted ...");
           
        }catch(Exception e)
        {
            Status.setText("" +e);
       
        }

    }

    @FXML
    void doSave(ActionEvent event)
    {
       
        int ID = Integer.parseInt(tID.getText());
        
       
        
        
        String num1,num2,num3,num4,num5;
        
      String sub1, sub2, sub3, sub4,sub5;
        
        sub1 = Sub1TF.getText();
        sub2=Sub2TF.getText();
        sub3=Sub3TF.getText();
        sub4=Sub4TF.getText();
        sub5 = Sub5TF.getText();
        
        
        double gpa=0;
       
        
        num1 = g1.getText();
        num2 = g2.getText();
        num3 = g3.getText();
        num4=  g4.getText();
        num5 = g5.getText();
        
        if(num1.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num1.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num1.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num1.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num1.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num1.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num1.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num1.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num1.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num1.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        if(num2.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num2.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num2.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num2.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num2.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num2.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num2.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num2.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num2.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num2.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        
        
        
        if(num3.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num3.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num3.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num3.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num3.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num3.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num3.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num3.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num3.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num3.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        
        
        if(num4.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num4.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num4.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num4.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num4.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num4.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num4.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num4.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num4.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num4.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        
        
        
        
        
        
        if(num5.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num5.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num5.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num5.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num5.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num5.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num5.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num5.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num5.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num5.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        gpa = gpa / 5;
       
        
        
        //doCalculate();
        
        String sql = "insert into Calculate_CGPA values(" +ID + ",'"+num1+"','"+num2+"','"+num3+"','"+num4+"','"+num5 +"',"+gpa +")";
        
    
          try{
            
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection(url, userName, password);
             st = con.createStatement();
             
            st.executeUpdate(sql);
            
            
            Status.setText("Successfully saved ...");
            // showInformationAlert();  
          }catch(Exception e)
        {
            //showInformation();
            Status.setText("" +e);
                  
        } 

    }

    @FXML
    void doUpdate(ActionEvent event)
    {
          int ID = Integer.parseInt(tID.getText());
        
       
        
        
        String num1,num2,num3,num4,num5;
        
      String sub1, sub2, sub3, sub4,sub5;
        
        sub1 = Sub1TF.getText();
        sub2=Sub2TF.getText();
        sub3=Sub3TF.getText();
        sub4=Sub4TF.getText();
        sub5 = Sub5TF.getText();
        
        
        double gpa=0;
       
        
        num1 = g1.getText();
        num2 = g2.getText();
        num3 = g3.getText();
        num4=  g4.getText();
        num5 = g5.getText();
        
        if(num1.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num1.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num1.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num1.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num1.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num1.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num1.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num1.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num1.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num1.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        if(num2.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num2.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num2.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num2.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num2.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num2.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num2.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num2.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num2.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num2.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        
        
        
        if(num3.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num3.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num3.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num3.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num3.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num3.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num3.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num3.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num3.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num3.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        
        
        if(num4.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num4.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num4.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num4.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num4.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num4.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num4.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num4.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num4.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num4.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        
        
        
        
        
        
        if(num5.equalsIgnoreCase("A+"))
        {
            gpa = gpa + 4.0;
        }
        else if(num5.equalsIgnoreCase("A"))
        {
            gpa = gpa + 3.75;
        }
        else if(num5.equalsIgnoreCase("A-"))
        {
            gpa = gpa + 3.50;
        }
        else if(num5.equalsIgnoreCase("B+"))
        {
            gpa = gpa +3.25;
        }
        else if(num5.equalsIgnoreCase("B"))
        {
            gpa = gpa + 3.00;
        }
        else if(num5.equalsIgnoreCase("B-"))
        {
            gpa = gpa + 2.75;
        }
        else if(num5.equalsIgnoreCase("C+"))
        {
            gpa = gpa + 2.50;
        }
        else if(num5.equalsIgnoreCase("C"))
        {
            gpa = gpa + 2.25;
        }
        else if(num5.equalsIgnoreCase("D"))
        {
            gpa = gpa +2.00;
        }
        else if(num5.equalsIgnoreCase("F"))
        {
            gpa = gpa + 0.0;
        }
        
        
        
        
        gpa = gpa / 5;
        gpaTF.setText(Double.toString(gpa));
        
        
        //doCalculate();
        
        

       
      
        //String sql = "update test34 set Name = '" +Name "', Address = '" +Address +"', Phone = '" +Phone +"', Email = '" +Email +"', Dept = '" +Dept +"' where ID = " +ID ;  
       
       String sql = "update  Calculate_CGPA set Subject1 = '" +num1 +"' , Subject2 ='" +num2 +"' , Subject3 = ' " +num3 +"' , Subject4 = ' " +num4 +" ' ,  Subject5 = '"+num5  +"' ,CGPA = " +gpa  +"where ID = " +ID ; 
       
       try{
            
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection(url, userName, password);
             st = con.createStatement();
            
            st.executeUpdate(sql);
            Status.setText("Successfully updated ...");
        }catch(Exception e)
        {
            Status.setText("" +e);
        }

    }
    
    
 

    /**
     * Initializes the controller class.
     */
    

    
}
