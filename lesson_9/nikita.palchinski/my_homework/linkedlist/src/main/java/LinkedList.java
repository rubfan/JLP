public class LinkedList implements LinkedListInterface{

    private String string;
    private Integer size;
    private String[] strings = new String[0];
    private Integer index;
    private Integer indexPrev;
    private Integer indexNext;

    public void add(String string) {
        this.string = string;
        size = strings.length;
        String[] temps = new String[size];
        for(int o = 0; o < size; o++){
            temps[o] = strings[o];
        }
        size++;
        String[] strings = new String[size];
        for(int i = 0; i < size - 1; i++){
            strings[i] = temps[i];
        }
        strings[size] = string;
    }

    public void add(Integer index, String string) {
        this.string = string;
        this.index = index;
        size = strings.length;
        String[] tempsPrev = new String[index];
        String[] tempsNext = new String[size - index];
        for(int o = 0; o < index; o++){
            tempsPrev[o] = strings[o];
        }
        for(int o = index; o < size; o++){
            tempsNext[o - index] = strings[o];
        }
        size++;
        String[] strings = new String[size];
        for(int i = 0; i < index; i++){
            strings[i] = tempsPrev[i];
        }
        strings[index] = string;
        for(int i = index + 1; i < size; i++){
            strings[i] = tempsNext[i - index - 1];
        }
    }

    public void remove() {
        size = strings.length;
        String[] temps = new String[size];
        for(int o = 0; o < size; o++){
            temps[o] = strings[o];
        }
        size--;
        String[] strings = new String[size];
        for(int i = 0; i < size; i++){
            strings[i] = temps[i];
        }
    }

    public void remove(Integer index) {
        this.index = index;
        size = strings.length;
        String[] tempsPrev = new String[index];
        String[] tempsNext = new String[size - index];
        for(int o = 0; o < index; o++){
            tempsPrev[o] = strings[o];
        }
        for(int o = 0; o < size - index; o++){
            tempsNext[o] = strings[o + index];
        }
        size--;
        String[] strings = new String[size];
        for(int i = 0; i < index; i++){
            strings[i] = tempsPrev[i];
        }
        for(int i = index; i < size; i++){
            strings[i] = tempsNext[i - index];
        }
    }

    public String transform() {
        return strings[size];
    }

    public String iSearch(Integer index) {
        return strings[index];
    }

    public Integer vSearch(String string) {
        for(int i = 0; i < size; i++)
            if(strings[i].equals(string))
                return i;
        return null;
    }

    public Integer getSize() {
        return this.size;
    }
}
