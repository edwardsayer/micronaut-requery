package hello.world;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import hello.world.model.Page;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.requery.Persistable;
import io.requery.sql.EntityDataStore;

@Controller("/requery")
public class RequeryController {
	
    @Inject
    private EntityDataStore<Persistable> dao;
 
	@PostConstruct
	public void init() {
		System.out.println("RequeryController Bean loaded!");
	}
 
 
    @Get("/list")
    public List<Page> list() {
    	List<Page> posts= dao.select(Page.class).get().toList();
    	for(Page post: posts)
    		System.out.println(post.getSdate());
        return posts;
    }
    
    @Post(value = "/save", consumes = MediaType.APPLICATION_JSON)
    public Page save(@Body Page post) {
    	return post.getPostid() == null ? dao.insert(post) : dao.update(post);
    }
}