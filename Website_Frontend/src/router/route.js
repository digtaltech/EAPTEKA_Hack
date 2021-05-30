import VueRouter from 'vue-router'

import basket from '../components/basket.vue'
import pharm from '../components/pharm.vue'
import main from '../components/main.vue'
import sub from '../components/sub.vue'

export default new VueRouter({
  mode: 'history',
  routes: [
    {
      path: '/sub',
      name: 'sub',
      component: sub
    },
    {
      path: '/basket',
      name: 'basket',
      component: basket
    },
    {
      path: '/pharm',
      name: 'pharm',
      component: pharm
    },
    {
      path: '/',
      name: 'main',
      component: main
    }
  ]
})
