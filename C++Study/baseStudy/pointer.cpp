#include<iostream>
using namespace std;

int main()
{
    int var = 20;	// 实际变量的声明
    int *ip;		// 指针变量的声明
    ip = &var;		// 在指针变量中存储var的地址

    cout << "Value of var variable: ";
    cout << var << endl;

    // 输出在指针变量中存储的地址
    cout << "Address stored in ip variable: ";
    cout << ip << endl;

    // 访问指针中地址的值
    cout << "Value of *ip variable: ";
    cout << *ip << endl;

    cout << "*ip == var: "; 
    cout << (*ip == var) << endl;
    cout << "ip = &var: "; 
    cout << (ip == &var) << endl;
    return 0;
}
