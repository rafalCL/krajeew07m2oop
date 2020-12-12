package pl.coderslab.oop.homework;

public class Book {
    private boolean available = true;
    private User currentUser;

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
        this.available = false;
        currentUser.addBook(this);
    }
}
