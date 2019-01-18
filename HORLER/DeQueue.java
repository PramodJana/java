import java.util.*;
class DeQueue
{
    int cap;
    int ele[] =new int [cap];
    int front ,rear;
    DeQueue(int max)
    {
        cap=max;
        front =-1;
        rear=-1;
    }
    void pushfront(int v)
    {
        if(front ==0)
        {
            System.out.println("FULL FROM FRONT ");
        }
        else
        {
            front --;
            ele[front]=v;
        }
    }
    int popfront()
    {
        int result;
        if(front ==-1)
        {
            return -999;
        }
        else if(front ==rear)
        {
            result= ele[front];
            front =-1;
            return result;
        }
        else
        {
            result=ele[front];
            front ++;
            return result;
        }
    }
    void pushrear(int v)
    {
        if(rear ==-1)
        {
            rear=0;
            front =0;
            ele[rear]=v;
        }
        else if(rear ==(cap-1))
        {
            System.out.println("FULL FROM REAR");
        }
        else
        {
            rear =rear+1;
            ele[rear]=v;
        }
    }
    int poprear()
    {
        int result;
        if(rear== -1)
        {
            return -999;
        }
        else if(rear ==0)
        {
            result =ele[rear];
            rear = -1;
            return result;
        }
        else
        {
            result=ele[rear];
            rear =rear-1;
            return result;
        }
    }
}

    