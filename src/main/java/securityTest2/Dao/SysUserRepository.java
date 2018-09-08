package securityTest2.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import securityTest2.Entity.SysUser;

public interface SysUserRepository extends JpaRepository<SysUser, Long>{

	SysUser findByUsername(String username);
}
