package Mo3;

public class bsprachen3 {
    public static String spielen(String x){
        int counter = 0;
        char[] arr = x.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                counter++;
            }
        }
        int j = 0;
        char[] result = new char[counter*2 +arr.length];
        for(int i = 0; i < result.length; i++){
            result[i] = arr[j];
            if(arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u'){
                result[i+1] = 'b';
                result[i+2] = result[i];
                i+=2;
            }
            j++;

        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(spielen("spiel mit mir"));
    }
}