package interface_adapter.clear_users;

// TODO Complete me
import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearInputBoundary;

public class ClearController {

    final ClearInputBoundary clearCaseUseInteractor;
    public ClearController(ClearInputBoundary clearCaseUseInteractor) {
        this.clearCaseUseInteractor = clearCaseUseInteractor;
    }

    public void execute() {
        ClearInputData clearInputData = new ClearInputData();
        clearCaseUseInteractor.execute();
    }
}
