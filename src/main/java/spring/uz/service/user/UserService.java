package spring.uz.service.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import model.receive.user.UserReceiveDTO;
import model.response.ApiResponse;
import model.response.BaseResponse;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import spring.uz.entity.users.UserEntity;
import spring.uz.exception.UserCustomException;
import spring.uz.repository.user.UserRepository;
import spring.uz.service.base.BaseService;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService extends BaseResponse implements BaseService<UserReceiveDTO> {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private String BASE_URL = "http://127.0.0.1:3398/api/user/";


    // TODO compare above code with findByPhoneNumber
    @Override
    public ApiResponse add(UserReceiveDTO userReceiveDTO) {
        checkUser(userReceiveDTO.getPhoneNumber());
        try {
            UserEntity userEntity
                    = modelMapper.map(userReceiveDTO, UserEntity.class);// TODO Begzod  should compare
            String response
                    = restTemplate.getForObject(BASE_URL + userReceiveDTO.getPhoneNumber(), String.class);
            Boolean success = objectMapper.readValue(response, Boolean.class);
            if (success)
                throw new UserCustomException(userReceiveDTO.getPhoneNumber() + " is already exist in olcha uz");
            userRepository.save(userEntity);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return BaseResponse.SUCCESS;
    }

    @Override
    public ApiResponse getById(Long id) {
        BaseResponse.SUCCESS_WITH_DATA.setData(userRepository.findById(id).orElse(null));
        return BaseResponse.SUCCESS_WITH_DATA;
    }

    @Override
    public ApiResponse getList() {
        BaseResponse.SUCCESS_WITH_DATA.setData(userRepository.findAll());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return BaseResponse.SUCCESS_WITH_DATA;
    }

    @Override
    public ApiResponse updateById(Long id, UserReceiveDTO userReceiveDTO) {
        Optional<UserEntity> optionalUserEntity = userRepository.findById(id);

        if (optionalUserEntity.isEmpty())
            throw new UserCustomException("user not found");

        UserEntity userEntity = optionalUserEntity.get();
        UserEntity editUser = modelMapper.map(userReceiveDTO, UserEntity.class);
        editUser.setId(userEntity.getId());
        userRepository.save(editUser);

        return BaseResponse.SUCCESS;
    }

    @Override
    public ApiResponse deleteById(Long id) {
        return null;
    }

    private void checkUser(String phoneNumber) {
        Optional<UserEntity> optionalUserEntity
                = userRepository.findByPhoneNumber(phoneNumber);

        if (optionalUserEntity.isPresent())
            throw new UserCustomException(phoneNumber + " user is already exist");
    }



}
