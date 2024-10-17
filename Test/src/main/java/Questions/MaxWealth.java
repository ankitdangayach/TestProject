package Questions;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {13, 12, 63},
                {42, 15, 64, 6},
                {17, 8, 34, 67},
                {49, 78}
        };

        System.out.println(maxWealth(accounts));
        System.out.println(maxWealth2(accounts));
    }

    public static int maxWealth(int[][] accounts) {
        //person = row
        //account = col

        int maxWealth = 0;
        for (int person = 0; person < accounts.length; person++) {
            //when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }

            //now we have sum of accounts of person
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

    public static int maxWealth2(int[][] accounts) {
        int maxWealth =0;
        for(int[] person: accounts){
            int sum =0;
            for(int account: person) {
                sum = sum + account;
            }
            if(sum>maxWealth) {
                maxWealth=sum;
            }
        }
        return  maxWealth;
    }
}
