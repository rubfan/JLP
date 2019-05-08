public class Email {

    private String email;

    public Email(String email){
        this.email = email;
    }

    public String separateEmail(){
        this.email = this.email.replace("@", "[ at ]").replace(".", "[ dot ]");
        return this.email;
    }

}
