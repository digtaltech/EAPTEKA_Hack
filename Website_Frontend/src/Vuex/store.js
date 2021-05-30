import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

let store = new Vuex.Store({
  state:{
    pharma: [
      {
        image: "https://cdn.eapteka.ru/upload/offer_photo/506/595/resized/230_230_1_4e2ef13a598501cc12ce986daa699d62.jpeg?_cvc=1622209430",
        name: 'ВитаФерр (VitaFerr) капсулы, 30 шт',
        price:'419',
        article:'T1',
      },
      {
        image: "https://cdn.eapteka.ru/upload/offer_photo/326/704/resized/230_230_1_9f65988def262d75e21c8c0c8adfcff7.jpeg?_cvc=1622209430",
        name: 'Нурофен Экспресс капсулы 200 мг, 24 шт',
        price:'335',
        article:'T2',
      },
      {
        image: "https://cdn.eapteka.ru/upload/offer_photo/999/55/resized/230_230_1_6d483b0739b1eafa7dc9961622946611.jpeg?_cvc=1622209430",
        name: 'Мелаксен, таблетки 3 мг, 24 шт.',
        price:'579',
        article:'T3',
      },
      {
        image: "https://cdn.eapteka.ru/upload/offer_photo/110/665/resized/230_230_1_847d997d752e07bd210c5498ec7900b6.jpeg?_cvc=1622209430",
        name: 'Спазмалгон, таблетки 20 шт.',
        price:'159',
        article:'T4',
      },
      {
        image: "https://cdn.eapteka.ru/upload/offer_photo/288/221/resized/230_230_1.jpeg?_cvc=1622209430",
        name: 'Фенистил Гель от зуда и раздражения кожи, 0,1%, 100 г',
        price:'709',
        article:'T5',
      },
    ],
    cart: [],
  },
  mutations:{
    SET_CART: (state, pharm) => {
      if(state.cart.length){
        let isPharmExists = false;
        state.cart.map(function(item) {
          if(item.article === pharm.article){
            isPharmExists = true;
            item.quantity++
          }
        })
        if (!isPharmExists){
          state.cart.push(pharm)
        }
      } else {
        state.cart.push(pharm)
      }
    },
    REMOVE_FROM_CART: (state, index) => {
      state.cart.splice(index, 1)
    }
  },
  actions:{
    ADD_TO_CART({commit}, pharm) {
      commit('SET_CART', pharm);
    },
    DELETE_FROM_CART({commit}, index) {
      commit('REMOVE_FROM_CART', index)
    }
  },
  getters:{
    PHARMA(state){
      return state.pharma
    },
    CART(state){
      return state.cart;
    }
  },

});

export default store;
