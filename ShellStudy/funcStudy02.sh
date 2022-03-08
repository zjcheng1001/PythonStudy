#! /bin/bash

funWithReturn(){
	echo "输入第一个数："
	read Num01
	echo "输入第二个数："
	read Num02
	echo "两个数字分别为$Num01和$Num02"
	return $(($Num01+$Num02))
}

funWithReturn
echo "输入的两数之和为：$? ！"
