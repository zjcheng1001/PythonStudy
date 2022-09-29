#include <iostream>
using namespace std;

class Box
{
	public:
		static int objectCount;
		// 构造函数定义
		Box(double l=2.0, double b=2.0, double h=2.0)
		{
			cout << "Constructor called." << endl;
			length = l;
			breadth = b;
			height = h;
			// 每次创建对象时增加1
			objectCount++;
		}
		double Volume()
		{
			return length * breadth * height;
		}
		static int getCount()
		{
			return objectCount;
		}
	private:
		double length;
		double breadth;
		double height;
};

// 初始化Box类的静态成员
int Box::objectCount = 0;

int main(void)
{
	// 在创建对象之前输出对象的总数
	cout << "Inital Stage Count: " << Box::getCount() << endl;

	Box box1(3.3, 1.2, 1.5);
	Box box2(8.5, 6.0, 2.0);
	Box box3(1.5, 3.5, 5.0);

	// 输出对象的总数
	cout << "Total objects: " << Box::objectCount << endl;
	// 在创建对象之后输出对象的总数
	cout << "Final Stage Count: " << Box::getCount() << endl;
	return 0;
}
