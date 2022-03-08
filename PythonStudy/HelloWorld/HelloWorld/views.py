from django.shortcuts import render


# 模板示例
def hello(request):
    """
    模板语法：
        view：{"HTML变量名" : "views变量名"}
        HTML：{{ 变量名 }}
    """
    context = dict()
    context['hello'] = 'This is page Hello'
    context['p'] = 'this is a tag “P“'
    return render(request, 'hello.html', context)


# view_name
def runoob_name(request):
    views_name = "菜鸟教程"
    return render(request, 'runoob.html', {'name': views_name})


# view_list
def runoob_list(request):
    view_list = ['菜鸟教程1', '菜鸟教程2', '菜鸟教程3']
    return render(request, 'runoob.html', {'view_list': view_list})


# view_dict
def runoob_dict(request):
    view_dict = {'name': '菜鸟教程'}
    return render(request, 'runoob.html', {'view_dict': view_dict})


# view_filter
def runoob_filter(request, name):
    """如果name不为false，则返回name，否则返回模板中默认值（菜鸟教程666）"""
    return render(request, 'runoob.html', {'name': name})


# view_filter
def runoob_filter_safe(request):
    link = "<a href='https://www.runoob.com/'>点击跳转</a>"
    return render(request, 'runoob.html', {'link': link})


# if else
def runoob_condition(requset, num):
    return render(requset, 'runoob.html', {'num': num})


# for/end for
def runoob_for(requset):
    view_list = ['菜鸟教程1', '菜鸟教程2', '菜鸟教程3']
    return render(requset, 'runoob.html', {'for_list': view_list})