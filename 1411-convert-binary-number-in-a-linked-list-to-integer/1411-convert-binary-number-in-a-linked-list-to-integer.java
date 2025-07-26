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
    public int getDecimalValue(ListNode head) {
        // yah i too dont know so lest crack it
        // lemme explain the logic first
        // at first we should know the number of nodes to get that we initialize and traverse the linked list to last node 
        // now we have count of
        // can i cl you 
        //sure
        ListNode temp=head;
        ListNode ptr=head;
        double result=0;
        int count=-1;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        while(temp!=null){
            double pow=Math.pow(2,count);
            result+=pow * temp.val;
            count--;
            temp=temp.next;
        }
        return (int)result;
        
    }
}