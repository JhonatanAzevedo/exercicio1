
package trabalho;


public class Trabalho { // classe trabalho, visibilidade publico.

    public static void main(String[] args) { // visibilidade publica. 
        Course course1 = new Course(); // alocaçao de memoria, objeto-course1, metodo construtor Course()
        course1.setCodeCourse(166545); // objeto 
        course1.setName("programaçao 1"); //objeto
        
        Student studant1 = new Student(); // alocaçao de memoria, objeto-studant1, metodo construtor Studant();
        studant1.setCurse(course1); // associaçao.
        studant1.setCurrent_semester(3); //objeto
        studant1.setYear_registration(2019); //objeto
        studant1.setEmail("jhonatan@gmail.com"); //objeto
        studant1.setName("jhonatan"); //objeto
        studant1.setLast_name("Azevedo silva"); //objeto
        studant1.setRegistration(5528346); //objeto
        studant1.setPassword("64648999"); //objeto
        studant1.setUser_address(null); //objeto
      
        
        
        
        
        
        
        
        
    }
    
}
