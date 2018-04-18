package Chapter16.exercise5;

import java.util.NoSuchElementException;

public class LinkedIntList
{
    /*
        Write a method called isSorted that returns true if the list is in sorted (nondecreasing) order and returns false
        otherwise. An empty list is considered to be sorted.
   */

    private ListNode front;

    //  Exercise 5 /////////////////////////////////////////
    public boolean isSorted()
    {
        if (this.front == null) return true;
        else
        {
            ListNode current = this.front;
            int currentValue = current.getData();
            while (current.next != null)
            {
                if (current.next.getData() < currentValue) return false;
                currentValue = current.next.getData();
                current = current.next;
            }
            return true;
        }
    }
    ////////////////////////////////////////////////////////

    public LinkedIntList()
    {
        this.front = null;
    }

    public void add(int value)
    {
        if(this.front == null)
            this.front = new ListNode(value);
        else
        {
            ListNode current = this.front;

            while (current.next != null)
            {
                current = current.next;
            }

            current.next = new ListNode(value);
        }
    }

    @Override
    public String toString()
    {
        if (this.front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.getData();
            ListNode current = this.front.next;

            while (current != null)
            {
                result += ", " + current.getData();
                current = current.next;
            }
            result += "]";
            return result;
        }
    }
}
