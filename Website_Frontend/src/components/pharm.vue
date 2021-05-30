<template>
  <div style="margin-left: 5rem; margin-right: 5rem; margin-top: 2rem">
    <h2>Лекарственные средства</h2>
    <div class="gridOnPharm">
      <div class="">
        <strong>Категории</strong>
        <div style="margin-top: 1rem">Акушерство, гинекология</div>
        <div>Аллергия</div>
        <div>Анестезия, реанимация</div>
        <div>Антибиотики</div>
        <div>Болезни крови</div>
        <div>Боль, температура</div>
        <div>Геморрой</div>
        <div>Глаза</div>
        <div>Глисты, вши, чесотка</div>
        <div>Гомеопатия</div>
        <div>Детское здоровье</div>
        <div>Диабет</div>
        <div>Диагностические средства</div>
        <div>Дыхательная система</div>
        <div>Желудок, кишечник, печень</div>
        <div>Зубы и рот</div>
        <div>Иммунная система</div>
        <div>Кожа</div>
        <div>Мочеполовая система</div>
        <div>Нарушения обмена веществ</div>
        <div>Неврология, психиатрия</div>
        <div>Обеззараживающие средства</div>
        <div>Онкология</div>
        <div>Отравления</div>
        <div>Питательные смеси</div>
        <div>Противовирусные средства</div>
        <div>Противогрибковые средства</div>
        <div>Разное</div>
        <div>Сердечно-сосудистые</div>
        <div>Трихомоноз и малярия</div>
        <div>Ухо, горло, нос</div>
        <div>Эндокринология</div>
      </div>
      <div class="">
        <hr>

        <cardPharm
        v-for="pharm in PHARMA"
        :key="pharm.article"
        :pharm_data="pharm"
        @addToCart="addToCart"
        ></cardPharm>

      </div>
    </div>
  </div>
</template>
<script>
import cardPharm from './cardPharm'
import {mapActions, mapGetters} from 'vuex'

  export default{
    name: "pharm",
    components: {
      cardPharm
    },
    data(){
      return{

      }
    },
    computed:{
      ...mapGetters([
        'PHARMA'
      ]),
    },
    methods: {
      ...mapActions([
        'ADD_TO_CART'
      ]),
      addToCart(data) {
        this.ADD_TO_CART(data)
      },
    },
  }
</script>
<style>
.gridOnPharm{
  display: grid;
  grid-template-columns: 1fr 3fr;
}
</style>
