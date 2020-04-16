var navs = [{
	"title": "用户资源管理",
	"icon": "fa-cubes",
	"spread": true,
	"children": [{
		"title": "资源",
		"icon": "&#xe641;",
		"href": "http://127.0.0.1:8080/system/sysResources/goSysResources.do"
	}, {
		"title": "权限",
		"icon": "fa-expeditedssl",
		"href": "http://192.168.1.129:8080/system/authority/goAuthortiyInfo.do"
	},  {
		"title": "角色",
		"icon": "&#xe60c;",
		"href": "http://192.168.1.129:8080/system/role/goSysRolePage.do"
	}, {
		"title": "用户",
		"icon": "fa-user-o",
		"href": "http://192.168.1.129:8080/system/user/goSysUserInfoPage.do"
	}, {
        "title": "首页banner",
        "icon": "fa-user-o",
        "href": "http://192.168.1.129:8080/system/mallBanner/goMallbannerManager.do"
	}, {
        "title": "优惠券平台",
        "icon": "fa-user-o",
        "href": "http://127.0.0.1:8080/system/sysCoupon/goCoupon.do"
	}, {
        "title": "优惠券管理",
        "icon": "fa-user-o",
        "href": "http://127.0.0.1:8080/system/sysCoupon/goCouponManage.do"
    }, {
        "title": "热门商品",
        "icon": "fa-user-o",
        "href": "http://192.168.1.129:8080/system/mallBanner/goHotMallbrandManager.do"
	}, {
        "title": "非热门商品",
        "icon": "fa-user-o",
        "href": "http://192.168.1.129:8080/system/mallBanner/goNotHotMallbrandManager.do"
	}, {
        "title": "商家",
        "icon": "fa-user-o",
        "href": "http://192.168.1.129:8080/system/seller/goMallSellerPage.do"
	}, {
        "title": "商家标签",
        "icon": "fa-user-o",
        "href": "http://192.168.1.129:8080/system/sellerTag/goGetSellerTagList.do"
    }, {
        "title": "商品品类",
        "icon": "fa-user-o",
        "href": "http://192.168.1.129:8080/system/sysClassify/goFindClassifyList.do"
    }]
}, {
	"title": "数据字典管理",
	"icon": "fa-cogs",
	"spread": false,
	"children": [{
		"title": "数据字典",
		"icon": "fa-table",
		"href": "sjzd.html"
	}, {
		"title": "字典类型",
		"icon": "fa-navicon",
		"href": "zidian.html"
	}]
},{
    "title": "马兴亮测试用例",
    "icon": "fa-bolt",
    "href": "#",
    "spread": false,
    "children": [{
        "title": "品牌管理",
        "icon": "fa-flag-o",
        "href": "http://192.168.1.129:8080/system/sysBrand/goGetBrandList.do",

    },{
        "title": "商品管理",
        "icon": "fa-flag-o",
        "href": "http://192.168.1.129:8080/seller/commodity/goGetCommodityList.do",

    }]
}];