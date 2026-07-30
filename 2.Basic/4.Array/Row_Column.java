public class Row_Column {

    public static void main(String[] args) {

        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,5,3},
            {9,2,6}
        };
        //To find the Rows & Columns of 2d array
        System.out.println("Rows = " + arr.length);
        System.out.println("Columns = " + arr[0].length); //No og columns in first row
    }

    
}
