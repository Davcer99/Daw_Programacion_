package Club;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList <Membership> memberList;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        this.memberList = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member){
        memberList.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers(){
        return memberList.size();
    }

    /**
     * Determinar el numero de miembros que se han unido en el mes indicado
     * @param month El mes que nos interesa
     * @return El numero de miembros que se han unido ese mes 
     */
    public int joinedInMonth(int month){
        
        if (month < 0 || month > 12){
           System.out.println("The month is incorrect"); 
           return 0;
        }else{
            int cnt = 0;
            for (Membership membership : memberList) {
                if (membership.getMonth() == month){
                    cnt++;
                }
            }
            return cnt;
        }   
    }

    public int purge (int month){
        Iterator<Membership> it = memberList.iterator();
        int cnt =0;
        while(it.hasNext()){
            Membership member = it.next();
            if (member.getMonth() == month){
                it.remove();
                cnt++;
            }
        }
        return cnt;
    }
}
