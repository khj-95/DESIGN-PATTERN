package personel.prac.designpattern.simplefactory;

public class Client {

    public static void main(String[] args) {
        Post post = PostFactory.createPost("blog");
        System.out.println(post);

        post = PostFactory.createPost("news");
        System.out.println(post);

        post = PostFactory.createPost("product");
        System.out.println(post);

        try {

            post = PostFactory.createPost("unknown");

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }
    }

}
