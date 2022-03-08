def add_matrix(list1, list2):
    """计算同型矩阵相加
    :param
        i:row
        k:column
    """

    # 判断两个矩阵是同型矩阵
    if len(list1) == len(list2) and len(list1[0]) == len(list2[0]):
        # 创建两个矩阵相加后生成的新矩阵
        list3 = []
        for i in range(len(list1)):
            list3.append([])
            # 循环遍历两个矩阵中每个元素对应相加
            for k in range(len(list1[i])):
                list3[i].append(list1[i][k] + list2[i][k])
        print(list3)
    else:
        print('ERROR:两个矩阵不是同型矩阵，不能相加!')


add_matrix(list1=[[1,2],[3,4]], list2=[[5,6],[7,8]])
