#include<iostream>
using namespace std;

int main()
{
    int var[3] = {10, 100, 200};
    int *ptr;

    // 指针中的数组地址
    ptr = var;
    cout << ptr << endl;
    cout << "递增一个指针: " << endl;
    for (int i = 0; i < 3; i++)
    {
        cout << "Address of var[" << i << "] = ";
	cout << ptr << endl;
	cout << "Value of var[" << i << "] = ";
	cout << *ptr << endl;
	// 移动指针到下一位置
	ptr++;
    }

    // 指针中最后一个元素的地址
    ptr = &var[2];
    cout << ptr << endl;
    cout << "递减一个指针: " << endl;
    for (int i = 3; i > 0; i--)
    {
    	cout << "Address of var[" << i << "] = ";
	cout << ptr << endl;
	cout << "Value of var[" << i << "] = ";
	cout << *ptr << endl;

	//移动指针到下一位置
	ptr--;
    }

    cout << "指针的比较" << endl;
    ptr = var;
    while ( ptr <= &var[2] )
    {
    	cout << *ptr << endl;
	ptr++;
    }    
    return 0;
}
