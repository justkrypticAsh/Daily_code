class Solution {
public:
    int findNthDigit(int n) {
        if(n<10){
            return n;
        }
        long digit = 1, count = 9,i = 1;
        while(n>digit*count){
            n-=digit*count;
            digit++;
            count*=10;
            i*=10;

        }

        i = i + (n - 1)/digit;

        string s = to_string(i);

    return s[(n-1)%digit]-'0';
        
        
        
    }
};