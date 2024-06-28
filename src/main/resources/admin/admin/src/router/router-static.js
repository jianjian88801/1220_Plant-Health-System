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
    import news from '@/views/modules/news/list'
    import zhenguizhiwujianchadengji from '@/views/modules/zhenguizhiwujianchadengji/list'
    import zhiwujibinganli from '@/views/modules/zhiwujibinganli/list'
    import forum from '@/views/modules/forum/list'
    import zhiwujiuzhicailiao from '@/views/modules/zhiwujiuzhicailiao/list'
    import jishurenyuan from '@/views/modules/jishurenyuan/list'
    import putongzhiwujianchadengji from '@/views/modules/putongzhiwujianchadengji/list'
    import putongyuangong from '@/views/modules/putongyuangong/list'
    import chat from '@/views/modules/chat/list'
    import zhiwujishufangan from '@/views/modules/zhiwujishufangan/list'
    import zhiwuzhonglei from '@/views/modules/zhiwuzhonglei/list'
    import zhiwujiuzhiyongliaodengji from '@/views/modules/zhiwujiuzhiyongliaodengji/list'
    import config from '@/views/modules/config/list'
    import cailiaoleimu from '@/views/modules/cailiaoleimu/list'


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
	path: '/news',
        name: '植物健康资讯',
        component: news
      }
      ,{
	path: '/zhenguizhiwujianchadengji',
        name: '珍贵植物检查登记',
        component: zhenguizhiwujianchadengji
      }
      ,{
	path: '/zhiwujibinganli',
        name: '植物疾病案例',
        component: zhiwujibinganli
      }
      ,{
	path: '/forum',
        name: '植物健康论坛',
        component: forum
      }
      ,{
	path: '/zhiwujiuzhicailiao',
        name: '植物救治材料',
        component: zhiwujiuzhicailiao
      }
      ,{
	path: '/jishurenyuan',
        name: '技术人员',
        component: jishurenyuan
      }
      ,{
	path: '/putongzhiwujianchadengji',
        name: '普通植物检查登记',
        component: putongzhiwujianchadengji
      }
      ,{
	path: '/putongyuangong',
        name: '普通员工',
        component: putongyuangong
      }
      ,{
	path: '/chat',
        name: '咨询专家',
        component: chat
      }
      ,{
	path: '/zhiwujishufangan',
        name: '植物技术方案',
        component: zhiwujishufangan
      }
      ,{
	path: '/zhiwuzhonglei',
        name: '植物种类',
        component: zhiwuzhonglei
      }
      ,{
	path: '/zhiwujiuzhiyongliaodengji',
        name: '植物救治用料登记',
        component: zhiwujiuzhiyongliaodengji
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/cailiaoleimu',
        name: '材料类目',
        component: cailiaoleimu
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

export default router;
