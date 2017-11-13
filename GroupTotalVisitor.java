/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorPattern;

import cs356_twitter.Group;
import cs356_twitter.User;

public class GroupTotalVisitor implements Visitor 
{    
    private int groupTotal = 0;
    
    public int returnTotal() {
        return groupTotal;
    }
    
    @Override
    public void atGroup(Group e) {
        groupTotal += 1;
    }

    @Override
    public void atUser(User e) {}        // do nothing
}
