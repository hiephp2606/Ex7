import entities.BizStudent;
import entities.ItStudent;
import entities.TechmasterStudent;
import service.BizStudentService;
import service.ItStudentService;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("so luong sinh vien ban muon nhap?");
            int n = Integer.parseInt(sc.nextLine());
            TechmasterStudent arr[] = new TechmasterStudent[n];
            if (n <= 0) {
                System.out.println("vui long nhap so lon hon 0!");
            }
            else {
                for (int i = 0; i < n; i++) {
//            System.out.println(i);
                    while (true) {
                        System.out.println("ban la sinh vien (vui long chi chon 1 hoac 2):\n    1. IT\n    2. Biz ");
                        int input = Integer.parseInt(sc.nextLine());
                        if (input == 1) {
                            ItStudentService itStudentService = new ItStudentService();
                            ItStudent itStudent = itStudentService.inputItStudent(sc);
                            arr[i] = itStudent;
                            break;
                        }
                        else if (input == 2) {
                            BizStudentService bizStudentService = new BizStudentService();
                            BizStudent bizStudent = bizStudentService.inputBizStudent(sc);
                            arr[i] = bizStudent;
                            break;
                        }
                        else {
                            System.out.println("khong co lua chon nay xin nhap lai");
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i]);
                }
                System.exit(0);
            }

        }

    }
}
