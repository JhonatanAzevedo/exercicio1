
package trabalho;

public class Address { // classe Address
    private int idAddress; // visibilidade do tipo privada.
    private String cep; // visibilidade do tipo privada.
    private String public_place; // visibilidade do tipo privada.
    private String uf; // visibilidade do tipo privada.
    private String city; // visibilidade do tipo privada.

    public int getIdAddress() { // visibilidade public, encapsulamento
        return idAddress;
    }

    public void setIdAddress(int idAddress) { // visibilidade public, encapsulamento
        this.idAddress = idAddress;
    }

    public String getCep() { // visibilidade public, encapsulamento
        return cep;
    }

    public void setCep(String cep) { // visibilidade public, encapsulamento
        this.cep = cep;
    }

    public String getPublic_place() { // visibilidade public, encapsulamento
        return public_place;
    }

    public void setPublic_place(String public_place) { // visibilidade public, encapsulamento
        this.public_place = public_place;
    }

    public String getUf() { // visibilidade public, encapsulamento
        return uf;
    }

    public void setUf(String uf) { // visibilidade public, encapsulamento
        this.uf = uf;
    }

    public String getCity() { // visibilidade public, encapsulamento
        return city;
    }

    public void setCity(String city) { // visibilidade public, encapsulamento
        this.city = city;
    }
    
    
    
}
