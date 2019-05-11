public class Arrays {
    int[] firstArray;
    int n;

    public Arrays(int lenght) {
        this.n = lenght;
        firstArray = new int[n];
    }

    public int[] addArray(int[] secondArray) {

        int[] newArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            newArray[i] = firstArray[i];
        }
        for (int y = 0; y < secondArray.length; y++) {
            if (newArray[y] == 0) {
                newArray[y] = secondArray[y];
            }
        }
        firstArray = new int[newArray.length];
        firstArray = newArray;
        return firstArray;
    }

    public int[] addValue(int value) {
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != 0)
                if (i == firstArray.length - 1) {
                    int[] newArray = new int[firstArray.length * 2];
                    for (int j = 0; j < firstArray.length; j++) {
                        newArray[j] = firstArray[j];
                    }
                    newArray[i + 1] = value;
                    firstArray = new int[newArray.length];
                    firstArray = newArray;
                    break;
                }
        }
        return firstArray;
    }


    public int lenght() {
        return firstArray.length;
    }

    public int indexOf(int index) {
        for (int i = 0; i < firstArray.length; i++) {
            if (i == index) {
                return firstArray[index];
            }
        }
        return -1;
    }
}


//    public int[] addValue(int value) {
//        for (int i = 0; i < firstArray.length; i++) {
//            if (firstArray[i] == 0) {
//                firstArray[i] = value;
//                break;
//            } else {
//                int[] newArray = new int[firstArray.length * 2];
//                for (int j = 0; j < firstArray.length; i++) {
//                    if (firstArray[j] == 0) {
//                        firstArray[j] = value;
//                        break;
//                    }
//                }
//
//            }
//        }
//
//    }

