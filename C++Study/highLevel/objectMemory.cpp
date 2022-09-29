#include <iostream>
using namespace std;

class Box
{
	public:
		Box()
		{
			cout << "调用构造函数" << endl;
		}

		~Box()
		{
			cout << "调用析构函数" << endl;
		}
};

int main()
{
	// 创建一个包含4个Box对象的数组，构造函数将被调用4次
	 Box* myBoxArray = new Box[4];
	 // 删除对象时，析构函数将被调用4次
	 delete [] myBoxArray;

	 return 0;
}
