"""HelloWorld URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/4.0/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path, re_path, include
from . import views, testdb, search


urlpatterns = [
    path('admin/', admin.site.urls),
    path('hello/', views.hello),
    path('runoob_name/', views.runoob_name),
    path('runoob_list/', views.runoob_list),
    path('runoob_dict/', views.runoob_dict),
    path('runoob_filter/<int:name>/', views.runoob_filter),
    path('runoob_filter/safe/', views.runoob_filter_safe),
    path('runoob_condition/<int:num>/', views.runoob_condition),
    path('runoob_for/', views.runoob_for),
    path('testdb/', testdb.testdb),
    path('testdb/query/', testdb.testdb_query),
    path('testdb/update/', testdb.testdb_update),
    path('testdb/delete/', testdb.testdb_del),
    re_path(r'^search-form/$', search.search_form),
    re_path(r'^search/$', search.search),
    re_path(r'^search.post/$', search.search_post),
    # 路由分发
    path('TestModel/', include('TestModel.urls')),
]
