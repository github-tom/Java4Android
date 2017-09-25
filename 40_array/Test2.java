class Test2 {
    public static void main(String args []) {

        int arr [][] = { {1,2,3}, {4,5,6}, {7,8} };
        int arr1 [][] = new int [3][5];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
