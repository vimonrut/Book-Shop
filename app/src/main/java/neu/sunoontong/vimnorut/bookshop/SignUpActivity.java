package neu.sunoontong.vimnorut.bookshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private EditText nameEditText,userEditText,passwordEditText;
    private String nameString, userString, passwordString;
    private static final String urlPHP = "http://swiftcodingthai.com/neu/add_user_master.php";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        userEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);


    } //Main method

    public void clickSingUpSing(View view){

        nameString = nameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        // Check Space
        if (nameString.equals("") || userString.equals("") || passwordString.equals("") ) {
           //Have Space
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "มีช่องว่าง", "กรุณากรอกข้อความ");



        } else {
          //No Space
            uploadToserver(); 
                
            
            



        }



    } // clickSing

    private void uploadToserver() {
    }

}   // Main class
