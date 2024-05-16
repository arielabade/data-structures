
# Pointers


Pointers are memory regions reserved to instanciate all kinds of variables.

In any language, you define a pointer statically.


If you have...

```
int num1 = 11
int num2 = num1
```

This means that in the moment **num2** was created, it pointed out to **num1**, so it has the same value as **num1** but if we change the value alocated in **num1** it does not mean **num2** will also change, because **num2** it is just a copy of **num1**

But if you have...

```
public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = obj1; 

        obj1.valor = 10;
        System.out.println(obj2.value);  
    }
}
```

Then **obj1** and **obj2** are reference variables that point to the same object of the class **MinhaClasse**, that is alocated in a particular and unique memory space. Therefore, any modification made through **obj1** will be reflected when you access the object through **obj2**.

This kind of sintax also exists in other languages, like C.