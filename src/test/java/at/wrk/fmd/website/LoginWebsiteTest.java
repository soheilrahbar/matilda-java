package at.wrk.fmd.website;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LoginWebsiteTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnStatusOkIfStringContainsBenutzername() throws Exception {
        this.mockMvc.perform(get("/login")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Benutzername")));
    }

    @Test
    public void shouldReturnStatusOkIfStringContainsPassword() throws Exception {
        this.mockMvc.perform(get("/login")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Password")));
    }

    @Test
    public void shouldReturnStatusOkIfStringContainsLogIn() throws Exception {
        this.mockMvc.perform(get("/login")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Log In")));
    }
}