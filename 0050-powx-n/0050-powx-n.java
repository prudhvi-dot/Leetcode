class Solution {
    public double myPow(double x, int n) {
        if(n == 0) {
            return 1.0;
        }

        long nn = (long) n;

        if(n<0) {
            x = 1/x;
            nn = -nn;
        }

        return power(nn, x);
    }

    double power(long n, double x) {
        if(n == 0) {
            return 1.0;
        }

if(n%2==1) {
            return x*power(n/2,x*x);
        }
        else {
            return power(n/2, x*x);
        }
    }
}