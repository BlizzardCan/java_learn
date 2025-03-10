# 记录部分关键



super 超类 继承子类创建首先调用父类构造方法，如果没有对应的构造参数，在子类构造函数中显示调用

```
super(age,name);
```



判断是什么类

```
a instanceof b 
```



子类访问不了父类的private变量，但改为protected就可以了



向上转型与向下转型

```
Person a = new Student();
Student b = new Person();
```



Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。这个非常重要的特性在面向对象编程中称之为多态。所以，多态的特性就是，运行期才能动态决定调用的子类方法。对某个类型调用某个方法，执行的实际方法可能是某个子类的覆写方法。这种不确定性的方法调用



用``super.hello()`` 来调用已经被覆写的父类方法



用final修饰的方法不能被覆写，类也可以用final修饰 ``final class person{}``，字段也可以``public final String name = "Unamed";``即后续不可以再修改这个字段，`final`修饰的field必须在创建对象时初始化，随后不可修改。



多态：

如果父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是让子类去覆写它，那么，可以把父类的方法声明为抽象方法：

```java
class Person {
    public abstract void run();
}
```

把一个方法声明为`abstract`，表示它是一个抽象方法，本身没有实现任何方法语句。因为这个抽象方法本身是无法执行的，所以，`Person`类也无法被实例化。编译器会告诉我们，无法编译`Person`类，因为它包含抽象方法。

必须把`Person`类本身也声明为`abstract`，才能正确编译它：

```java
abstract class Person {
    public abstract void run();
}
```



**如果一个抽象类没有字段**，所有方法全部都是抽象方法：

```java
abstract class Person {
    public abstract void run();
    public abstract String getName();
}
```

就可以把该抽象类改写为接口：`interface`。

在Java中，使用`interface`可以声明一个接口：

```java
interface Person {
    void run();
    String getName();
}
```



