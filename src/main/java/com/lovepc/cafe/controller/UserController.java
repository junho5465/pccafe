package com.lovepc.cafe.controller;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class userController {
    private final OrderService orderService;

    // 주문 생성
    @PostMapping("/order")
    public Map<String, Object> createOrder(@RequestBody OrderRequestDto dto) {
        OrderResponseDto response = orderService.createOrder(dto);
        return ResponseUtil.success(response);
    }

    // 주문 조회
    @GetMapping("/orders")
    public Map<String, Object> getOrders(@RequestParam Long userId) {
        List<OrderResponseDto> list = orderService.getOrders(userId);
        return ResponseUtil.success(list);
    }

    // 결제 완료 처리 (테스트 PG용)
    @PostMapping("/order/{orderId}/pay")
    public Map<String, Object> payOrder(@PathVariable Long orderId) {
        orderService.payOrder(orderId);
        return ResponseUtil.success("결제 완료");
    }
}
