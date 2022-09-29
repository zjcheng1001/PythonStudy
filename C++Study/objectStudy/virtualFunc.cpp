#include <iostream>
using namespace std;

class Shape
{
	protected:
		int width, height;
	public:
		Shape(int a=0, int b=0)
		{
			width = a;
			height = b;
		}
		virtual int area() = 0;
};

class Rectangle: public Shape{
	public:
		Rectangle( int a=0, int b=0):Shape(a, b) { }
		int area()
		{
			cout << "Rectangle class area: " << width * height << endl;
			return width * height;
		}
};

class Triangle: public Shape{
	public:
		Triangle(int a=0, int b=0):Shape(a, b) { }
		int area()
		{
			cout << "Triangle class area: " << width * height / 2 << endl;
			return width * height / 2;
		}
};

int main(void)
{
	Shape *shape;
	Rectangle rec(10, 7);
	Triangle tri(10, 5);

	// 存储矩形的地址
	shape = &rec;
	// 调用矩形的求面积函数area()
	shape->area();

	// 存储三角形的地址
	shape = &tri;
	shape->area();
	
	return 0;
}
