#include<iostream>
using namespace std;

// 函数声明
double getAvg(int arr[], int size);

double getAvg(int arr[], int size)
{
    int sum;
    for (int i = 0; i < size; i++)
    {
    	sum += arr[i];
    }

    double avgNum = double(sum) / size;
    return avgNum;
}

int main()
{
    // 带有5个元素的数组
    int arr[5] = {1000, 2, 3, 17, 50};
    // 传递一个指向数组的指针作为参数
    double avg = getAvg(arr, 5);
    cout << "平均值是：" << avg << endl;
    return 0;
}
