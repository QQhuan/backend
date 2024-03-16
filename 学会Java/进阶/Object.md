[toc]

# Object类

##  toString方法

println对象默认调用toString方法，打印对象全类名@地址哈希值的十六进制值

## equals方法

默认比较对象地址，一般要重写

## Objects

属于Object工具类

- Objects.*equals*()方法，先判断null

- Objects.deepEquals()方法，内部会调Arrays.*deepEquals0()*方法

## 