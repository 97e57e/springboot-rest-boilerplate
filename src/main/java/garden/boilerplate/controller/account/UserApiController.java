package garden.boilerplate.controller.account;

import garden.boilerplate.domain.account.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserApiController {

    private final UserRepository userRepository;
}
