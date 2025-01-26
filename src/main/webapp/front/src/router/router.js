import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import AddrList from '../pages/shop-address/list'
import AddrAdd from '../pages/shop-address/addOrUpdate'
import Order from '../pages/shop-order/list'
import OrderConfirm from '../pages/shop-order/confirm'
import Cart from '../pages/shop-cart/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import taocanleibieList from '../pages/taocanleibie/list'
import taocanleibieDetail from '../pages/taocanleibie/detail'
import taocanleibieAdd from '../pages/taocanleibie/add'
import yangshileibieList from '../pages/yangshileibie/list'
import yangshileibieDetail from '../pages/yangshileibie/detail'
import yangshileibieAdd from '../pages/yangshileibie/add'
import dingzhileibieList from '../pages/dingzhileibie/list'
import dingzhileibieDetail from '../pages/dingzhileibie/detail'
import dingzhileibieAdd from '../pages/dingzhileibie/add'
import taocanxinxiList from '../pages/taocanxinxi/list'
import taocanxinxiDetail from '../pages/taocanxinxi/detail'
import taocanxinxiAdd from '../pages/taocanxinxi/add'
import fushixinxiList from '../pages/fushixinxi/list'
import fushixinxiDetail from '../pages/fushixinxi/detail'
import fushixinxiAdd from '../pages/fushixinxi/add'
import dingzhizhuanquList from '../pages/dingzhizhuanqu/list'
import dingzhizhuanquDetail from '../pages/dingzhizhuanqu/detail'
import dingzhizhuanquAdd from '../pages/dingzhizhuanqu/add'
import dingzhidingdanList from '../pages/dingzhidingdan/list'
import dingzhidingdanDetail from '../pages/dingzhidingdan/detail'
import dingzhidingdanAdd from '../pages/dingzhidingdan/add'
import jingquxinxiList from '../pages/jingquxinxi/list'
import jingquxinxiDetail from '../pages/jingquxinxi/detail'
import jingquxinxiAdd from '../pages/jingquxinxi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'storeup',
					component: Storeup
				},
                {
                    path: 'shop-address/list',
                    component: AddrList
                },
                {
                    path: 'shop-address/addOrUpdate',
                    component: AddrAdd
                },
				{
					path: 'shop-order/order',
					component: Order
				},
				{
					path: 'cart',
					component: Cart
				},
				{
					path: 'shop-order/orderConfirm',
					component: OrderConfirm
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'taocanleibie',
					component: taocanleibieList
				},
				{
					path: 'taocanleibieDetail',
					component: taocanleibieDetail
				},
				{
					path: 'taocanleibieAdd',
					component: taocanleibieAdd
				},
				{
					path: 'yangshileibie',
					component: yangshileibieList
				},
				{
					path: 'yangshileibieDetail',
					component: yangshileibieDetail
				},
				{
					path: 'yangshileibieAdd',
					component: yangshileibieAdd
				},
				{
					path: 'dingzhileibie',
					component: dingzhileibieList
				},
				{
					path: 'dingzhileibieDetail',
					component: dingzhileibieDetail
				},
				{
					path: 'dingzhileibieAdd',
					component: dingzhileibieAdd
				},
				{
					path: 'taocanxinxi',
					component: taocanxinxiList
				},
				{
					path: 'taocanxinxiDetail',
					component: taocanxinxiDetail
				},
				{
					path: 'taocanxinxiAdd',
					component: taocanxinxiAdd
				},
				{
					path: 'fushixinxi',
					component: fushixinxiList
				},
				{
					path: 'fushixinxiDetail',
					component: fushixinxiDetail
				},
				{
					path: 'fushixinxiAdd',
					component: fushixinxiAdd
				},
				{
					path: 'dingzhizhuanqu',
					component: dingzhizhuanquList
				},
				{
					path: 'dingzhizhuanquDetail',
					component: dingzhizhuanquDetail
				},
				{
					path: 'dingzhizhuanquAdd',
					component: dingzhizhuanquAdd
				},
				{
					path: 'dingzhidingdan',
					component: dingzhidingdanList
				},
				{
					path: 'dingzhidingdanDetail',
					component: dingzhidingdanDetail
				},
				{
					path: 'dingzhidingdanAdd',
					component: dingzhidingdanAdd
				},
				{
					path: 'jingquxinxi',
					component: jingquxinxiList
				},
				{
					path: 'jingquxinxiDetail',
					component: jingquxinxiDetail
				},
				{
					path: 'jingquxinxiAdd',
					component: jingquxinxiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
