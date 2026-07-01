import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {
    @Test
    public void testFindUser(){
        //Arrange
        ExternalUserAPI mockAPI = mock(ExternalUserAPI.class);

        //stub
        when(mockAPI.getUserName(1)).thenReturn("Dinesh");

        //inject mock into service
        UserService userService = new UserService(mockAPI);

        //Act
        String res = userService.findUser(1);

        //Assert
        assertEquals("Dinesh",res);
    }
}
