import java.util.Random;

public class User {
    /*******************************************
     * attributes                              *
     *******************************************/
    public String name;
    public String email;
    public String cylinders;


    /*******************************************
     * constructor (method) overloading        *
     *******************************************/
    // constructor for creating first time user
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
    // constructor for creating user object from DB
    public User(String name, String email, String cylinders){
        this.name = name;
        this.email = email;
        this.cylinders = cylinders;
    }


    /*******************************************
     * static methods                          *
     *******************************************/
    private static User getUser(String email){
        return User.fetchUserFromDB(email);
    }

    /*******************************************
     * DB access methods                       *
     *******************************************/

    private static User fetchUserFromDB(String email){
        // logic for fetching user from Database
        User user = new User("John Doe", "john@gas.com");
        return user;
    }


    @Override
    public String toString() {
        return name;
    }
}
