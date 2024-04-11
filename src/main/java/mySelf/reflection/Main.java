package mySelf.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Erfan Akhavan Rad
 * @created 04/01/2024
 */
public class Main {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat myCat = new Cat("Erfan", 23);
        Field[] catFields = myCat.getClass().getDeclaredFields();

//        System.out.println(myCat.getName());
        for (Field field : catFields) {

//            System.out.println("field.getType().toString() " + field.getType().toString());
//            System.out.println("field.getType().getSimpleName() " + field.getType().getSimpleName());
//            System.out.println("field.getType().getName() " + field.getName());
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "new name");
            }
            // TODO: 4/1/2024 How to see the value of a field using reflection? ;
        }
//        System.out.println(myCat.getName());

        Method[] methods = myCat.getClass().getDeclaredMethods();
        for (Method method : methods) {
//            System.out.println(method.getName());
            if (method.getName().equals("meowName")) {
                method.invoke(myCat, "Erfan");
            }

            if (method.getName().equals("heyThisIsPrivate")) {
                method.setAccessible(true);
                method.invoke(myCat);
            }

            if (method.getName().equals("thisIsAPrivateStaticMethod")) {
                method.setAccessible(true);
                method.invoke(null);
            }

        }


    }

}
