
class Sol {

    protected boolean isPalindrom(int n) {
        String str = Integer.toString(n);
        for (int i = 0; i <= (str.length()/2); i++  ) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int res = 0;
        for (int i = 1000; i >= 100; i--) {
            for (int j = 1000; j >= 100; j--) {
                int product = i * j;
                if ((new Sol()).isPalindrom(product)) {
                    if (product > res) {
                        res = product;
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.println(res);
    }
}
