package md.dani3lz.tmps_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import md.dani3lz.tmps_project.Assets.Account.Account;

public class LoginController {

    @FXML
    private Label errorLabel;

    @FXML
    private TextField loginInput;

    @FXML
    private PasswordField passwordInput;

    @FXML
    private Button submitBtn;

    public void submitLogIn(){
        String login = loginInput.getText();
        String password = passwordInput.getText();

        loginInput.clear();
        passwordInput.clear();
        errorLabel.setText("");

        Account account = Account.getInstance();
        boolean LogIn = account.LogIn(login, password);

        if(!LogIn){
            errorLabel.setText("Login or Password is incorrect");
        }
    }

}
