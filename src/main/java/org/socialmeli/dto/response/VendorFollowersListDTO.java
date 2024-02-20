package org.socialmeli.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.socialmeli.entity.User;
import org.socialmeli.entity.Vendor;

import java.util.List;


@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VendorFollowersListDTO {
    Integer user_id;
    String user_name;
    List<UserDTO> followers;
}
