#!/usr/bin/env python3
# -*- coding: utf-8 -*-
print("aaaa");

#a=input("请输入一个数字");
#if int(a)> 10:
#	print ("这是一个大于10 的数",a);
#else:
#   print("它小于10",a);

print(r"ssss\\\\");
print("aaaa\"aaa\"ccccc");
print('I\'m ,ok');

t_007='t_007';
#None
print(">>>>>>>>>>>>>>python中的除法");
print(t_007);

print(9/3);
print("地板除 10//3//>>>>",10//3);
print(10/3);
print("10%3取余数>>>",10%3);
print("练习>>>>>>>>>>");
n=123
f=456.789
s1='hello,world';
s2='Hello,\'admin\'';
s3=r'hello,"Bart"';
s4=r'''Hello,Lisa!''';
print(n);
print(f);
print(s1);
print(s2);
print(s3);
print(s4);
print("python的字符串篇");
print(r"字符串的整数编码\u4e2d\u6587",'\u4e2d\u6587');
print('ord()获取单个字符串的整数标示',ord('A'));
print('chr()函数吧编码转换成对应的字符',chr(97));
print('读取字节bytes decode()','中文'.encode('utf-8'));
print(r'要把bytes变为str，就需要用decode()方法',b'\xe4\xb8\xad\xe6\x96\x87'.decode('utf-8'));
print('len()函数计算的是str的字符数，如果换成bytes，len()函数就计算字节数',len('中文'.encode('utf-8')));
print('len()函数计算的是str的字符数，如果换成bytes，len()函数就计算字节数',len('abcd'));
print('在Python中，采用的格式化方式和C语言是一致的，用%实现，举例如下');
print('Hello, %s' %'world');
print('Hi %s you have $ %d.' %('Michael',10000));
print('%2d-%2d' %(3,2));
s = 'Python-中文'
print(s)
b = s.encode('utf-8')
print(b)
print(b.decode('utf-8'))

print('list 变量classmates就是一个list。用len()函数可以获得list元素的个数');
classmates=['aaa','bbb','ccc'];
print(classmates,'classmates Size',len(classmates));
classmates.append('Adam');
print('新增了一个值Adam',classmates);
classmates.insert(1,'1Jack');
print('在1的位置插入了Jack',classmates)
print('要删除list末尾的元素，用pop()方法,要删除指定位置的元素，用pop(i)方法')
classmates.pop();
classmates.pop(1);
print(classmates);
print('要把某个元素替换成别的元素，可以直接赋值给对应的索引位置');
classmates[1]='dddd';
print(classmates);
L=[111,2222];
classmates.insert(1,L);
print(classmates);
ls=['aa','bb','cc']
t=(1,2,3,4,ls);
print('tuple一旦初始化就不能修改',t);
print('修改list中的值',t[4][0]);
t[4].insert(4,'dddd');
print(t);
print('list和tuple是Python内置的有序集合，一个可变，一个不可变。根据需要来选择使用它们')
print('if判断if elif ')

age=11;
if age>10:
	print('age大于10');
else:
	print('age小于10');	
print('判断age是否有值 if age ')
if age:
	print('age有值');
else:
	print('age没值');
#************************************
print('python循环 for...in');
names=['aaa','bbbb','cccc'];

for a in names:
	print(a); 

print('Python提供一个range()函数，可以生成一个整数序列，再通过list()函数可以转换为list');
#num=list(range(10));
#print(num);
num=0;
for x in range(101):
	num=num+x;
print('100个数字相加',num);

print('第二种循环是while循环')
sum=0;
n=99;
while n>0:
	sum=sum+n
	n=n-2
print(sum)
print('Python内置了字典：dict的支持，dict全称dictionary，在其他语言中也称为map，使用键-值（key-value）存储，具有极快的查找速度。');
d={'Michael':95,'Bob':75,'whq':88};
print('whq的成绩是',d['whq']);
d['whq']=99
print('whq偷偷的修改成绩是',d['whq']);
print('通过in判断key是否存在：语法 \'whq\' in d');
print('whq' in d)
print('二是通过dict提供的get方法，如果key不存在，可以返回None，或者自己指定的value：');
print(d.get('whq'));
print(d.get('sss',-1));
print('要删除一个key，用pop(key)方法，对应的value也会从dict中删除：');
print(d);
d.pop('whq');
print(d)
#和list比较，dict有以下几个特点：
#查找和插入的速度极快，不会随着key的增加而变慢；
#需要占用大量的内存，内存浪费多。
#而list相反：
#查找和插入的时间随着元素的增加而增加；
#占用空间小，浪费内存很少。
#set和dict类似，也是一组key的集合，但不存储value。由于key不能重复，所以，在set中，没有重复的key。
#set可以看成数学意义上的无序和无重复元素的集合，因此，两个set可以做数学意义上的交集、并集等操作：
s1=set([1,2,3]);
s2=set([2,3,4]);
print(s1,s2);
s1.add('4');

print(s1&s2);
#s.remove('4');
print(s1|s2);
#再议不可变对象
a=['c','d','b','a'];
print('a的排序前的值',a);
a.sort();
print('a的排序后的值',a)
b='abc';
b.re
