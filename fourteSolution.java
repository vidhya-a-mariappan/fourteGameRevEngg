package zsm.fourte;

import java.util.Scanner;

public class fourteSolution {
    public static void main(String[] args) {
        fourteSolution fourSol = new fourteSolution();
        fourSol.evaluateStartup();
    }
    private void evaluateStartup() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the resultant");
        int resultant = sc.nextInt();
        int[] array = new int[4];
        System.out.println("Enter the 4 number");
        for (int i = 0; i < 4; i++)
            array[i] = sc.nextInt();
        char[] arrayC={'+','-','*','/'};
        allpermutationNumber(array,0);//permutation for numbers
        allpermutationOperator(arrayC,0);//permutation for operators
        allpossibilityExpression(array,arrayC);
    }

    private void allpossibilityExpression(int[] array, char[] arrayC) {
        for(int i=0;i<array.length-1;i++){
            for (int j=0;i<array[i];j++){
                array[i]
                
            }
        }
    }

    private void allpermutationOperator(char[] arrayChar, int positiOn) {
        if(positiOn >= arrayChar.length-1) {
            int[] charPer=new int[4];
            for (int i = 0; i < arrayChar.length - 1; i++)
                arrayChar[i];
            if (arrayChar.length > 0)
                arrayChar[arrayChar.length - 1];
            return;
        }
        for(int i = positiOn; i < arrayChar.length; i++){
            char temp = arrayChar[positiOn];
            arrayChar[positiOn] = arrayChar[i];
            arrayChar[i] = temp;
            allpermutationOperator(arrayChar,positiOn+1);
            temp = arrayChar[positiOn];
            arrayChar[positiOn] = arrayChar[i];
            arrayChar[i] = temp;
        }

    }

    private void allpermutationNumber(int[] perArr, int position){
            if(position >= perArr.length-1) {
                int[] numPer=new int[4];
                for (int i = 0; i < perArr.length - 1; i++)
                    numPer[i]=perArr[i];
                if (perArr.length > 0)
                    numPer[numPer.length - 1]=perArr[perArr.length - 1];
                return;
            }
                for(int i = position; i < perArr.length; i++){
                    int temp = perArr[position];
                    perArr[position] = perArr[i];
                    perArr[i] = temp;
                    allpermutationNumber(perArr,position+1);
                    temp = perArr[position];
                    perArr[position] = perArr[i];
                    perArr[i] = temp;
                }
        }
        
        
}
