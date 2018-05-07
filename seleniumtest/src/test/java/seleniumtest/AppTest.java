package seleniumtest;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void AppTest() {
        int[] a = new int[] { 1,2,3,6,4,45565,5345,435,4,54,54,34,34,5,44,52,326};
for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int n=a[i];
                    a[i]=a[j];
                    a[j]=n;
                }
            }
        }
        for(int c:a){
    System.out.println(c);
        }
        }


        @Test
        public void sda(){
        int [] d=new int[] {1,2,3};
        int [] c=new int[5];
        c[3]=22;
        c[4]=99;
        System.arraycopy(d,0,c,0,d.length);
        d=c;
        for(int f:d){
            System.out.println(f);
        }
        }
        @Test
        public void sdasda(){
            int money=1000;
            int tea=0;
            while (money-3>=0)
            {
                money=money-3;
                tea++;
                money++;
            }
System.out.println(tea);
        }
    }
