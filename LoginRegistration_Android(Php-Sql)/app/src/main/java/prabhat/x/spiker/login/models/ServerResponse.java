package prabhat.x.spiker.login.models;

/**
 * Created by Spiker_x on 27-Mar-17.
 */

public class ServerResponse {

    private String result;
    private String message;
    private User user;

    public String getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}
