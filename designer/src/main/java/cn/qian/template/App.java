package cn.qian.template;

/**
 * Created by 千里明月 on 2019/1/8.
 */
/**
 * 概述
 模板方法模式是类的行为模式。准备一个抽象类，将部分逻辑以具体方法以及具体构造函数的形式实现，然后声明一些抽象方法来迫使子类实现剩余的逻辑。不同的子类可以以不同的方式实现这些抽象方法，从而对剩余的逻辑有不同的实现。这就是模板方法模式的用意。
 比如定义一个操作中的算法的骨架，将步骤延迟到子类中。模板方法使得子类能够不去改变一个算法的结构即可重定义算法的某些特定步骤。

 模式中的角色
 抽象类（AbstractClass）：实现了模板方法，定义了算法的骨架。
 具体类（ConcreteClass)：实现抽象类中的抽象方法，已完成完整的算法。

 应用
 举个例子，以准备去学校所要做的工作（prepareGotoSchool）为例，假设需要分三步：穿衣服（dressUp），吃早饭（eatBreakfast），带上东西（takeThings）。学生和老师要做得具体事情肯定有所区别。
 */
public class App {
    public static void main(String[] args) {
        AbstractClass studentClass = new StudentClass();
        AbstractClass teacherClass = new TeacherClass();
        studentClass.prepareGotoSchool();
        teacherClass.prepareGotoSchool();
    }
}
