package com.gk.springboot.controller;


import com.gk.springboot.entity.Teacher;
import com.gk.springboot.service.ITeacherService;
import com.gk.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-17
 */
@RestController
@RequestMapping("/teacher")
@CrossOrigin
public class TeacherController {

    @Resource
    ITeacherService service;


    /**
     * 获取teacher表中所有数据
     *
     * @return list集合
     */


    @GetMapping("/getTeachers")
    public R getTeachers() {

//        List<Teacher> list = service.findAll();
        return R.ok().data("teachers", service.findAll());
    }

    @GetMapping("/delTeacherById")
    public R delTeacherById(Integer id) {
        System.out.println(id);
        boolean i = service.removeById(id);
        if (i) {
            System.out.println("成功运行了");
            return R.ok();
        } else {
            return R.error();
        }
    }

    @PostMapping("/addTeacher")
    public R addTeacher(@RequestBody Teacher teacher) {

        boolean result = service.save(teacher);//数据库新增函数
        if (result) {
            return R.ok();
        } else {
            return R.error();
        }
    }
//   根据id去查询教师信息
    @GetMapping("/getTeacherById/{id}")
    public R getTeacherById(@PathVariable Integer id) {
        Teacher teacher = service.getById(id);

        return  R.ok().data("items",teacher);
    }



    //       修改教师的接口
    @PostMapping("/updateTeacher")
    public R updateTeacher(@RequestBody Teacher teacher) {
        boolean result = service.updateById(teacher);//数据库的修改函数
        if (result){
            return R.ok();
    }else {
            return R.error();
        }
}








}
