package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @FXML
    ListView list;

    @FXML
    TextField name;

    @FXML
    TextField phone;

    @FXML
    TextField email;



    public void addContact() {
        if(name.getLength() > 0 && phone.getLength() > 0 && email.getLength() > 0) {
            contacts.add(new Contact(name.getText(), phone.getText(), email.getText()));

        }
    }

    public void removeContact() {
        Contact contact = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(contact);
    }

//    public void toggleItem() {
//        System.out.printf("toggleItem");
//        ToDoItem item = (ToDoItem) list.getSelectionModel().getSelectedItem();
//        if (item != null) {
//            item.isDone = !item.isDone;
//            list.refresh();
//        }

        @Override
        public void initialize(URL location, ResourceBundle resources) {
            list.setItems(contacts);
        }

}
