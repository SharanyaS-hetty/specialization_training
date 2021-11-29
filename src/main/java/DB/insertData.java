package DB;

import java.util.ArrayList;
import java.util.List;

import com.example.shoppingpp.Helpers.authLogin;
import com.example.shoppingpp.Helpers.response;
import com.example.shoppingpp.Helpers.user;

public class insertData {
   static List<user> userlist = new ArrayList<>();

    //register
    public static response addUser(user u)
    {
        if(userlist.add(u))
        {
            return new response(200,"user added successfully",u);
        }
        return new response(404,"user not found",null);
    }


    public static response userLogin(authLogin credential)
    {
        for(user usr : userlist)
        {
            if(usr.getEmail().equals(credential.getEmail())&&(usr.getPassword().equals(credential.getPassword())))
            {
                return new response(200, "user login successfull", usr);
            }
        }
        return new response(404, "user not found", null);
    }

    public static response userList()
    {
        return new response(200, "Fteched all users successfully", userlist);
    }
    
}
