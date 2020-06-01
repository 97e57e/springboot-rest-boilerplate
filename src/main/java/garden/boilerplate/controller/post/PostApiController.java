package garden.boilerplate.controller.post;

import garden.boilerplate.domain.post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostApiController {

    private final PostRepository postRepository;
}
