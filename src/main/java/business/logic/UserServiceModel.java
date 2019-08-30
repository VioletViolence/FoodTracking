package business.logic;


import WebSide.UserEnum;

import java.util.ArrayList;
import java.util.List;

public class UserServiceModel {

        public List getAvailableUsers(UserEnum type){

            List types = new ArrayList();

            if(type.equals(UserEnum.Admin)){
                types.add("Adrianna Vineyard");
                types.add(("J. P. Chenet"));

            }else if(type.equals(UserEnum.Consumer)){
                types.add("Glenfiddich");
                types.add("Johnnie Walker");

            }else if(type.equals(UserEnum.Ghost)){
                types.add("Corona");

            }else {
                types.add("No Brand Available");
            }
            return types;
        }
}
