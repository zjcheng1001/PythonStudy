#! /bin/bash
# shell program test

my_array=(A B "C" D)

echo "第一个元素为：${my_array[0]}"
echo "第二个元素为：${my_array[1]}"
echo "第三个元素为：${my_array[2]}"
echo "第四个元素为：${my_array[3]}"
echo "----------------------------"
echo "数组的元素为：${my_array[*]}"
echo "数组的元素为：${my_array[@]}"
echo "----------------------------"
for i in ${my_array[@]};do
	echo "循环：${i}"
done
echo "----------------------------"
for i in ${my_array[*]};do
	echo "循环2：${i}"
done
echo "数组长度为：${#my_array[@]}"
