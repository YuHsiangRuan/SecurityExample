package securityTest2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import securityTest2.Dao.SysUserRepository;
import securityTest2.Entity.SysUser;

public class CustomUserService implements UserDetailsService {

	@Autowired
	SysUserRepository uR;
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		SysUser user = uR.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("用戶名不存在");
		}
		return user;
	}
}
