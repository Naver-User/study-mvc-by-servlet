package org.zerock.myapp.security.util;


public interface SharedAttributes {

	// 1. Related All Controller URIs with Security. ( Access Control )
	public static final String LOGIN_URI = "/login";
	public static final String HOME_URI = "/home";
	public static final String MEMBER_URI = "/member";
	public static final String USER_URI = "/user";
	public static final String ADMIN_URI = "/admin";
	public static final String FORBIDDEN_URI = "/forbidden";
	
	public static final String AUTHENTICATE_URI = "/authenticate";
	public static final String AUTHORIZE_URI = "/authorize";
	
	public static final String SIGNIN_URI = "/signIn";
	public static final String SIGNOUT_URI = "/signOut";
	
	public static final String DO_AUTHENTICATE = "_DO_AUTHENTICATE_";
	public static final String AUTHENTICATED = "_IS_AUTHENTICATED_";

	public static final String DO_AUTHORIZE = "_DO_AUTHORIZE_";
	public static final String AUTHORIZED = "_IS_AUTHORIZED_";
	
	public static final String CREDENTIAL = "_CREDENTIAL_";
	
	
	// 2. Related All Attributes with Request Scope.
	public static final String MODEL = "_MODEL_";
	public static final String REQUEST_URI = "_REQUEST_URI_";
	public static final String VIEW_NAME = "_VIEW_NAME_";
	public static final String REQUIRED_ROLE = "_REQUIRED_ROLE_";
	
	
	// 3. Role Names Related with Authorization
	public static final String ROLE_USER = "ROLE_USER";
	public static final String ROLE_ADMIN = "ROLE_ADMIN";
	public static final String ROLE_AUTHENTICATED = "ROLE_AUTHENTICATED";
	public static final String ROLE_ANONYMOUS = "ROLE_ANONYMOUS";
	
	
	// 4. Related with View Resolver.
	public static final String VIEW_RESOLVER_URI = "/viewResolver";
	public static final String VIEW_PREFIX = "/WEB-INF/views/";
	public static final String VIEW_SUFFIX = ".jsp";
	
	public static final String VIEW_URI = "/view";
	public static final String RESOLVED_VIEW_PATH = "_RESOLVED_VIEW_PATH_";
	
		
	

} // end interface