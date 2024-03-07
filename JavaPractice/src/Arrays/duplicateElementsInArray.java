package Arrays;

public class duplicateElementsInArray {

    public static void main(String[] args) {
        int a[] = {20, 20, 30, 40, 50, 50, 50};
        int b[] = new int[a.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    b[count++] = a[i];
                }
            }
        }

        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < count; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();
        System.out.println("Count: " + count);
    }
}
