 

//Finding the Duplicates in Arrays..........

public class DuplicatesArrays {
    public static void main(String[] args) {
        int[] originalList = { 1, 2, 2, 1 };
        int[] duplicateElementList = new int[5];
        int count = 0;
        boolean flag = false;
        
        for (int i = 0; i < originalList.length; i++) {
            count = 0;
            for (int j = i + 1; j < originalList.length; j++) {
                if (originalList[i] == originalList[j]) {

                    count++;
                    System.out.println("Duplicate Element " + originalList[i]+" Found At "+i+" Index");
                    flag = true;

                }

            }
            if (count >= 1)
                duplicateElementList[i] = originalList[i];
        }

        
        System.out.print("The Duplicate Elements Array : ");
        for (int k : duplicateElementList)
            System.out.print(k +" |");
        
        if (flag == false)
            System.out.println("NOT Found!");

    }
}