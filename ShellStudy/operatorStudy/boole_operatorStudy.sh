#! /bin/bash

a=10
b=20

if [ $a != $b ]
then 
	echo "$a != $b : a 不等于 b"
else
	echo "$a != $b : a 等于 b"
fi

if [ $a -lt 100 -a $b -gt 15 ]
then
	echo "$a 小于100 且 $b 大于15 : 返回true"
else
	echo "$a 小于100 且 $b 大于15 : 返回false"
fi

if [ $a -lt 100 -o $b -gt 100 ]
then 
	echo "$a 小于100 或 $b 大于100 : 返回true"
else
	echo "$a 小于100 或 $b 大于100 : 返回flase"
fi

if [ $a -lt 5 -o $b -gt 100 ]
then
	echo "$a 小于5 或 $b 大于100 : 返回true"
else
	echo "$a 小于5 或 $b 大于100 : 返回false"
fi
