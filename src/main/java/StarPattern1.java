public class StarPattern1 {
    int i,j;
    void getPattern(char a)
    {
        for(i=0;i<14;i++)
        {
            for(j=0;j<14;j++)
            {
                if(i==0 ||j==0 || i==13 || j==13 || (i+j)<7 ||(j-i)>=7)
                {
                    System.out.print(a);
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        new StarPattern1().getPattern('*');
    }
}
