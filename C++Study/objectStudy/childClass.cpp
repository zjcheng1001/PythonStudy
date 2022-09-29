#include <iostream>
using namespace std;

// 基类
class Shape
{
	public:
		void setWidth(int w)
		{
			width = w;
		}
		void setHeight(int h)
		{
			height = h;
		}
	protected:
		int width;
		int height;
};

// 基类
class PaintCost
{
	public:
		int getCost(int area)
		{
			return area * 70;
		}
};

// 派生类
class Rectangle: public Shape, public PaintCost
{
	public:
		int getArea()
		{
			return (width * height);
		}
};

int main(void)
{
	Rectangle Rect;

	Rect.setWidth(5);
	Rect.setHeight(7);

	// 输出对象的面积
	cout << "Total area: " << Rect.getArea() << endl;

	// 输出总花费
	cout << "Total paint cost: " << Rect.getCost(Rect.getArea()) << endl;
	return 0;
}
