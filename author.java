public class author {
    private String Name;
    private String email;
    private char genero;

    public author(String email,String Name,char genero) {
        this.email = email;
        this.genero=genero;
        this.Name=Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "author{" +
                "Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", genero=" + genero +
                '}';
    }
}
