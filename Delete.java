import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size");
            size = scanner.nextInt();
        } while (size <= 0);
        array = new int[size];
        int i = 0;
        System.out.println("nhap cac phan tu cho mang");
        for (i = 0 ; i< size; i++) {
            System.out.print("Enter alement" + (i+1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println("nhap so nguyen muon xoa: ");
        int k = scanner.nextInt();
        int count = 0;
        // xóa phần tử k ra khỏi mảng
        // vòng lặp for sẽ khởi tạo count = i = 0
        // và duyệt i từ 0 đến size
        // nếu phần tử tại vị trí i khác với số nguyên k
        // thì gán phần tử tại i cho phần tử tại k
        // sau đó tăng count lên 1
        for (i = 0; i < size; i++) {
            if(array[i] != k){
                array[count] = array[i];
                count++;
            }
        }
        size = count;
        // lúc này số phần tử trong mảng sẽ bằng count

        // hiển thị các phần tử trong mảng sau khi xóa k
        System.out.println("mang con lai khi xoa phan tu " + k + " la");
        for(i = 0;i < size;i++){
            System.out.println(array[i] + "\t");
        }
    }
}
