public class Email {

    public static void main(String[] args) {
//        Email email = new Email("brus.andreevich@gmail.com");
//        System.out.println(email.separateEmail());
//        Abbreviator abb = new Abbreviator();
//        Palindrome p = new Palindrome("deleveled, evitative, cat, dog, deified");
//        System.out.println(p.findPalindrome());
////        Abbreviator abb = new Abbreviator("utnbyrhspw wtfisthis onlyorly oby");
////        System.out.println(abb.split());
    }

    private String email;

    public Email(String email){
        this.email = email;
    }

    public String separateEmail(){
        this.email = this.email.replace("@", "[ at ]").replace(".", "[ dot ]");
        return this.email;
    }

}
