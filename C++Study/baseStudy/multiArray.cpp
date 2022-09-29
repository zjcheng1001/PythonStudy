#include<iostream>
using namespace std;

int main()
{
    // 一个5行2列的二维数组
    int array[5][2] = {{0, 1}, {2, 3}, {4, 5}, {6, 7}, {8, 9}};
    for (int i = 0; i < 5; i++)
	for (int j = 0; j < 2; j++)
	    {
	 	cout << "array[" << i << "][" << j << "]: ";
		cout << array[i][j] << endl;
	    }
    return 0;
}
