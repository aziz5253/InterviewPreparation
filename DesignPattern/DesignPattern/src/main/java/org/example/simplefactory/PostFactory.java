package org.example.simplefactory;

public class PostFactory {
    public static Post createPost(String type){
        switch(type){
            case "blog" : return new BlogPost();
            case "news":return new NewPost();
            case "product": return new ProductPost();
            default:
                throw new IllegalArgumentException("Product type is unknown");
        }
    }
}
