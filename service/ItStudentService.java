package service;

import entities.BizStudent;
import entities.ItStudent;

import java.util.Scanner;

public class ItStudentService {
    public ItStudent inputItStudent(Scanner sc) {
        System.out.println("Mời b nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Mời b nhập chuyên ngành: ");
        String major = sc.nextLine();
        System.out.println("Mời b nhập điểm html: ");
        double html = Double.parseDouble(sc.nextLine());
        System.out.println("Mời b nhập điểm css: ");
        double css = Double.parseDouble(sc.nextLine());
        System.out.println("Mời b nhập điểm java: ");
        double java = Double.parseDouble(sc.nextLine());

        return new ItStudent(name, major, html, css, java);
    }
}
