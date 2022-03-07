package spring.uz.model.response;

public abstract class BaseResponse {
    public static ApiResponse SUCCESS = new ApiResponse("success", 0);

    public static ApiResponse SUCCESS_WITH_DATA = new ApiResponse("success", 0);
    // TODO Begzod aka must be check response
    public static ApiResponse ERROR_UNKNOWN = new ApiResponse("unknown", -100);

    public static ApiResponse ERROR_USER_NOT_FOUND = new ApiResponse("user not found", -101);
    public static ApiResponse ERROR_USER_ALREADY_EXIST = new ApiResponse("user not found", -103);

    public static ApiResponse ERROR_COURSE_NOT_FOUND = new ApiResponse("course not found", -102);

}
