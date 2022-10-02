package j15_컬렉션.리스트;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentService studentService = new StudentService(new ArrayList<Student>());

        while(true) {
            System.out.println("[ 학생관리 프로그램 ]");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 전체 조회");
            System.out.println("3. 학생 조회(코드번호)");
            System.out.println("4. 학생 이름 수정");
            System.out.println("5. 학생 삭제");
            System.out.println("q. 프로그램 종료");
            System.out.print("Select >> ");
            String select = scanner.nextLine();

            if(select.equals("q")){
                System.out.println("프로그램 종료.");
                break;

            }else if(select.equals("1")) {
                System.out.println("[ 학생 등록 ]");
                System.out.print("새로운 학생 이름 >> ");
                String name = scanner.nextLine();
                studentService.addStudent(name);

            }else if(select.equals("2")) {
                System.out.println("[ 학생 전체 조회 ]");
                studentService.printStudentList();

            }else if(select.equals("3")) {
                System.out.println("[ 학생 조회(코드번호) ]");
                System.out.print("조회할 학생 코드 >> ");
                int code = scanner.nextInt();
                scanner.nextLine();
                Student s = studentService.getStudent(code);
                if(s == null) {
                    System.out.println("해당 코드의 학생이 없습니다.");
                    continue;
                }
                System.out.println(s);

            }else if(select.equals("4")) {
                System.out.println("[ 학생 이름 수정 ]");
                System.out.print("학생 코드 >> ");
                int code = scanner.nextInt();
                scanner.nextLine();
                System.out.print("이름 >> ");
                String name = scanner.nextLine();
                studentService.modifyStudentName(code, name);

            }else if(select.equals("5")) {
                System.out.println("[ 학생 삭제 ]");
                System.out.println("학생 코드 >> ");
                int code = scanner.nextInt();
                scanner.nextLine();
                studentService.removeStudent(code);

            }else {
                System.out.println("다시 선택하세요.");
                System.out.println();
            }
            System.out.println();

        }

    }
}
