package md.dani3lz.tmps_project.Assets.Account;

import md.dani3lz.tmps_project.Assets.Component;
import md.dani3lz.tmps_project.Assets.InitComponents;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Objects;

public class Account {
    private boolean LogIn = false;

    private String login;
    private String password;
    private String role;

    public boolean LogIn(String login, String password){
        if(!this.LogIn) {
            boolean pass = false;
            JsonArray array = null;
            try {
                array = Json.createReader(new FileReader("src/main/resources/md/dani3lz/tmps_project/account/accounts.json")).readArray();
                pass = true;
            } catch (FileNotFoundException e) {
                System.out.println("File-ul nu a fost gasit!");
            }

            if (pass) {
                for (int i = 0; i < array.size(); i++) {
                    JsonObject object = array.getJsonObject(i);
                    if(Objects.equals(object.getString("login"), login) && Objects.equals(object.getString("password"), password)){
                        this.login = login;
                        this.password = password;
                        this.role = object.getString("role");
                        this.LogIn = true;
                        break;
                    }
                }
            }
        }
        return this.LogIn;
    }

    public String getRole() {
        return role;
    }

    public boolean isLogIn() {
        return LogIn;
    }

    private Account() {}
    private static Account instance;
    public static synchronized Account getInstance() {
        if (instance == null) {
            instance = new Account();
        }
        return instance;
    }
}
