package springstudy.memorest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springstudy.memorest.domain.Memo;
import springstudy.memorest.domain.MemoForm;
import springstudy.memorest.domain.Response;
import springstudy.memorest.service.MemoService;

import java.util.List;

@RestController
@RequestMapping("/memo")
public class MemoController {
    @Autowired
    private MemoService memoService;
    @PostMapping("/create")
    public Response createMemo(@RequestBody MemoForm memoForm) {
        memoService.createMemo(memoForm);
        return new Response(200, "OK");
    }

    @GetMapping("/{id}")
    public Memo getMemoContent(@PathVariable Long id) {
        return memoService.getMemoContent(id);
    }

    @GetMapping("/list")
    public List<Memo> getMemoList() {
        return memoService.getMemoList();
    }

    @PostMapping(value = "/update/{id}")
    public Response updateMemo(@PathVariable Long id, @RequestBody MemoForm memoForm) {
        memoService.updateMemo(id, memoForm);
        return new Response(200, "OK");
    }

    @DeleteMapping(value = "/delete/{id}")
    public Response deleteMemo(@PathVariable Long id) {
        memoService.deleteMemo(id);
        return new Response(200, "OK");
    }
}
