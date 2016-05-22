package codes.monkey.isomorphicboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.view.script.ScriptTemplateConfigurer
import org.springframework.web.servlet.view.script.ScriptTemplateViewResolver

@SpringBootApplication
class IsomorphicBootAppApplication {

	static void main(String[] args) {
		SpringApplication.run IsomorphicBootAppApplication, args
	}

	@Bean
	public ViewResolver reactViewResolver() {
		ScriptTemplateViewResolver viewResolver = new ScriptTemplateViewResolver()
//		viewResolver.setPrefix("/public/isomorphic-boot-ui/")
		viewResolver.setPrefix("/public/")
		viewResolver.setSuffix(".html")
		viewResolver
	}

	@Bean
	public ScriptTemplateConfigurer reactConfigurer() {
		ScriptTemplateConfigurer configurer = new ScriptTemplateConfigurer()
		configurer.setEngineName("nashorn")
		configurer.setResourceLoaderPath()
		configurer.setScripts("static/polyfill.js",
//				"static/lib/js/ejs.min.js",
//				"/META-INF/resources/webjars/react/0.13.1/react.js",
//                "/META-INF/resources/webjars/react/0.13.1/JSXTransformer.js",
				"static/render.js",
//				"static/output/comment.js",
//				"static/output/comment-form.js",
//				"static/output/comment-list.js"
		)
		configurer.setRenderFunction("render")
		configurer.setSharedEngine(false)
		return configurer
	}
}
