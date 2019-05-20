import java.util.Arrays;

public class AddArray {

    static Integer[] arr;
    public int length;

    public AddArray(int length){
        this.length = length;
        arr = new Integer[length];
    }

    public Integer[] add(int item){
        if(Arrays.asList(this.arr).contains(null)) {
            for (int i = 0; i < length; i++) {
                if (this.arr[i] == null) {
                    this.arr[i] = item;
                    break;
                }
            }
        }else{
            Integer[] newArray = new Integer[length*2];
            System.arraycopy (this.arr, 0, newArray, 0, length);
            this.arr = newArray;
            this.length *= 2;
            this.add(item);
        }
        return arr;
    }

    public Integer[] add(Integer[] arr){
        for (int i=0; i < arr.length; i++){
            this.add(arr[i]);
        }
        return arr;
    }

    public Integer search(int index){
        try {
            return arr[index];
        } catch (NullPointerException e){
            return null;
        }
    }


    @Override
    public String toString(){
        StringBuilder s = new StringBuilder("[ ");
        for(int i=0; i < this.arr.length; i++){
            if(arr[i] != null) {
                s.append(arr[i] + " ");
            }
        }
        return s.append("]").toString();
    }
}
