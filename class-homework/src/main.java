import java.util.Arrays;

public class main {

    public static String[] reRank(String[] seq) {
        if(seq==null||seq.length==0)
        {
            return new String[0];
        }
        int i=0;
        int len=seq.length;
        int r=0,b=0,g=0;
        for(i=0;i<len;++i)
        {
            if(seq[i].equals("r"))r++;
            else if(seq[i].equals("g"))g++;
            else if(seq[i].equals("b"))b++;
        }

        for(i=0;i<r;++i) seq[i]="r";
        for(i=r;i<r+g;++i) seq[i]="g";
        for(i=r+g;i<len;++i) seq[i]="b";
        return seq;
    }
    public static String[] reRankTwoPointers(String[] input) {
        if(input==null||input.length==0)
        {
            return new String[0];
        }
        int i=0;
        int left=0,right=input.length-1;
        while(i<=right)
        {
            if(input[i].equals("r"))
            {
                String temp=input[i];
                input[i]=input[left];
                input[left]=temp;
                i++;left++;
            }
            else if(input[i].equals("g"))
            {
                i++;
            }
            else if(input[i].equals("b"))
            {
                String temp2=input[i];
                input[i]=input[right];
                input[right]=temp2;
                right--;
            }
        }
        return input;
    }
    public static void main(String[] args) {
        String[] input=new String[]{"r","r","b","g","b","r","g"};
        Arrays.asList(reRank(input)).forEach(e->System.out.print(e));
        System.out.println();
        input=new String[]{"r","r","b","g","b","r","g"};
        Arrays.asList(reRankTwoPointers(input)).forEach(e->System.out.print(e));
    }
}
