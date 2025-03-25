package singleresponsibilityprinciple;

import java.util.List;

public class UserManagerViolatingSRP {
    UserManagerViolatingSRP() {

    }
    //User Authentication Method
    boolean isUserAuthorized(String userId, List<String> userIds){
        return userIds.contains(userId);
    }
    void setUserProfile(String UserProfile){
        System.out.println("setting user profile as ::"+UserProfile);
    }
    void sendEmailNotification(List<String>userIds){
        System.out.println("Sending notification to users....");
    }
}
