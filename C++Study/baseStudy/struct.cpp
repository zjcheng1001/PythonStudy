#include<iostream>
#include<cstring>

using namespace std;
void printBook(struct Books book);
void printBookByPointer(struct Books *book);

// 声明一个结构体类型Books
struct Books
{
	char title[50];
	char author[50];
	char subject[100];
	int book_id;
};

int main()
{
	Books Book1;	// 定义结构体类型Books的变量Book1
	Books Book2;

	// Book1详述
	strcpy(Book1.title, "C++教程");
	strcpy(Book1.author, "Runoob");
	strcpy(Book1.subject, "编程语言");
	Book1.book_id = 12345;

	// Book2详述
	strcpy(Book2.title, "CSS教程");
	strcpy(Book2.author, "Runoob");
	strcpy(Book2.subject, "前端技术");
	Book2.book_id = 12346;

	// 输出Book1信息
	cout << "第一本书标题: " << Book1.title << endl;
	cout << "第一本书作者: " << Book1.author << endl;
	cout << "第一本书类目: " << Book1.subject << endl;
	cout << "第一本书ID: " << Book1.book_id << endl;

	// 输出Book2信息
	cout << "第二本书标题: " << Book2.title << endl;
	cout << "第二本书作者: " << Book2.author << endl;
	cout << "第二本书类目: " << Book2.subject << endl;
	cout << "第二本书ID: " << Book2.book_id << endl;
	
	cout << "" << endl;

	// 结构作为函数参数
	// 输出Book1信息
	printBook(Book1);
	// 输出Book2信息
	printBook(Book2);
	
	cout << "" << endl;
	
	// 通过传Book1的地址来输出Book1的信息
	printBookByPointer(&Book1);

	printBookByPointer(&Book2);

	return 0;
}

void printBook(struct Books book)
{
	cout << "书标题: " << book.title << endl;
	cout << "书作者: " << book.author << endl;
	cout << "书类目: " << book.subject << endl;
	cout << "书ID: " << book.book_id << endl;
}

// 该函数以结构指针作为参数
void printBookByPointer(struct Books *book)
{
	cout << "书标题: " << book->title << endl;
	cout << "书作者: " << book->author << endl;
	cout << "书类目: " << book->subject << endl;
	cout << "书ID: " << book->book_id << endl;
}
