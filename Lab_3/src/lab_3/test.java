
package lab_3;


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Student[] s = new PhD[2];
        s[0] = new PhD("张宇航", "男", 22);
        s[1] = new PhD("周洺旭", "男", 22);
        Teacher[] t = new PhD[2];
        t[0] = new PhD("ddd", "男", 32);
        t[1] = new PhD("zzz", "男", 30);

        int num = 0;
       try { while (num < s.length) {
        	
            Scanner scanner = new Scanner(System.in);
            System.out.print("请数入" + s[num].getName() + "的学费：");
            int tuition = scanner.nextInt();
            System.out.print("请输入" + t[num].getName() + "的薪水：");
            int salary = scanner.nextInt();
            s[num].payTuition(tuition);
            t[num].paySalary(salary);
            num++;
        }

        System.out.println("\n===============纳税金额===============");

        final double tax_rate = 0.1;
        for (int i = 0; i < s.length; i++) {
            double net = t[i].checkSalary() * 12 - s[i].checkTuition();
            double totalTax = net * tax_rate;
            System.out.printf("%s的年应纳税金额为：%.2f\n", t[i].getName(), totalTax);
        }
    }
       catch(Exception s1){
    	   System.out.println("发成异常："+s1.getMessage());
       }
}
}


interface Student {
    void payTuition(int tuition);
    int checkTuition();
    String getName();
}

interface Teacher {
    void paySalary(double salary);
    double checkSalary();
    String getName();
}

class PhD implements Student, Teacher {
    public String name;
    public String sex;
    public int age;
    public int tuition;
    public double salary;

    public PhD(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void payTuition(int tuition) {
        this.tuition = tuition;
    }

    @Override
    public int checkTuition() {
        return this.tuition;
    }

    @Override
    public void paySalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double checkSalary() {
        return this.salary;
    }
}

