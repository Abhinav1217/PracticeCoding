
class sol {
    public static void main (String args[]){
        int sum = 0;
        int first = 1;
        int second = 2;

        while (second < 4_000_000){
            if (second % 2 == 0){
                sum += second;
            }

            second = second + first;
            first = second - first;
        }
        System.out.println(sum);
    }
}
