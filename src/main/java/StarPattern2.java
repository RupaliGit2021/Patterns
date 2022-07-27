public class StarPattern2 {
    int i,j;
    void getPattern()
    {
        for(i=14;i>0;i--)
        {
            for(j=14;j>0;j--)
            {
                if((j-i)>=6 || i==1 || i==2 || (j+i)<=9 )
                {
                    System.out.print('*');
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        new StarPattern2().getPattern();
    }

}
