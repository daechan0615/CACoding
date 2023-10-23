package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = clearDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        ArrayList<String> users = userDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData(users, false);

        userPresenter.prepareSuccessView(clearOutputData);
    }
}
