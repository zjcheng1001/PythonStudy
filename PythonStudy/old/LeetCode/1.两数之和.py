"""
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

示例 1：

输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
示例 2：

输入：nums = [3,2,4], target = 6
输出：[1,2]
示例 3：

输入：nums = [3,3], target = 6
输出：[0,1]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/two-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
"""


def return_list(nums, target):
    tmp = []
    for i in nums:
        num_new = [k for k in nums]
        x = target - i
        num_new.remove(i)
        if x in num_new:
            tmp.append(nums.index(i))
            tmp.append(num_new.index(x)+1)
            break
    return tmp


"""
提交结果	执行用时	内存消耗	语言	提交时间	备注
通过	2736 ms	13.6 MB	Python	2021/05/27 18:45	
添加备注
"""