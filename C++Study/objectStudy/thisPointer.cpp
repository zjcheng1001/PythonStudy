#include <iostream>
using namespace std;

class Box
{
	public:
		// 构造函数定义
		Box(double l=2.0, double b=2.0, double h=2.0)
		{
			cout << "Constructor called." << endl;
			length = l;
			breadth = b;
			height = h;
		}
		double Volume()
		{
			return length * breadth * height;
		}
		int compare(Box box)
		{
			return this->Volume() > box.Volume();
		}
	private:
		double length;
		double breadth;
		double height;
};

int main(void)
{
	Box box1(3.3, 1.2, 1.5);
	Box box2(8.5, 6.0, 2.0);
	if (box1.compare(box2))
	{
		cout << "box2 is smaller than box1" << endl;
	}
	else
	{
		cout << "box2 is equal to or larger than box1" << endl;
	}

	Box *ptrBox;	// 指向类的指针
	// 保存第一个对象的地址
	ptrBox = &box1;
	// 现在尝试使用成员访问运算符来访问成员
	cout << "Volume of box1: " << ptrBox->Volume() << endl;

	ptrBox = &box2;
	cout << "Volume of box2: " << ptrBox->Volume() << endl;
	return 0;
}
