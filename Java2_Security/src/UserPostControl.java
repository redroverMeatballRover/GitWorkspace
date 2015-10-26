import javax.servlet.http.HttpServletRequest;


public class UserPostControl {

	public UserPostControl {
		
	}
	
	public UserPostController(UserService userService)
	{
		this.userService = userService;
	}
	
	public ModelAndView commitRegisterUserWorkflow(HttpServletRequest request)
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		
		
		try {
			if(!password.equals(confirmPassword)) 
			{
				return new ModelAndView(model, "/WEB-INF/register.jsp");
			}
		}
		catch {
			
		}
		try {
		User user = userService.createdUser(username, password);
		return ModelAndView(mode)
		}
		catch(UsernameAlreadyExistsException e) {
			model.setErrorMEssage("Username already exists.")
		}
		
		
	}

}
