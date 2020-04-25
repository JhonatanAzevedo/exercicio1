
package trabalho;

public class Course { // classe Course ,visibilidade publica
    private int codeCourse; // visibilidade do tipo privada.
    private String name; // visibilidade do tipo privada.

    public int getCodeCourse() { // visibilidade public, encapsulamento
        return codeCourse;
    }

    public void setCodeCourse(int codeCourse) { // visibilidade public, encapsulamento
        this.codeCourse = codeCourse;
    }

    public String getName() { // visibilidade public, encapsulamento
        return name;
    }

    public void setName(String name) { // visibilidade public, encapsulamento
        this.name = name;
    }
    
    
    
    
}
