package th.ac.su.sc.midterm07590555.model;

public class Auth {

    private String mUsername;
    private String mPassword;

    private static final String USERNAME_1 = "aaa";
    private static final String PASSWORD_1 = "111";

    private static final String USERNAME_2 = "bbb";
    private static final String PASSWORD_2 = "222";

    public Auth(String Email, String Password) {
        this.mUsername = Email;
        this.mPassword = Password;
    }


    public int checkUsernameAndPassword(){
        if(mUsername.equals(USERNAME_1) && mPassword.equals(PASSWORD_1)){
            return 1;
        }else if(mUsername.equals(USERNAME_2) && mPassword.equals(PASSWORD_2)) {
            return 2;
        }
        return 0;
    }
}
