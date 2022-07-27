public class StarPattern3 {
    int i,j;
    void getPattern()
    {
        for(i=14;i>0;i--)
        {
            for(j=14;j>0;j--)
            {
                if((j-i)>=7 || i==1 || i==14 || (i+j)>=22)
                {
                    System.out.print('*');

                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        StarPattern3 s=new StarPattern3();
        s.getPattern();
    }
}
