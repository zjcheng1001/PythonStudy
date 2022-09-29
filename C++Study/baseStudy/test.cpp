#include<iostream>
using namespace std;

int * retNum(int num);

int main()
{
	int *n = retNum(5);
	for (int i = 0; i < 5; i++)
	{
		cout << *n <<endl;
		n++;
	}
	return 0;
}

int * retNum(int num)
{
	static int list[5] = {1, 2, 3, 4};
	list[4] = num;
	return list;

}
