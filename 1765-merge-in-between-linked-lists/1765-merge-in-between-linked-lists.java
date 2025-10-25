/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head=list1;
        ListNode prev=head;
        for(int i=0;i<a-1;i++){
            prev=prev.next;
        }

        ListNode after=head;
        for(int i=0;i<b+1;i++){
            after=after.next;
        }
        prev.next=list2;
        ListNode temp=list2;
        while(temp.next!=null)temp=temp.next;
        temp.next=after;

        return head;
    }
}