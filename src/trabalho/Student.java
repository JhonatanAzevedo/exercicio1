
package trabalho;


public class Student extends User {// classe Student aqui tem uma herança student herda de User, visibilidade publica
    private int year_registration; // visibilidade privada.
    private int current_semester;  //visibilidade privada.
    private Course curse; // visibilidade privada, assosiaçao Course esta associado a Student

    public int getYear_registration() { // encapsulamento
        return year_registration;
    }

    public void setYear_registration(int year_registration) { // visibilidade public, encapsulamento
        this.year_registration = year_registration;
    }

    public int getCurrent_semester() { // visibilidade public, encapsulamento
        return current_semester;
    }

    public void setCurrent_semester(int current_semester) { // visibilidade public, encapsulamento
        this.current_semester = current_semester;
    }

    public Course getCurse() { // visibilidade public, encapsulamento
        return curse;
    }

    public void setCurse(Course curse) { // visibilidade public, encapsulamento
        this.curse = curse;
    }

 
    
    
}
