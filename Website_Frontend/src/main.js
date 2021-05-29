import Vue from 'vue'
import App from './App.vue'
import store from '/src/Vuex/store.js'
import VueRouter from 'vue-router'
import router from './router/route'

Vue.use(VueRouter)

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  router,
  store
}).$mount('#app')
