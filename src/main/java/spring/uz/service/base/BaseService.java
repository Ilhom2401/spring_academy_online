package spring.uz.service.base;

import model.response.ApiResponse;

import java.io.IOException;

public interface BaseService<T>{

    ApiResponse add(T t) throws IOException;
    ApiResponse getById(Long id);
    ApiResponse getList();
    ApiResponse updateById(Long id, T t);
    ApiResponse deleteById(Long id);

}
