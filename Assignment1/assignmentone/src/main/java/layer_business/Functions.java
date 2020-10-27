package layer_business;

import dto.UserDTO;
import layer_data_access.repo.UserRepo;
import model.User;
import layer_data_access.repo.GenericRepo;

public class Functions {
    public UserDTO loginPlayer(String mail, String password) {

        UserDTO user = new UserDTO(UserRepo.findUserByMail(mail));
        //do operations on user
        return user;
    }

}
