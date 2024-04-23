package com.qquhuan.CollectionMap;

import com.qquhuan.classes.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionTest2 {
    public static void main(String[] args) {
        /*
        * iterator
        * */
        Collection<Student> c = new ArrayList<>();
        c.add(new Student("qh", "SY2023"));
        c.add(new Student("xx", "S2023"));

        Iterator<Student> itr = c.iterator();

        while(itr.hasNext()) {
            Student s = itr.next();
            // System.out.println(s);
        }

        for (Student student : c) {
            
        }

        c.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });

    }
}
