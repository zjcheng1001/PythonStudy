#! /bin/bash

# 关系运算符
# 关系运算符只支持数字，不支持字符串
# -eq	相等
# -ne	不相等
# -gt	大于
# -lt	小于
# -ge	大于等于
# -le	小于等于

a=10
b=20

echo "a = $a\r\nb = $b"
if [ $a -eq $b ]
then
	echo "$a -eq $b : a 等于 b"
else
	echo "$a -eq $b : a 不等于 b"
fi
if [ $a -ne $b ]
then
	echo "$a -ne $b : a 不等于 b"
else
	echo "$a - ne $b : a 等于 b"
fi
