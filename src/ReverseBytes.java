public class ReverseBytes {

    public int [] reverse_bytes(int [] bits){
        int length = bits.length;
        int reversed[] = new int [length];
        for(int i = 0; i < length; i++){
            reversed[i] = bits [length - i - 1];
        }
        return reversed;
    }
}
