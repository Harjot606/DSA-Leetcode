/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sumL1=0;
        int sumL2=0;
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null){
            sumL1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            sumL2++;
            temp2=temp2.next;
        }

        temp1=headA;
        temp2=headB;
        if(sumL1>sumL2){
            int dif=sumL1-sumL2;
            for(int i=0;i<dif;i++){
                temp1=temp1.next;
            }

        }
        else if(sumL2>sumL1){
            int dif=sumL2-sumL1;
            for(int i=0;i<dif;i++){
                temp2=temp2.next;
            }
        }

        while(temp1!=null){
            if(temp1==temp2){
                return temp1;}
                temp1=temp1.next;
                temp2=temp2.next;
            
           
        }
        return null;
    }
}