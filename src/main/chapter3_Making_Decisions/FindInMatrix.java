package main.chapter3_Making_Decisions;

public class FindInMatrix {
    public static void main(String[] args) {
        int[][] list = {{1, 13}, {5, 2}, {2, 2}};
        int[][] list1 = {new int[2], {5, 2}, {2, 2}};
        int[][] list2 = {{5}, {2, 2}};
        int[][] list3 = new int[][] {{1, 13}, {5, 2}, {2, 2}};
        int[][] list4;
        list4 = new int[][]{{1, 13}, {5, 2}, {2, 2}};
//        int[][] list5;
//        list5 = {{1, 13}, {5, 2}, {2, 2}};  // не хватает new int[][]
        
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;
        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
        }
    }
}
