package service;

import entities.BizStudent;

import java.util.Scanner;

public class BizStudentService {
    public BizStudent inputBizStudent(Scanner sc) {
        System.out.println("Mời b nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Mời b nhập chuyên ngành: ");
        String major = sc.nextLine();
        System.out.println("Mời b nhập điểm marketing: ");
        double marketing = Double.parseDouble(sc.nextLine());
        System.out.println("Mời b nhập điểm sale: ");
        double sale = Double.parseDouble(sc.nextLine());


        return new BizStudent(name, major, marketing, sale);
    }
}
