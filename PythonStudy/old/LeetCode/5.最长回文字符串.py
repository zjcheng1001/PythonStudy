"""
给你一个字符串 s，找到 s 中最长的回文子串。

 

示例 1：

输入：s = "babad"
输出："bab"
解释："aba" 同样是符合题意的答案。
示例 2：

输入：s = "cbbd"
输出："bb"
示例 3：

输入：s = "a"
输出："a"
示例 4

输入：s = "ac"
输出："a"

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-palindromic-substring
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
"""


def find_circle_str(s):

    str_list = []
    need_list = []
    need_list_num = []
    for n, i in enumerate(s):
        try:
            if s.count(i) > 1:
                l_n = s.index(i)
                r_n = s.index(i, n+1)
                str_list.append(s[l_n:r_n+1])
            else:
                str_list.append(i)
        except:
            pass
    for i in str_list:
        if len(i) > 2:
            a = len(i) // 2
            if i[:a] == i[-1:a:-1]:
                need_list.append(i)
                need_list_num.append(len(i))
        else:
            need_list.append(i)
            need_list_num.append(len(i))
    print(str_list)
    print(need_list)
    return need_list[need_list_num.index(max(need_list_num))]


s = "bcbabc"
# a = find_circle_str(s)
# print(a)


def a(s):
    list1 = []
    if len(s) == 2 and s[0] == s[1]:
        list1.append(s)
    for n, i in enumerate(s):
        if n != len(s):
            for renum in range(n + 1, len(s)):
                if s[n] != s[renum]:
                    break
                else:
                    list1.append(s[n:renum + 1])
        break
    for n, i in enumerate(s):
        if n == 0 or n == (len(s) - 1):
            list1.append(s[n])
        elif s[n] == s[n-1]:
            list1.append(s[n-1:n+1])
        elif s[n] == s[n+1]:
            list1.append(s[n:n+2])
        if n == 0 or n == (len(s) - 1):
            list1.append(s[n])
        else:
            num = min(len(s[:n+1]), len(s[n:]))
            for k in range(num):
                if k == 0:
                    pass
                else:
                    if s[n-k] == s[n+k]:
                        if k > 1:
                            for x in range(k-1):
                                if s[n-k+x+1] == s[n-k+x+3]:
                                    strs = s[n-k:n+k+1]
                                    # try:
                                    #     if s[n-k-1]==s[n-k]==s[n-k+1]:
                                    #         strs = s[n-k-1:n+k+1]
                                    #     elif s[n+k-1]==s[n+k]==s[n+k+1]:
                                    #         strs = s[n-k:n+k+2]
                                    # except:
                                    #     pass
                                    list1.append(strs)
                        else:
                            strs = s[n - k:n + k + 1]
                            # try:
                            #     if s[n - k - 1] == s[n - k] == s[n - k + 1]:
                            #         strs = s[n - k - 1:n + k + 1]
                            #     elif s[n + k - 1] == s[n + k] == s[n + k + 1]:
                            #         strs = s[n - k:n + k + 2]
                            # except:
                            #     pass
                            list1.append(strs)
    list2 = [len(i) for i in list1]
    # print(list1)
    return list1[list2.index(max(list2))]

# s = 'bcbad'
# a(s)
# print(a('cccc'))
strs = ['a', 'ab', 'abc', 'xxcabcdexfgfedcbadxx','abcb', 'abcba', 'abcdceba', 'abbc', 'abcbd', 'ccc','bcbabc','cccsbdc','cccccccs','cccc','bdcaccsees']
for i in strs:
    print(a(i))
