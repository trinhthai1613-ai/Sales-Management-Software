package com.example.project.voucher.service;

import com.example.project.voucher.dto.request.VoucherCreateRequest;
import com.example.project.voucher.dto.request.VoucherUpdateRequest;
import com.example.project.voucher.dto.response.VoucherResponse;
import com.example.project.voucher.entity.Voucher;

import java.util.List;

public interface VoucherService {
    List<VoucherResponse> search(String keyword, String status);
    VoucherResponse getById(Long id);
    Voucher getEntityById(Long id); // dùng cho confirm-delete
    void create(VoucherCreateRequest request);
    void update(Long id, VoucherUpdateRequest request);
    void delete(Long id);
}