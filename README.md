# java第二次试验  计G201 2020322057 周洺旭
# 阅读程序  
## 程序内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。  
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。  
2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）  
3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。  
### 实验要求：  
1.在 博士研究生类中实现各个接口定义的抽象方法;
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
5.根据输入情况，要在程序中做异常处理。
## 实验目的  
1.掌握Java中抽象类和抽象方法的定义；   
2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法  
3.了解异常的使用方法，并在程序中根据输入情况做异常处理  

## 试验过程
1.首先对整体试验进行构思，需要一个类（博士研究生）并且设计两个接口一个为学生本身 一个为研究生助教。
···
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
···
2.将phd（研究生）类利用 implements方法继承给student和teacher
3.重写接口中的所有方法  
4.最后在test类中利用数组的方式将两个人员进行输出在该环节用到了scanner进行输入
5.本实验设计到税收问题改程序编程大致内容如下  
···
  final double tax_rate = 0.1;
        for (int i = 0; i < s.length; i++) {
            double net = t[i].checkSalary() * 12 - s[i].checkTuition();
            double totalTax = net * tax_rate;
            System.out.printf("%s的年应纳税金额为：%.2f\n", t[i].getName(), totalTax);
        }
    }
···
## 核心方法  
1.scanner输入方法（注意int tuition = scanner.nextInt();输入条件的判定）
2.接口基本知识（接口的定义、接口重写涉及到抽象方法和非抽象方法是否重写：抽象类不重写）  
3.异常报错try{} catch{}
## 试验结果
!(https://github.com/zhoumingxu66/lab-3/blob/main/picture/55e35741af16ffbb5a7ebd285fdd647.jpg)  
## 试验心得  
本次试验涉及到接口的继承该知识内容可以对照类的父类子类继承进行学习，异常报错知识点try{}后可以接多个catch代码块，在多个catch代码块下顺序应该是子类在上父类在下 级别越高顺序越靠下。

