public class EmailAddress {

    public String changeSymbols(String s) {
        String s1 = s.replace("@", "[ at ]");
        String s2 = s1.replace(".", "[ dot ]");
        s = s2;
        return s;
    }

    public String reduction(String a) {
        if (a.length() <= 4) {
            return a;
        } else {
            char[] array = a.toCharArray();
            String b = "" + array[0] + (array.length - 2) + array[array.length - 1];
            a = b;
            return a;
        }
    }

    public String palindrom (String b){
       String [] words = b.split(",");
       for (int i = 0; i < words.length; i++){
           words[i] = words[i].trim();
          }


        return null;
    }

}
