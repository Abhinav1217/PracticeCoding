using System;

namespace ProjectEular{
class sol {
    static void Main (){
        int sum = 0;
        int first = 1;
        int second = 2;

        while (second < 4_000_000){
            if (second % 2 == 0)
            {
                sum += second;
            }

            second = second + first;
            first = second - first;
        }
        Console.WriteLine(sum);
    }
}


}
