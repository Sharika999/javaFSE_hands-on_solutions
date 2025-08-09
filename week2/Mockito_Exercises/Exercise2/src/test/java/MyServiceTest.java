import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

// External API to be mocked
interface ExternalApi {
    String getData();
}

// The actual service using the API
class MyService {
    ExternalApi api;

    MyService(ExternalApi api) {
        this.api = api;
    }

    String fetchData() {
        return api.getData();
    }
}

// Test class
public class MyServiceTest {
    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.fetchData();  // Act

        verify(mockApi).getData(); // Assert interaction happened
    }
}
