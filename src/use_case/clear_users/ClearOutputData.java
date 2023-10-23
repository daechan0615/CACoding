package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {
    private final ArrayList<String> users;
    private boolean useCaseFailed;

    public ClearOutputData(ArrayList<String> usersNames, boolean useCaseFailed) {
        this.users = usersNames;
        this.useCaseFailed = useCaseFailed;
    }

    public ArrayList<String> getUsers() {return users;}
}
