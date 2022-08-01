package test.cgpa_cal_1_1;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SecondaryController implements Initializable{




    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    
        @FXML
    private TableColumn<User, Integer> CGPATable;

    @FXML
    private TableColumn<User, Integer> IDTable;

    @FXML
    private Button Search;

    @FXML
    private Label Status;

    @FXML
    private TableColumn<User, String> Sub1Table;

    @FXML
    private TableColumn<User, String> Sub2Table;

    @FXML
    private TableColumn<User, String> Sub3Table;

    @FXML
    private TableColumn<User, String> Sub4Table;

    @FXML
    private TableColumn<User, String> Sub5Table;

    @FXML
    private TableView<User> Table;

    private TextArea result;
    

    @FXML
    private Label resultSub1;

    @FXML
    private Label resultSub2;

    @FXML
    private Label resultSub3;

    @FXML
    private Label resultSub4;

    @FXML
    private Label resultSub5;

      @FXML
    private Label resultCGPA;

    @FXML
    private Button secondaryButton;

    @FXML
    private TextField tID;
    
    
 ObservableList<User>list = FXCollections.observableArrayList();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
        
         DatabaseConnection con = new DatabaseConnection();
      Connection connectDB = con.getDBConnection();
      
      
      String sql = "select * from Calulate_CGPA";
      try{
          
    
        st=connectDB.createStatement();
          rs=st.executeQuery(sql);
          
          
          while(rs.next())
          {
              Integer ID = rs.getInt("ID");
              String Subject1 = rs.getString("Subject1");

              //String Subject1 = rs.getString("Subject1");
              String Subject2 = rs.getString("Subject2");
              String Subject3 = rs.getString("Subject3");
              String Subject4 = rs.getString("Subject4");
              String Subject5 = rs.getString("Subject5");
              Integer CGPA = rs.getInt("CGPA");
//String Animal = rs.getString("Animal");
            
            
             
              list.add(new User(ID, Subject1, Subject2, Subject3, Subject4, Subject5, CGPA)  );           
              
          }
          
          
          
          IDTable.setCellValueFactory(new  PropertyValueFactory<>("ID"));
          Sub1Table.setCellValueFactory(new  PropertyValueFactory<>("Subject1"));
          Sub2Table.setCellValueFactory(new  PropertyValueFactory<>("Subject2"));
          Sub3Table.setCellValueFactory(new  PropertyValueFactory<>("Subject3"));
          Sub4Table.setCellValueFactory(new  PropertyValueFactory<>("Subject4"));
          Sub5Table.setCellValueFactory(new  PropertyValueFactory<>("Subject5"));
          CGPATable.setCellValueFactory(new  PropertyValueFactory<>("CGPA"));
          
          Table.setItems(list);
         
          
          
          
      }catch(Exception e)
      {
          
      }
        // TODO
    }    

    


    
    

     
    Statement st;
    ResultSet rs;
    Connection con;
 
    
    String userName="root";
    String password="MiniSh03@";
    String dbMachine="localhost";
    String dbName="Calculate_CGPA";
    String url="jdbc:mysql://" +dbMachine +  "/" + dbName;
    @FXML
    void doSearch(ActionEvent event)
    {
         int ID = Integer.parseInt(tID.getText());

            String sql = "select * from Calculate_CGPA where ID = " +ID ;
        
    
            
            
            
            
            
            
            
          try{
            
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection(url, userName, password);
             st = con.createStatement();
             
            rs=st.executeQuery(sql);
            
            if(rs.next())
            {
               
                resultSub1.setText(rs.getString(2));
                resultSub2.setText(rs.getString(3));
                resultSub3.setText(rs.getString(4));
                resultSub4.setText(rs.getString(5));
                resultSub5.setText(rs.getString(6));
                resultCGPA.setText(rs.getString(7));
                
                
                Status.setText("Found ...");
            }
            else
            {
                resultSub1.setText("");
                resultSub2.setText("");
                resultSub3.setText("");
                resultSub4.setText("");
                resultSub5.setText("");
                Status.setText("ID Doesn't Exist ...");
            }
          
            
            //Status.setText("Successfully saved ...");
            // showInformationAlert();  
          }catch(Exception e)
        {
           // showInformation();
            Status.setText("" +e);
                  
        }
        
         
    }

   
    
    
    
}