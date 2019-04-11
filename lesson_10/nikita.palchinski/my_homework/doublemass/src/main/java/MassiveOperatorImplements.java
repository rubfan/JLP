public class MassiveOperatorImplements implements MassiveOperator {
    private final int N = 4;
    private String[] array = new String[N];
    private int pointer = 0;

    public void addMassive(String[] massiveToAdd) {
        for(int i = 0; i < massiveToAdd.length; i++)
            addElement(massiveToAdd[i]);
    }

    public void addElement(String elementToAdd) {
        if(pointer == array.length-1)
            resize(array.length * 2);
        array[pointer++] = elementToAdd;
    }

    public String getElementWith(Integer index) {
       return array[index];
    }

    public String[] getArray() {
        return this.array;
    }

    public Integer getSize() {
        return pointer;
    }

    private void resize(Integer newLength) {
        String[] newArray = new String[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }



}