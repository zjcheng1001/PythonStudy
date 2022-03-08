#! /bin/bash

funWithParam(){
	echo "输入的第一个参数为 : $1 !"
	echo "输入的第二个参数为 : $2 !"
	echo "输入的第十个参数为 : $10 !"
	echo "输入的第十个参数为 : ${10} !"
	echo "输入的第十一个参数为 : ${11} !"
	echo "参数总个数有 $# 个！"
	echo "作为一个字符串输出所有的参数 : $* !"
}

funWithParam 1 2 3 4 5 6 7 8 9 34 73
