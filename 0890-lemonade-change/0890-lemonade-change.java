class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0]>5) {
            return false;
        }

        int withMe = 0;

        int fives = 0;

        int tens = 0;

        for(int i = 0; i<bills.length; i++) {
            int money = bills[i];

            if(money==5) {
                fives++;
            }else if(money==10) {
                int change = money-5;

                if(change==5 && fives==0) {
                    return false;
                }
                else {
                    fives--;
                    tens++;
                }
            }
            else {
                if(tens>0 && fives>0) {
                    tens--;
                    fives--;
                }
                else if(fives>=3) {
                    fives = fives-3;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }
}