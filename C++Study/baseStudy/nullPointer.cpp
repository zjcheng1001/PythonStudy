#include<iostream>
using namespace std;

int main()
{
    int *ptr = NULL;
    int *ptr2;
    cout << "ptr的值是: " << ptr << endl;

    if (ptr)
    {
        cout << "ptr不是空指针" << endl;
    }
    else
    {
    	cout << "ptr是空指针" << endl;
    }

    if (!ptr2)
    {
    	cout << "ptr2是空指针" << endl;
    }
    else
    {
	cout << "ptr2不是空指针" << endl;
    }
    cout << "ptr2的值是： ";
    cout << ptr2 << endl;
    return 0;
}
