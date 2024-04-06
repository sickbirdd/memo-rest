package springstudy.memorest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springstudy.memorest.domain.Memo;
import springstudy.memorest.domain.MemoForm;
import springstudy.memorest.repository.MemoRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class MemoService {
    @Autowired
    private MemoRepository memoRepository;

    public void createMemo(MemoForm memoForm) {
        Memo memo = new Memo();
        memo.setAuthor(memoForm.getAuthor());
        memo.setTitle(memoForm.getTitle());
        memo.setContent(memoForm.getContent());
        memo.setCreated(LocalDateTime.now());
        memoRepository.save(memo);
    }

    public Memo getMemoContent(Long id) {
        return memoRepository.findById(id).get();
    }

    public List<Memo> getMemoList() {
        return memoRepository.findAll();
    }

    public void updateMemo(Long id, MemoForm memoForm) {
        Memo memo = memoRepository.findById(id).get();
        memo.setContent(memoForm.getContent());
        memo.setTitle(memoForm.getTitle());
        memo.setAuthor(memoForm.getAuthor());
    }

    public void deleteMemo(Long id) {
        memoRepository.deleteById(id);
    }
}
