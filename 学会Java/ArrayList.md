[toc]

# ArrayList

```java
ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student();
        stu1.setName("邱焕");
        list.add(stu1);
        Student stu2 = new Student();
        stu2.setName("邱焕2");
        list.add(stu2);
        for(Student s : list) {
            System.out.println(s.getName());
        }
```

- add
- remove
- get
- set
- size
- contains
- indexOf
- isEmpty
- sort 要Collections
- clear
- clone
- toString
- toArray