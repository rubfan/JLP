package arrays;

import java.lang.reflect.Array;
public class NewClassForArray {
    private Integer numberOfArrays;
    private int newLength;
    private int[] array3;
    private int currentLength;

    public  NewClassForArray(int sizePrev, int sizeOfSecondArray){
        if (sizePrev>sizeOfSecondArray){
            newLength=sizePrev*2;
        }
        else {
            newLength=sizeOfSecondArray*2;
        }

    }
    public void joinArrays(int[]array1, int[] array2){
        array3 = new int[newLength];
        array3 =(int[]) Array.newInstance(array1.getClass().getComponentType(), newLength);
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
    }

    public int getCurrentLength(){
        currentLength = array3.length;
        return  currentLength;
    }

    public int getElementByIndex(int index){
        for(int i=0; i<array3.length; i++){
            if(i==index)break;
        }
        return array3[index-1];
    }

    public int getNewLength() {
        return newLength;
    }

    public Integer getNumberOfArrays() {
        return numberOfArrays;
    }

    public int[] getArray3(){
       return this.array3;
    }
}
