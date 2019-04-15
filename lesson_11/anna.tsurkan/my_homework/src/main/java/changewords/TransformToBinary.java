package changewords;

public class TransformToBinary {
        public  byte[] toBinary(int number){
            byte scale = 2;
            int newSize = number/scale +1;
            byte[] result = new byte[newSize];
            return convert(number, scale, result, 0);
        }

        private  byte[] convert(int number, byte scale, byte[] result, int pos){
            if(number >= scale) {
                result[pos] = (byte) (number % scale);
                int newNumber = number/scale;
                return convert(newNumber, scale, result, pos+1);
            }
            result[pos] = (byte)number;
            return reverse(result);
        }

        private  byte[] reverse(byte[] src){
            byte tmp;
            int len = src.length;
            for(int i=0; i < len/2; i++){
                tmp = src[i];
                src[i] = src[len-i-1];
                src[len-i-1] = tmp;
            }
            return src;
        }
    }

