import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class PostmanEchoTest {
    @Test
    void shouldPostSomeData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some value"))
        ;
    }

    @Test
    void shouldPostAnotherData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("another data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("another value"))
        ;
    }
}