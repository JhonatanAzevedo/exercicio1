
package trabalho;


public class User { // classe User, visibilidade publica
    private int registration; // visibilidade do tipo privada.
    private String name; // visibilidade do tipo privada.
    private String last_name; // visibilidade do tipo privada.
    private String email; // visibilidade do tipo privada.
    private String password; // visibilidade do tipo privada.
    private Address user_address; // visibilidade do tipo privada, composiçao - Address compõem User.

    public int getRegistration() { // visibilidade public, encapsulamento
        return registration;
    }

    public void setRegistration(int registration) { // visibilidade public, encapsulamento
        this.registration = registration;
    }

    public String getName() { // visibilidade public, encapsulamento
        return name;
    }

    public void setName(String name) { // visibilidade public, encapsulamento
        this.name = name;
    }

    public String getLast_name() { // visibilidade public, encapsulamento
        return last_name;
    }

    public void setLast_name(String last_name) { // visibilidade public, encapsulamento
        this.last_name = last_name;
    }

    public String getEmail() { // visibilidade public, encapsulamento
        return email;
    }

    public void setEmail(String email) { // visibilidade public, encapsulamento
        this.email = email;
    }

    public String getPassword() { // visibilidade public, encapsulamento
        return password;
    }

    public void setPassword(String password) { // visibilidade public, encapsulamento
        this.password = password;
    }

    public Address getUser_address() { // visibilidade public, encapsulamento
        return user_address;
    }

    public void setUser_address(Address user_address) { // visibilidade public, encapsulamento
        this.user_address = user_address;
    }
    
    
    
}
