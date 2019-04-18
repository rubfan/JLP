public class Printer {
    //2) Придумайте еще 2 каких-нибудь объекта из реальной жизни и реализуйте это с помощью класса.
    // Раз:
    // Принтер

    private final int maxBufferSize;
    private boolean colored;
    private int bufferPointer = 0;
    private int ink;
    private boolean paper;
    char[] buffer;

    Printer(){
        maxBufferSize = 1024;
        colored = false;
        ink = maxBufferSize;
        buffer = new char[maxBufferSize];
    }

    Printer(int b){
        maxBufferSize = b;
        colored = false;
        ink = maxBufferSize;
        buffer = new char[maxBufferSize];
    }

    Printer(boolean c){
        maxBufferSize = 1024;
        colored = c;
        ink = maxBufferSize;
        buffer = new char[maxBufferSize];
    }

    Printer(int b, boolean c){
        maxBufferSize = b;
        colored = c;
        ink = maxBufferSize;
        buffer = new char[maxBufferSize];
    }

    public void addPaper(){
        paper = true;
    }

    public void addInk(){
        ink = maxBufferSize;
    }

    public void addBuffer(String s){
        char[] temp = s.toCharArray();
        int i = 0;
        while (bufferPointer < maxBufferSize && bufferPointer < temp.length){
            buffer[bufferPointer] = temp[i++];
            bufferPointer++;
        }
    }
    //Печатает содержимое буфера
    public boolean print(){
        int i = 0;
        if(ink <= 0){
            System.out.println("No ink!");
            return false;
        }
        if(!paper){
            System.out.println("No paper!");
            return false;
        }
        else{
            while (i < bufferPointer && ink > 0) {
                System.out.print(buffer[i] + "_");
                buffer[i++] = ' ';
                ink--;
            }
            bufferPointer = 0;
            System.out.println();
            return true;
        }
    }
}
