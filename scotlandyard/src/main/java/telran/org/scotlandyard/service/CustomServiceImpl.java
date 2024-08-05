package telran.org.scotlandyard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telran.org.scotlandyard.entity.Custom;
import telran.org.scotlandyard.repository.CustomReposit;

import java.util.List;
import java.util.Optional;

@Service
public class CustomServiceImpl implements CustomService{

   @Autowired
   public CustomReposit customReposit;


    @Override
    public List<Custom> getAll() {
        return customReposit.findAll();
    }

    @Override
    public Custom getById(Long id) {
        Custom custom = customReposit.findById(id).get();
        return custom;
    }
    //    @Override
//    public Custom findById(Long id) {
//        Custom custom = findById(id);
// .orElseThrow(() -> new CustomNotFoundException("No Custom with id " + id));
//        return custom;
//    }

    @Override
    public Custom create(Custom custom) {
        return null;
    }



//    @Override
//    public Custom findById(Long id) {
//        Custom custom = findById(id);
// .orElseThrow(() -> new CustomNotFoundException("No Custom with id " + id));
//        return custom;
//    }

    @Override
    public void deleteById(long id) {
        Custom custom = getById(id);
        customReposit.deleteById(id);
    }

    @Override
    public Optional<Custom> findByEmail(String email) {
        return Optional.empty();
    }
}
