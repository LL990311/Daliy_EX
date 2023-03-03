'''
/**
 * Mar 03 2023
 * Leetcode_1487
 * Written by Python
 */

给你一个长度为 n 的字符串数组 names 。你将会在文件系统中创建 n 个文件夹：在第 i 分钟，新建名为 names[i] 的文件夹。

由于两个文件 不能 共享相同的文件名，因此如果新建文件夹使用的文件名已经被占用，系统会以 (k) 的形式为新文件夹的文件名添加后缀，其中 k 是能保证文件名唯一的 最小正整数 。

返回长度为 n 的字符串数组，其中 ans[i] 是创建第 i 个文件夹时系统分配给该文件夹的实际名称。

哈希表
时间 O(n^2)
空间 O(n^2)

'''


def getFolderNames(self, names: list[str]) -> list[str]:
    res = []
    dic = {}
    for name in names:
        if name not in dic:
            res.append(name)
            dic[name] = 1
        else:
            c = dic[name]
            while name + "(" + str(c) + ")" in dic:
                c += 1
            t = name + "(" + str(c) + ")"
            res.append(t)
            dic[t] = 1
    return res


def main():
    print(getFolderNames(any, ["gta", "gta(1)", "gta", "avalon"]))


if __name__ == "__main__":
    main()
