// 914. X of a Kind in a Deck of Cards
// In a deck of cards, each card has an integer written on it.
//
// Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:
//
// Each group has exactly X cards.
// All the cards in each group have the same integer.


class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<deck.length;i++)
        {
            if(hm.containsKey(deck[i]))
            {
                hm.put(deck[i],hm.get(deck[i])+1);
            }
            else
            {
                hm.put(deck[i],1);
            }
        }
        int res=0;
        for(HashMap.Entry<Integer,Integer> entry:hm.entrySet())
        {
            if(res==0)
            {
              res=entry.getValue();
            }
            else
            {
               res=gcd(res,entry.getValue());
            }
        }
        if(res>=2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}
