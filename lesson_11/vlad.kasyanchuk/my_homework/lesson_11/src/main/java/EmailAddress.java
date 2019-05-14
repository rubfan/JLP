public class EmailAddress {
    String s;

    EmailAddress(String s) {
        this.s = s;
    }

    public String changeSymbols() {
        String s1 = s.replace("@", "[ at ]");
        String s2 = s1.replace(".", "[ dot ]");
        s = s2;
        return s;
    }
}
