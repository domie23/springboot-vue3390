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

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import news from '@/views/modules/news/list'
    import quhuoxinxi from '@/views/modules/quhuoxinxi/list'
    import quhuoyuyue from '@/views/modules/quhuoyuyue/list'
    import yonghu from '@/views/modules/yonghu/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionaryQuhuo from '@/views/modules/dictionaryQuhuo/list'
    import dictionaryQuhuoxinxi from '@/views/modules/dictionaryQuhuoxinxi/list'
    import dictionaryQuhuoxinxiStatus from '@/views/modules/dictionaryQuhuoxinxiStatus/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryStatus from '@/views/modules/dictionaryStatus/list'
    import dictionaryWupin from '@/views/modules/dictionaryWupin/list'
    import quhuoyuyueAdd from '@/views/modules/quhuoyuyue/add-or-update'
	





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
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionaryQuhuo',
        name: '取货方式',
        component: dictionaryQuhuo
    }
    ,{
        path: '/dictionaryQuhuoxinxi',
        name: '货物类型',
        component: dictionaryQuhuoxinxi
    }
    ,{
        path: '/dictionaryQuhuoxinxiStatus',
        name: '时间类型',
        component: dictionaryQuhuoxinxiStatus
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryStatus',
        name: '预约状态',
        component: dictionaryStatus
    }
    ,{
        path: '/dictionaryWupin',
        name: '取货方式',
        component: dictionaryWupin
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/quhuoxinxi',
        name: '货物信息',
        component: quhuoxinxi
      }
    ,{
        path: '/quhuoyuyueAdd',
        name: '预约取货',
        component: quhuoyuyueAdd
      }	  
	  
    ,{
        path: '/quhuoyuyue',
        name: '取货预约',
        component: quhuoyuyue
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
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
