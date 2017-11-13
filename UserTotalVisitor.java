/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorPattern;

import cs356_twitter.Group;
import cs356_twitter.User;

public class UserTotalVisitor implements Visitor 
{    
    private int userTotal = 0;
    
    public int returnTotal() {
        return userTotal;
    }
    
    @Override
    public void atGroup(Group e) {}     // do nothing

    @Override
    public void atUser(User e) {
        userTotal += 1;
    }
    
}
