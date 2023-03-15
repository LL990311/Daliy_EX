'''
/**
 * Mar 15 2023
 * Leetcode_24
 * Written by Python
 * Author: LukeLong
 */


/**
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。
 * 你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 * 
 * 迭代
 * 时间 O(n)
 * 空间 O(1)
 *
 * 递归
 * 时间 O(n)
 * 空间 O(1)
 */
'''


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


# def swapPairs(self, head: ListNode) -> ListNode:
#     dummy = ListNode(0)
#     dummy.next = head
#     temp = dummy
#     while temp.next and temp.next.next:
#         node1, node2 = temp.next, temp.next.next
#         temp.next = node2
#         node1.next = node2.next
#         node2.next = node1
#         temp = node1
#     return dummy.next

#  recursion
def swapPairs(head: ListNode) -> ListNode:
    if not head or not head.next:
        return head
    newHead = head.next
    head.next = swapPairs(newHead.next)
    newHead.next = head
    return newHead


def main():
    test = ListNode(0)
    dummy = test
    for i in range(1, 5):
        temp = ListNode(i)
        test.next = temp
        test = test.next
    res = swapPairs(dummy.next)
    while res:
        print(res.val)
        res = res.next


if __name__ == '__main__':
    main()
