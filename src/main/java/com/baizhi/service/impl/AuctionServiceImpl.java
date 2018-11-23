package com.baizhi.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baizhi.dao.AuctionDao;
import com.baizhi.entity.Auction;
import com.baizhi.service.AuctionService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AuctionServiceImpl implements AuctionService {
    @Autowired
    private AuctionDao auctionDao;

    @Override
    public void update(Auction auction) {
        // TODO �Զ����ɵķ������
        auctionDao.update(auction);
    }

    @Override
    public void delete(int id) {
        // TODO �Զ����ɵķ������
        auctionDao.delete(id);
    }

    @Override
    public Auction selectOne(int id) {
        // TODO �Զ����ɵķ������
        return auctionDao.selectOne(id);
    }

    @Override
    public void add(Auction auction) {
        // TODO �Զ����ɵķ������
        auctionDao.add(auction);
    }

    @Override
    public void updatepic(int auction_id, double auction_upset) {
        // TODO �Զ����ɵķ������
        auctionDao.updatepic(auction_id, auction_upset);
    }

    @Override
    public List<Auction> selectAll(String auction_name, String auction_desc, Date auction_start_time,
                                   Date auction_end_time, Double auction_start_price) {
        // TODO �Զ����ɵķ������
        return auctionDao.selectAll(auction_name, auction_desc, auction_start_time, auction_end_time, auction_start_price);
    }

}
