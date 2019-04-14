public class MyLinkedList implements LinkedListInterface {

    private String string;
    private Integer size;
    private String[] strings = new String[0];
    private Integer index;

    public void add(String string) {
        this.string = string;
        size = strings.length;
        String[] temps = new String[size];
        for (int o = 0; o < size; o++) {
            temps[o] = strings[o];
        }
        size++;
        this.strings = new String[size];
        for (int i = 0; i < size - 1; i++) {
            strings[i] = temps[i];
        }
        strings[size - 1] = string;
    }

    public void add(Integer index, String string) {
        this.string = string;
        this.index = index;
        size = strings.length;
        String[] tempsPrev = new String[index];
        String[] tempsNext = new String[size - index];
        for (int o = 0; o < index; o++) {
            tempsPrev[o] = strings[o];
        }
        for (int o = index; o < size; o++) {
            tempsNext[o - index] = strings[o];
        }
        size++;
        this.strings = new String[size];
        for (int i = 0; i < index; i++) {
            strings[i] = tempsPrev[i];
        }
        strings[index] = string;
        for (int i = index + 1; i < size; i++) {
            strings[i] = tempsNext[i - index - 1];
        }
    }

    public void remove() {
        size = strings.length;
        String[] temps = new String[size];
        for (int o = 0; o < size; o++) {
            temps[o] = strings[o];
        }
        size--;
        this.strings = new String[size];
        for (int i = 0; i < size; i++) {
            strings[i] = temps[i];
        }
    }

    public void remove(Integer index) {
        this.index = index;
        size = this.strings.length;
        String[] tempsPrev = new String[index];
        String[] tempsNext = new String[size - index - 1];
        for (int o = 0; o < index; o++) {
            tempsPrev[o] = strings[o];
        }
        for (int o = 0; o < size - index - 1; o++) {
            tempsNext[o] = strings[o + index + 1];
        }
        size--;
        this.strings = new String[size];
        for (int i = 0; i < index; i++) {
            strings[i] = tempsPrev[i];
        }
        for (int i = index; i < size; i++) {
            strings[i] = tempsNext[i - index];
        }
    }

    public String[] transform() {
        //System.out.println();
        //System.out.println("List has been transformed" + " to array with " + this.size + " size");
        return this.strings;
    }

    public String iSearch(Integer index) {
        if(index < this.size)
            return this.strings[index];
        return null;
    }

    public Integer vSearch(String string) {
        for (int i = 0; i < size; i++)
            if (this.strings[i].equals(string))
                return i;
        return null;
    }

    public Integer getSize() {
        return this.size;
    }

    public String getLast() {
        return this.strings[this.size - 1];
    }

    public void showList() {
        //System.out.print(this.strings[0]);
        for(int i = 0; i < this.size - 1; i++)
        {
            System.out.println(this.strings[i] + ", ");
        }
        System.out.println(this.strings[this.size - 1]);
        System.out.println();
    }


}