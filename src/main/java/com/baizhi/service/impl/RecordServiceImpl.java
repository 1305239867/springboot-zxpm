package com.baizhi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baizhi.dao.RecordDao;
import com.baizhi.entity.Record;
import com.baizhi.service.RecordService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordDao recordDao;

    @Override
    public List<Record> selectRec(int auction_id) {
        // TODO �Զ����ɵķ������
        return recordDao.selectRec(auction_id);
    }

    @Override
    public void addRec(Record record) {
        // TODO �Զ����ɵķ������
        recordDao.addRec(record);
    }

}
