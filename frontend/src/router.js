
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import 화물FreightManager from "./components/listers/화물FreightCards"
import 화물FreightDetail from "./components/listers/화물FreightDetail"

import 배송FreightDeliveryManager from "./components/listers/배송FreightDeliveryCards"
import 배송FreightDeliveryDetail from "./components/listers/배송FreightDeliveryDetail"

import 정산SettlementManager from "./components/listers/정산SettlementCards"
import 정산SettlementDetail from "./components/listers/정산SettlementDetail"

import 알림NotificationManager from "./components/listers/알림NotificationCards"
import 알림NotificationDetail from "./components/listers/알림NotificationDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/화물/freights',
                name: '화물FreightManager',
                component: 화물FreightManager
            },
            {
                path: '/화물/freights/:id',
                name: '화물FreightDetail',
                component: 화물FreightDetail
            },

            {
                path: '/배송/freightDeliveries',
                name: '배송FreightDeliveryManager',
                component: 배송FreightDeliveryManager
            },
            {
                path: '/배송/freightDeliveries/:id',
                name: '배송FreightDeliveryDetail',
                component: 배송FreightDeliveryDetail
            },

            {
                path: '/정산/settlements',
                name: '정산SettlementManager',
                component: 정산SettlementManager
            },
            {
                path: '/정산/settlements/:id',
                name: '정산SettlementDetail',
                component: 정산SettlementDetail
            },

            {
                path: '/알림/notifications',
                name: '알림NotificationManager',
                component: 알림NotificationManager
            },
            {
                path: '/알림/notifications/:id',
                name: '알림NotificationDetail',
                component: 알림NotificationDetail
            },



    ]
})
