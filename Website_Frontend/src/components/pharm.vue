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

        <div
        v-for="pharm in PHARMA"
        :key="pharm.article"
        >

          <div class="row">
            <div class="col-3">
              <img :src="pharm.image" alt="" style="height:230px ;width: 200px">
            </div>
            <div class="col-6">
              <h5>{{pharm.name}}</h5>
              <p>Aрт.{{pharm.article}}</p>
              <div><strong>Производитель:</strong> Тева ООО, Россия</div>
              <div><strong>Действующее вещество:</strong> Розувастатин</div>
              <div><strong>Срок годности:</strong> Длинный срок</div>
            </div>
            <div class="col-3">
              <h6>Цена <span style="font-size: 25px">{{pharm.price}}</span> руб.</h6>
              <button style="background-color: #8068F0; color: #ffffff; border-radius: 30px; height:40px; width:170px" @click="buttonToCart" type="button" class="btn">Купить</button>
              <p>В наличии</p>
            </div>
            <hr style="margin-top: 1rem">
          </div>

        </div>

      </div>
    </div>
  </div>
</template>
<script>
import {mapGetters} from 'vuex'

  export default{
    data(){
      return{
        // pharma: [
        //   {
        //     image: "https://cdn.eapteka.ru/upload/offer_photo/506/595/resized/230_230_1_4e2ef13a598501cc12ce986daa699d62.jpeg?_cvc=1622209430",
        //     name: 'ВитаФерр (VitaFerr) капсулы, 30 шт',
        //     price:'419',
        //     article:'123456',
        //   },
        //   {
        //     image: "https://cdn.eapteka.ru/upload/offer_photo/326/704/resized/230_230_1_9f65988def262d75e21c8c0c8adfcff7.jpeg?_cvc=1622209430",
        //     name: 'Нурофен Экспресс капсулы 200 мг, 24 шт',
        //     price:'335',
        //     article:'123457',
        //   },
        //   {
        //     image: "https://cdn.eapteka.ru/upload/offer_photo/999/55/resized/230_230_1_6d483b0739b1eafa7dc9961622946611.jpeg?_cvc=1622209430",
        //     name: 'Мелаксен, таблетки 3 мг, 24 шт.',
        //     price:'579',
        //     article:'123458',
        //   },
        //   {
        //     image: "https://cdn.eapteka.ru/upload/offer_photo/110/665/resized/230_230_1_847d997d752e07bd210c5498ec7900b6.jpeg?_cvc=1622209430",
        //     name: 'Спазмалгон, таблетки 20 шт.',
        //     price:'159',
        //     article:'123459',
        //   },
        //   {
        //     image: "https://cdn.eapteka.ru/upload/offer_photo/288/221/resized/230_230_1.jpeg?_cvc=1622209430",
        //     name: 'Фенистил Гель от зуда и раздражения кожи, 0,1%, 100 г',
        //     price:'709',
        //     article:'123460',
        //   },
        // ],
      }
    },
    computed:{
      ...mapGetters([
        'PHARMA'
      ]),
    },
    methods: {
      buttonToCart(){
        // localStorage.setItem('pharmName', this.pharmName);
        // localStorage.setItem('pharmArticle', this.pharmArticle);
        // localStorage.setItem('pharmPrice', this.pharmPrice);
        // console.log(this.pharmName)
      }
    },
  }
</script>
<style>
.gridOnPharm{
  display: grid;
  grid-template-columns: 1fr 3fr;
}
</style>
