package garden.boilerplate.service.account;

import garden.boilerplate.domain.account.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@RequiredArgsConstructor
@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userID){
        return userRepository.findById(Long.valueOf(userID)).orElseThrow(EntityNotFoundException::new);
    }
}
