<template>
  <div class="cardPharm">
    <div class="row">
      <div class="col-3">
        <img :src="pharm_data.image" alt="" style="height:230px ;width: 200px">
      </div>
      <div class="col-6">
        <h5>{{pharm_data.name}}</h5>
        <p>Aрт.{{pharm_data.article}}</p>
        <div><strong>Производитель:</strong> Тева ООО, Россия</div>
        <div><strong>Действующее вещество:</strong> Розувастатин</div>
        <div><strong>Срок годности:</strong> Длинный срок</div>
        <p style="margin-top: 2rem">В наличии</p>
      </div>
      <div class="col-3" style="text-align: center">
        <h6>Цена <span style="font-size: 25px">{{pharm_data.price}}</span> руб.</h6>
        <button style="background-color: #8068F0; color: #ffffff; border-radius: 30px; height:40px; width:170px; margin-top: 1rem" @click="addToCart" type="button" class="btn">Купить</button>
        <div style="text-align: center">
          <button class="btn btn-link" style="text-decoration: none; font-size: 14px" @click="addToCart">Добавить в подписку</button>
        </div>
      </div>
      <hr style="margin-top: 1rem">
    </div>
  </div>
</template>
<script>
  export default {
    name: "cardPharm",
    props:{
      pharm_data: {
        type: Object,
        default() {
          return{}
        }
      }
    },
    data() {
      return{}
    },
    computed:{},
    methods:{
      addToCart() {
        this.$emit('addToCart', this.pharm_data)
      }
    }
  }
</script>
<style>

</style>
