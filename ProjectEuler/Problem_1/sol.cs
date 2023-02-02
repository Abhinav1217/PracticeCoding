using System;

namespace ProjectEular
{
    class sol
    {
        static void Main(string[] args)
        {
            int sum = 0;

            for (int i = 3; i < 1000; i++)
            {
                if (i % 3 == 0)
                {
                    sum += i;
                    // continue;
                }
                else if (i % 5 == 0)
                {
                    sum += i;
                }
            }

            Console.WriteLine (sum);
        }
    }
}
