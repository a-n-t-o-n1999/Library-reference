import java.util.Objects;

public class Author {
   String name;
   String surname;
   public Author(String name, String surname){
       this.name=name;
       this.surname=surname;
   }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String toString(){
        return "Имя "+ name + " Фамилия " + surname;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name,author.name)&&Objects.equals(surname,author.surname);
    }
    public int hashCode() {return Objects.hash(name,surname); }
}
