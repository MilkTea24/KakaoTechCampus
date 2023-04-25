package com.spring.example.controller;

import com.spring.example.model.NowTimeModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;

@Controller
public class NowTimeController {
    @RequestMapping("/now-time")
    public ModelAndView hello(@RequestParam("name") String name/*어노테이션을 이용해서 파라미터를 가져옴*/) {
        //Model 생성
        NowTimeModel model = new NowTimeModel(name);

        //View 생성
        View view = new JstlView("/WEB-INF/templates/NowTime.jsp"); //WEB-INF 폴더에 jsp 파일이 위치하면 보안적으로 더 안전하다.
        //ModelAndView 생성 및 초기화
        ModelAndView mav = new ModelAndView();
        mav.addObject("nowTime", model);
        mav.setView(view);

        return mav;
        //hello라는 url을 처리해 줄 수 있는 코드들이다.
    }
}
