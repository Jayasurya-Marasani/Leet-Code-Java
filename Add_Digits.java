class Solution {
    public int addDigits(int num) {
        int sum = adding(num);
        while(sum>=10)
        {
            sum = adding(sum);
        }
        return sum;
    }

    public int adding(int n) 
    {
        int sum = 0;
        while(n>0)
        {
            sum = sum + (n%10);
            n = n/10;
        }
        return sum;
    }
}



// Another Solution
// for the given number num, just take the modulus with 9. Always gives the remainder as the final sum
class Solution {
    public int addDigits(int num) {
        if(num == 0)
        {
            return 0;
        }
        else
        {
            return (num % 9 == 0)? 9: (num % 9);
        }
    }
}
