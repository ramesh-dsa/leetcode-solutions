//todo            876. Middle of the Linked List
// https://leetcode.com/problems/middle-of-the-linked-list/description/

/*
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 /* 
class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0 ;
        ListNode temp = head ;

        while(temp!=null){
            count++;
            temp = temp.next ;
        }

        int i = 0 ;
        ListNode temp1 = head ;
        if(count%2==1){
            while(temp1!=null){
                if(i==count/2){
                    return temp1 ; 
                }
                temp1 = temp1.next ;
                i++;
            }
        }
        else
        {
            while(temp1!=null){
                if(i==count/2){
                    return temp1 ; 
                }
                temp1 = temp1.next ;
                i++;
            }
        }
        return temp1;
    }
}
*/
