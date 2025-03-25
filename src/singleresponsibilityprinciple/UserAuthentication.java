package singleresponsibilityprinciple;

import java.util.List;

public class UserAuthentication {
    boolean isUserAuthorized(String userId, List<String> userIds){
        return userIds.contains(userId);
    }
}
