import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        int[] numberMass = new int[10];
        for (int i=0;i<numberMass.length;i++){
            numberMass[i]=(int)(Math.random()*100);
        }
        for (int temp : numberMass){
            System.out.print(temp+"\t");
        }

        System.out.println();

        int[] sortedMass = numberMass;
        for (int out= sortedMass.length-1;out>=1;out--){
            for(int in=0;in<out;in++){
                if(sortedMass[in]>sortedMass[in+1]){
                    int buffer=sortedMass[in];
                    sortedMass[in]=sortedMass[in+1];
                    sortedMass[in+1]=buffer;
                }
            }
        }

        for (int temp : sortedMass){
            System.out.print(temp+"\t");
        }



    }


}