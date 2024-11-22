public class KolomTable_14 {
    public static void main(String[] args) {
        char[][] array = {
            {'I','N','F','O','R'},
            {'M','A','T','I','K'},
            {'A','P','O','L','I'},
            {'N','E','M','A','M'}
        };
        for (int i = 0; i < array.length; i++) {
            char maxChar = array[i][0];
            int maxIndex = 0;
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > maxChar) {
                    maxChar = array[i][j];
                    maxIndex = j;
                }
            }
            System.out.println(maxChar + " adalah huruf terbesar pada baris " + (i + 1) + " berada di kolom " + (maxIndex + 1));
        }
    }
}
