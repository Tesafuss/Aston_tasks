public class Task3
{
    public static void main(String[] args) {
        int[] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String result = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                String str1 = Integer.toString(arr[i]);
                result = String.join(" ", result, str1);
            }
        }
        System.out.println(result.substring( 1));
    }
}