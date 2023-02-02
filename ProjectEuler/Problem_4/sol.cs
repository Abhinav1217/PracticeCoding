using System;

namespace ProjectEular
{
    class sol
    {
        protected bool isPalindrome(int n)
        {
            String str = n.ToString();
            for (int i = 0; i <= (str.Length / 2); i++)
            {
                if (str[i] != str[str.Length - 1 - i])
                {
                    return false;
                }
            }
            return true;
        }

        static void Main()
        {
            int res = 0;
            for (int i = 1000; i >= 100; i--)
            {
                for (int j = 1000; j >= 100; j--)
                {
                    int product = i*j;
                    if ((new sol()).isPalindrome(product)){
                        if (product > res ){
                            res = product;
                        }
                    }
                }
            }

            Console.WriteLine(res);
        }
    }
}
