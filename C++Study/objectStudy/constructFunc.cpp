#include<iostream>
using namespace std;

class Line
{
	public:
		void setLength(double len);
		double getLength(void);
		// Line();		// 这是不带参数的构造函数
		Line(double len);	// 带参数的构造函数
		~Line();		// 这是析构函数
	private:
		double length;
};

// 成员函数定义，包括构造函数
Line::Line(double len)
{
	cout << "Object is being created, length = " << len << endl;
	length = len;
}

Line::~Line(void)
{
	cout << "Object is being deleted" << endl;
}

void Line::setLength(double len)
{
	length = len;
}

double Line::getLength(void)
{
	return length;
}

int main()
{
	// 通过构造函数设置长度为10.0
	Line line(10.0);
	// 获取默认设置的长度
	cout << "Length of line: " << line.getLength() << endl;
	// 再次设置长度
	line.setLength(6.0);
	cout << "Length of line: " << line.getLength() << endl;

	return 0;
}
