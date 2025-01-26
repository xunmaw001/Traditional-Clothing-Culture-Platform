import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yangshileibie from '@/views/modules/yangshileibie/list'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import discusstaocanxinxi from '@/views/modules/discusstaocanxinxi/list'
    import discussdingzhizhuanqu from '@/views/modules/discussdingzhizhuanqu/list'
    import dingzhileibie from '@/views/modules/dingzhileibie/list'
    import discussjingquxinxi from '@/views/modules/discussjingquxinxi/list'
    import dingzhidingdan from '@/views/modules/dingzhidingdan/list'
    import discussfushixinxi from '@/views/modules/discussfushixinxi/list'
    import dingzhizhuanqu from '@/views/modules/dingzhizhuanqu/list'
    import taocanxinxi from '@/views/modules/taocanxinxi/list'
    import systemintro from '@/views/modules/systemintro/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import jingquxinxi from '@/views/modules/jingquxinxi/list'
    import orders from '@/views/modules/orders/list'
    import fushixinxi from '@/views/modules/fushixinxi/list'
    import taocanleibie from '@/views/modules/taocanleibie/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yangshileibie',
        name: '样式类别',
        component: yangshileibie
      }
      ,{
	path: '/news',
        name: '公告资讯',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/discusstaocanxinxi',
        name: '套餐信息评论',
        component: discusstaocanxinxi
      }
      ,{
	path: '/discussdingzhizhuanqu',
        name: '定制专区评论',
        component: discussdingzhizhuanqu
      }
      ,{
	path: '/dingzhileibie',
        name: '定制类别',
        component: dingzhileibie
      }
      ,{
	path: '/discussjingquxinxi',
        name: '景区信息评论',
        component: discussjingquxinxi
      }
      ,{
	path: '/dingzhidingdan',
        name: '定制订单',
        component: dingzhidingdan
      }
      ,{
	path: '/discussfushixinxi',
        name: '服饰信息评论',
        component: discussfushixinxi
      }
      ,{
	path: '/dingzhizhuanqu',
        name: '定制专区',
        component: dingzhizhuanqu
      }
      ,{
	path: '/taocanxinxi',
        name: '套餐信息',
        component: taocanxinxi
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
      ,{
	path: '/jingquxinxi',
        name: '景区信息',
        component: jingquxinxi
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/fushixinxi',
        name: '服饰信息',
        component: fushixinxi
      }
      ,{
	path: '/taocanleibie',
        name: '套餐类别',
        component: taocanleibie
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
