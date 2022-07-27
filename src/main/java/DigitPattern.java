public class DigitPattern {
    void getPatternNum()
    {
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                System.out.print(i);
            }
            System.out.println(" ");
        }

    }
    public static void main(String[] args) {
        DigitPattern d=new DigitPattern();
        d.getPatternNum();
    }

}
