package testxml;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int [] score={1,2,3,90,8,7,22,33,154,14214,54,51,28,90,34,56,77,12,545,34,35,55,77
    };
        for(int i =0;i < score.length - 1;i++)
        {
            for(int j = 0;j <  score.length - 1-i;j++)// j开始等于0，
            {
                if(score[j] < score[j+1])
                {
                    int temp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = temp;
                }
            }
        }
        for(int i=0;i<score.length;i++){
        System.out.print(" "+score[i]+" ");
    }
}
}