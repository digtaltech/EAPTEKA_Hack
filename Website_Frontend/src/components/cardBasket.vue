<template>
  <div class="cardBasket">


      <div class="row">
        <cartItemBasket
        v-for="(item, index) in cart_data"
        :key="item.article"
        :cart_item_data="item"
        @deleteFromCart="deleteFromCart(index)"
        ></cartItemBasket>
      </div>

  </div>
</template>
<script>
import cartItemBasket from './cartItemBasket'
import {mapActions} from 'vuex'

export default{
  name: "cardBasket",
  components:{
    cartItemBasket
  },
  props: {
    cart_data: {
      type: Array,
      default() {
        return{}
      }
    }
  },
  data() {
    return{}
  },
  computed: {},
  methods: {
    ...mapActions([
      'DELETE_FROM_CART'
    ]),
    deleteFromCart(index){
       this.DELETE_FROM_CART(index)
    }
  },
}
</script>
<style>

</style>
