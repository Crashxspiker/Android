package prabhat.x.spiker.login.models;

/**
 * Created by Spiker_x on 27-Mar-17.
 */

public class ServerRequest {

    private String operation;
    private User user;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUser(User user) {
        this.user = user;
    }
}