<template>
  <div style="margin-left: 5rem; margin-right: 5rem; margin-top: 2rem">
    <h2>Моя корзина</h2>

      <div v-if="CART.length">
        <div class="row">
          <div class="col-8">


            <cardBasket
            :cart_data="CART"
            ></cardBasket>
          </div>


          <div class="col-4">
            <div class="card" style="margin-top: 1rem; border-radius: 0px; border: 3px solid #EEF3FF;">
              <div class="card-body">
                <h2 style="color:#333F48; padding-bottom: 1rem">Ваш заказ</h2>
                <div style="background-color: #EEF3FF; margin-right:-16px;  margin-left:-16px">
                  <div class="row" style="padding-right: 1rem; padding-left: 1rem; padding-top: 1rem">
                    <div class="col-sm">
                      <p style="display:inline-block;">Скидка</p>
                    </div>
                    <div class="col-sm" style="text-align: right;">
                      <p style="display:inline-block;">0 руб.</p>
                    </div>
                  </div>
                </div>
                <div style="background-color: #EEF3FF; margin-top: 1px; margin-right:-16px;  margin-left:-16px">
                  <div class="row" style="padding-right: 1rem; padding-left: 1rem; padding-top: 1rem">
                    <div class="col-sm">
                      <p style="display:inline-block;">Итого без доставки</p>
                    </div>
                    <div class="col-sm" style="text-align: right">
                      <p style="display:inline-block;">0 руб.</p>
                    </div>
                  </div>
                  <div style="text-align: center; padding-bottom: 1rem; padding-top: 1rem">
                    <button style="background-color: #8068F0; color: #ffffff; border-radius: 30px; height:50px; width:300px" type="button" class="btn">Оформить заказ</button>
                    <router-link :to="{name: 'sub'}"><a style="text-decoration: none; color: #6E84A3; margin-top: 1rem">Добавить подписку</a></router-link>
                  </div>
                </div>
                <h4 style="color:#333F48; padding-top: 1rem">Скидки</h4>
                <div class="input-group mb-3" style="padding-top: 1rem">
                  <input style="border-radius: 10px 0px 0px 10px; border-color: #E2E2E2; color: #ffffff; height: 41px; width: 130px;" type="text" class="form-control" placeholder="Активировать промо-код" aria-label="Recipient's username" aria-describedby="button-addon2">
                  <div class="input-group-append">
                    <button style="border-radius: 0px 10px 10px 0px; height:41px; background-color:#8068F0; color: #ffffff;" class="btn btn-outline-secondary" type="button" id="button-addon2">></button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

  </div>
</template>
<script>
import cardBasket from './cardBasket'
import {mapGetters} from 'vuex'

export default {
  name: "basket",
  components: {
    cardBasket
  },
  computed: {
    ...mapGetters([
      'CART'
    ])
  }
}

</script>
<style>

</style>
