package com.maven;

import org.junit.Before;
import org.junit.Test;

public class oneTest{
      @Test
public void Array(){
          int [] a={1,2,3432,534,342,23,44,242,231321};
          int []b={213,213132,213,213,123,1231};
         int[] c=new int[20];
         System.arraycopy(a,0,c,0,a.length);
          System.arraycopy(b,0,c,9,b.length);
         for (int f:c){
             System.out.print(" "+f+" ");
         }
      }
      }
