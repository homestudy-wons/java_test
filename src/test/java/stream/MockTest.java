package stream;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.*;

public class MockTest {

    @Test
    @DisplayName("전체 목록 출력하기 이름만..")
    public void testMockData() throws IOException {
        List<Car> cars = MockData.getCars();

        MatcherAssert.assertThat(cars.size(), greaterThan(0));
    }

    @Test
    @DisplayName("파란색 색상을 구해서 모델을 출력하세요.")
    public void testGetModel() throws IOException{

        List<Car> cars = MockData.getCars();
        List<String> blueCars = cars.stream()
                .filter(car -> car.getColor().equals("Blue"))
                .map(car->car.getModel())
                .collect(Collectors.toList());

        blueCars.forEach(car -> {
            System.out.println(car);
        });

        MatcherAssert.assertThat(blueCars, hasItem("MDX"));
    }

    @Test
    public void 가격이10만원이상만_구하시오(){

    }

    @Test
    public void 매이커가_토요타이고_출시년도가_2000년_이상인_자동차를_구하시오(){

    }

    @Test
    public void 매이커가_현대이고_금액이10000_이상인_자동차를_구하시오(){

    }


}
