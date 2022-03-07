package spring.uz.service;

import lombok.RequiredArgsConstructor;
import model.receive.course.Helper;
import model.response.ApiResponse;
import model.response.BaseResponse;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import spring.uz.entity.course.CourseEntity;
import spring.uz.repository.course.CourseRepository;
import spring.uz.service.base.BaseService;
import spring.uz.util.FileUtils;

import java.io.IOException;

@RequiredArgsConstructor
@Service
public class CourseService implements BaseService<Helper> {

    private final ModelMapper modelMapper;
    private final CourseRepository courseRepository;

    @Override
    public ApiResponse add(Helper courseReceiveDTO) throws IOException {
        String url = FileUtils.addImage(
                courseReceiveDTO.getContentType(),
                courseReceiveDTO.getContent()
        );
        CourseEntity courseEntity = modelMapper.map(courseReceiveDTO, CourseEntity.class);
        courseEntity.setImageUrl(url);
        courseRepository.save(courseEntity);
        return BaseResponse.SUCCESS;
    }

    @Override
    public ApiResponse getById(Long id) {
        return null;
    }

    @Override
    public ApiResponse getList() {
        BaseResponse.SUCCESS_WITH_DATA
                .setData(courseRepository.findAll());
        return BaseResponse.SUCCESS_WITH_DATA;
    }

    @Override
    public ApiResponse updateById(Long id, Helper courseReceiveDTO) {
        return null;
    }

    @Override
    public ApiResponse deleteById(Long id) {
        return null;
    }
}
