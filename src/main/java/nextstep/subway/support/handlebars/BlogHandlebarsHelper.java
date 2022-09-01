package nextstep.subway.support.handlebars;

import com.github.jknack.handlebars.Options;
import nextstep.subway.support.version.BlogVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pl.allegro.tech.boot.autoconfigure.handlebars.HandlebarsHelper;

@HandlebarsHelper
public class BlogHandlebarsHelper {
    private static final Logger logger = LoggerFactory.getLogger(BlogHandlebarsHelper.class);

    @Autowired
    private BlogVersion blogVersion;

    public String staticUrls(String path, Options options) {
        logger.debug("static url : {}", path);
        return String.format("/resources/%s", path);
    }
}