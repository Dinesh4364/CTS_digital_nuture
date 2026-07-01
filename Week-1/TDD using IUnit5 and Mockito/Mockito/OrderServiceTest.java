import org.junit.Test;

import static org.mockito.Mockito.*;

public class OrderServiceTest {
    @Test
    public void testEmailAfterOrderPlacement() {
        //Arrange
        EmailService mockEmailService = mock(EmailService.class);

        OrderService orderService = new OrderService(mockEmailService);

        //Act
        orderService.placeOrder("user123@gmail.com");

        //Assert
        verify(mockEmailService,times(1)).sendEmail("user123@gmail.com","Order placed Successfully");
    }
}
