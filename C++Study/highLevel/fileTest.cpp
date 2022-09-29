#include <fstream>
#include <iostream>

using namespace std;

int main()
{
	ifstream infile;
	infile.open("afile.dat");

	if (!infile.is_open())
	{
		cout << "File Open Failed!" << endl;
	}

	// 利用string中的getline按行读取文件
	string buff;
	while (getline(infile, buff))
	{
		cout << buff << endl;
	}
	infile.close();

	return 0;
};
