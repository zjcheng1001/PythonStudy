#! /bin/bash

while :
do
	echo -n "输入 1 到 5 之间的数 : "
	read num
	case $num in
		1|2|3|4|5) echo "你输入的数字为 : $num !"
		;;
	*) echo "你输入的数字不在 1 到 5 之间，游戏结束！"
			break
		;;
	esac
done
