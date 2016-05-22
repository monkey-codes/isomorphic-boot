package codes.monkey.isomorphicboot

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by jzietsman on 4/17/16.
 */
@Controller
class IndexController {

    @RequestMapping("/")
    String render() {
        'index';
    }
}
