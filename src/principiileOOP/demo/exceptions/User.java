package demo.exceptions;

public class User {

    private String name;

    private String email;



    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidEmailException{
        if (!email.contains("@")){
            throw new InvalidEmailException("e-mail invalid. Must contain @");
        }
        this.email = email;
    }
}
