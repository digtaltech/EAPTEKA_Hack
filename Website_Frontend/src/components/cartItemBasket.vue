<template>
  <div class="cartItemBasket">
    <hr>
    <div class="row">
      <div class="col-2">
        <img :src="cart_item_data.image" alt="" style="height:150px ;width: 100px">
      </div>
      <div class="col-4">
      <h5>{{cart_item_data.name}}</h5>
      <div>
        <p>В наличии</p>
      </div>
      <div style="margin-top: -1rem">
        <p>Срок годности: Длинный срок</p>
      </div>
      <div>
        <a style="color: #8068F0; text-decoration: none" @click="deleteFromCart">Удалить</a>
      </div>
      </div>
      <div class="col-3" style="text-align: center">
        <h6>{{cart_item_data.price}} руб.</h6>
      </div>
      <div class="col-3" style="text-align: center">
        <div class="input-group">
          <div class="input-group-append">
            <button style="border-radius: 20px 0px 0px 20px; height:41px; background-color:#EEF3FF; color: #333F48; border-color: #EEF3FF;" class="btn btn-outline-secondary" type="button" id="button-addon2">-</button>
          </div>
          <input style="text-align:center; border-radius: 0px 0px 0px 0px; border-color: #EEF3FF; color: #ffffff; height: 41px;" size="3" type="text" class="form-control" placeholder="1" aria-label="Recipient's username" aria-describedby="button-addon2">
          <div class="input-group-append">
            <button style="border-radius: 0px 20px 20px 0px; height:41px; background-color:#EEF3FF; color: #333F48; border-color: #EEF3FF;" class="btn btn-outline-secondary" type="button" id="button-addon2">+</button>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name:"cartItemBasket",
  props:{
    cart_item_data:{
        type: Object,
        default() {
          return {}
        }
    }
  },
  data() {
    return{

    }
  },
  methods:{
    deleteFromCart(){
      this.$emit('deleteFromCart')
    }
  },
  mounted() {
    this.$set(this.cart_item_data, 'quantity', 1)
  },
}
</script>
<style>

</style>
