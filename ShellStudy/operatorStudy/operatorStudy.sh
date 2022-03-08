#! /bin/bash

a=10
b=20

# 完整的表达式要用``包含，``不是单引号，在Esc键下方
val=`expr $a + $b`
echo "a + b : $val"

val=`expr $a - $b`
echo "a - b : $val"

val=`expr $a \* $b`
echo "a * b : $val"

val=`expr $a / $b`
echo "a / b : $val"

# % 取余
val=`expr $a % $b`
echo "a % b : $val"

# 条件表达式要放在方括号之间，并且要有空格
if [ $a == $b ]
then
	echo "a 等于 b"
fi

if [ $a != $b ]
then
	echo "a 不等于 b"
fi
