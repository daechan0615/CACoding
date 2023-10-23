package interface_adapter.clear_users;

// TODO Complete me
import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class ClearViewModel extends ViewModel {

    public static final String TITLE_LABEL = "Message";
    private String deletedUsers;

    private ClearState state = new ClearState();
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public ClearViewModel() {super("clear");}

    public void setState(ClearState state) {this.state = state;}

    @Override
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState() {return this.state;}
    public String getDeletedUsers() {return this.deletedUsers;}
    public void setDeletedUsers(String users) {this.deletedUsers = users;}

}
