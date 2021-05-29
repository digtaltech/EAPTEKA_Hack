import VueRouter from 'vue-router'

import basket from '../components/basket.vue'
import pharm from '../components/pharm.vue'
import main from '../components/main.vue'

export default new VueRouter({
  mode: 'history',
  routes: [
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
