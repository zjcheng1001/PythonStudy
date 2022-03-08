"""
罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。

字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，
所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：

I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
给你一个整数，将其转为罗马数字。

 

示例 1:

输入: num = 3
输出: "III"
示例 2:

输入: num = 4
输出: "IV"
示例 3:

输入: num = 9
输出: "IX"
示例 4:

输入: num = 58
输出: "LVIII"
解释: L = 50, V = 5, III = 3.
示例 5:

输入: num = 1994
输出: "MCMXCIV"
解释: M = 1000, CM = 900, XC = 90, IV = 4.
 

提示：

1 <= num <= 3999


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/integer-to-roman
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
"""


def intToRoman(num):

    length = len(str(num))
    list1 = []
    for n, i in enumerate(str(num)[::-1]):
        list1.append(int(i) * (10**n))
    sorted(list1)
    if length == 4:
        n = list1[3] // 1000
        q_str = 'M' * n
        length -= 1
    else:
        q_str = ''
    if length == 3:
        if list1[2] >= 500:
            if list1[2] == 900:
                b_str = 'CM'
            else:
                b_str = 'D' + 'C' * ((list1[2] - 500) // 100)
        else:
            if list1[2] == 400:
                b_str = 'CD'
            else:
                n = list1[2] // 100
                b_str = 'C' * n
        length -= 1
    else:
        b_str = ''
    if length == 2:
        if list1[1] >= 50:
            if list1[1] == 90:
                s_str = 'XC'
            else:
                s_str = 'L' + 'X' * ((list1[1] - 50) // 10)
        else:
            if list1[1] == 40:
                s_str = 'XL'
            else:
                n = list1[1] // 10
                s_str = 'X' * n
        length -= 1
    else:
        s_str = ''
    if length == 1:
        if list1[0] >= 5:
            if list1[0] == 9:
                g_str = 'IX'
            else:
                g_str = 'V' + 'I' * ((list1[0] - 5) // 1)
        else:
            if list1[0] == 4:
                g_str = 'IV'
            else:
                n = list1[0] // 1
                g_str = 'I' * n
    else:
        g_str = ''
    roman = q_str + b_str + s_str + g_str

    return roman
