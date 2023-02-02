using System;

namespace ProjectEular
{
    class Sol
    {
        /**  Note: C# prefers UpperCamelCase for function
         *  which is as stupid as using Hungerian Notation for class identifiers
         */
        protected long GetLargestPrimeFactor(long num)
        {
            while (true)
            {
                long factor = GetSmallestPrimeFactor(num);
                if (factor < num)
                {
                    num = num / factor;
                }
                else
                {
                    return num;
                }
            }
        }


        public long GetSmallestPrimeFactor(long input)
        {

            /**
             * Fundamentals of Mathematics
             * 1. Negative numbers, `0` and `1`, are not prime.
             * 1. `2` is the only even prime number. It is also the smallest prime number.
             * 2. `3` is smallest odd prime number.
             * 3. Incrementing by `+2` instead of `+1` will skip all even numbers, halving our loops.
             * 4. You only need to loop through sqrt of number to find all divisable numbers.
             */
            if (input == 2L)
            {
                return input;
            } // early exit
            for (int i = 3; i <= Math.Sqrt(input); i = i + 2)
            {
                if (input % i == 0L)
                {
                    return i;
                }
            }
            return input;

        }

        public static void Main(){
            const long n = 600_851_475_143L;
            Console.WriteLine((new Sol()).GetLargestPrimeFactor(n));
        }
    }

}
