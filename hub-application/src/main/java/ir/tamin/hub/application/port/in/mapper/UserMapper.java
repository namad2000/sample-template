//package ir.online.identity.application.port.in.mapper;
//
//import io.qoop.filter.bean.api.DomainMapper;
//
//import ir.online.identity.application.port.in.model.cmd.RegisterUserCmd;
//import ir.online.identity.application.port.in.model.result.UserResult;
//import ir.online.identity.domain.model.User;
//
//@DomainMapper
//public class UserMapper implements InputMapper<RegisterUserCmd, User>, ResultMapper<User, UserResult> {
//
//    @Override
//    public User toDomain(RegisterUserCmd cmd, MappingContext context) {
//        return User.builder()
//                .mobile(cmd.getMobile())
//                .privateCode(cmd.getPrivateCode())
//                .banned(false)
//                .passwordSaved(false)
//                .build();
//    }
//
//    @Override
//    public UserResult toResult(User domain, MappingContext context) {
//        return UserResult.builder()
//                .id(domain.getId())
//                .mobile(domain.getMobile())
//                .banned(domain.getBanned())
//                .passwordSaved(domain.getPasswordSaved())
//                .roles(domain.getRoleNames())
//                .build();
//    }
//}
