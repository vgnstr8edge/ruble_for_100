public class Main{
    public static void main(String[]args){
        long ClientPurse = 100;
        long ClientGive = 900;
        long Sum = ClientPurse + ClientGive;
        int Bonus = 100;

        if (Sum >= 1001) {
            long TotalBonus = Sum / Bonus;
            System.out.println(TotalBonus);
        }

        else {
            System.out.println("Your bonus - 0");
        }

    }
}
