package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String usernames = "";

    public ClearState(ClearState copy) {usernames = copy.usernames;}

    public ClearState() {}

    public String getUsernames() {return usernames;}
    public void setUsernames(String usernames) {this.usernames = usernames;}
}
