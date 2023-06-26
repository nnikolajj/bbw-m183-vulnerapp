package ch.bbw.m183.vulnerapp.controller;

import java.util.Base64;

import ch.bbw.m183.vulnerapp.datamodel.UserEntity;
import ch.bbw.m183.vulnerapp.service.LoginService;
import io.micrometer.common.util.internal.logging.InternalLogger;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

	private static final InternalLogger LOGGER = null;
	private final LoginService loginService;

	@GetMapping("/whoami")
	public UserEntity whoami(@AuthenticationPrincipal String username, HttpServletRequest request) {
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf");
		LOGGER.info("{}={}", token.getHeaderName(), token.getToken());
		return loginService.whoami(username);
	}
}
