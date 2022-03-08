from django.http import HttpResponse

from TestModel.models import Test


# 数据库操作
def testdb(request):
    test1 = Test(name='runoob')
    test1.save()
    return HttpResponse('<p>数据添加成功！</p>')


# 查询数据库
def testdb_query(request):
    # 通过objects模型管理器的all()获得所有行，相当于SQL中SELECT * FROM
    sql_list = Test.objects.all()
    # filter相当于SQL中的WHERE，可设置条件过滤结果
    response1 = Test.objects.filter(id=1)
    # 获取单个对象
    response2 = Test.objects.get(id=1)
    # 限制返回的数据，相当于SQL中的OFFSET 0 LIMIT 2
    response3 = Test.objects.order_by('name')[0:2]
    # 数据排序
    response4 = Test.objects.order_by('id')
    # 上面的方法可以联合使用
    response5 = Test.objects.filter(name='runoob').order_by('id')
    print(sql_list)
    print(response1)
    for res in response1:
        print(res)
    print(response2)
    print(response3)
    print(response4)
    print(response5)
    return HttpResponse(f'<p>{sql_list[0].name}\r\n{response2.name}</p>')


def testdb_update(request):
    # 将id为1的数据name改为Google
    # test1 = Test.objects.get(id=1)
    # test1.name = 'Google'
    # test1.save()
    # 另一种方式
    Test.objects.filter(id=1).update(name='Google_by_filter')
    # 更改所有列
    # Test.objects.all().update(name='Google_column')
    return HttpResponse('<p>修改成功！</p>')


def testdb_del(request):
    # test1 = Test.objects.get(id=1)
    # test1.delete()

    # 另一种方式
    Test.objects.filter(id=1).delete()
    # # 删除所有数据
    # Test.objects.all().delete()
    return HttpResponse('<p>删除成功！</p>')