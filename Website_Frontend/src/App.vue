<template>
  <div id="app" class="container">
      <div class="nav" style="margin-left: 5rem; margin-right: 5rem; margin-top: 2rem">
        <div class="inlineLogo">
          <router-link :to="{name: 'main'}">
            <img src="./assets/sber-eapteka-logo.svg" alt="DT EAPTEKA">
          </router-link>
        </div>

        <div style="margin-left: 28rem">
          <div>
            <strong>
              8 495 730 53 00
            </strong>
          </div>
          <div>
            круглотусочно
          </div>
        </div>

        <div style="margin-left: 1rem">
          <div>
            <strong>
              8 495 663 73 69
            </strong>
          </div>
          <div>
            Для организаций с 9 до 21
          </div>
        </div>

        <div style="margin-left: 1rem">
          <router-link :to="{name: 'basket'}">
            <button style="background-color: #8068F0; color: #ffffff; border-radius: 30px; height:50px; width:150px" type="button" class="btn">Корзина</button>
          </router-link>
        </div>

      </div>

      <div style="margin-left: 5rem; margin-right: 5rem; margin-top: 2rem">
        <div class="input-group" style="height: 41px;">
          <div class="input-group-prepend">
            <span class="input-group-text" style="border-radius: 25px 0px 0px 25px; background-color: #ffffff; border-color: #FF8000"><img alt="search" src="./assets/search.svg"></span>
          </div>
          <input type="text" class="form-control" style="border-color: #FF8000" placeholder="По названию или веществу среди 50 000 лекарств">
          <div class="input-group-append">
            <button class="btn btn-outline-secondary" type="button" id="button-addon2" style="border-radius: 0px 25px 25px 0px; border-color: #FF8000; background-color: #FF8000; color: #ffffff; height: 41px; width: 130px">Найти</button>
          </div>
        </div>
      </div>

      <div class="apname" style="margin-left: 5rem; margin-right: 5rem; margin-top: 1.5rem">
        <div style="font-size: 17px; color: #3A5976">
          <router-link :to="{name: 'pharm'}">
            <strong>
              ЛЕКАРСТВА
            </strong>
          </router-link>
        </div>
        <div style="margin-left: 1.5rem; font-size: 17px; color: #333F48">
          <strong>
            ВИТАМИНЫ И БАД
          </strong>
        </div>
        <div style="margin-left: 1.5rem; font-size: 17px; color: #333F48">
          <strong>
            КРАСОТА
          </strong>
        </div>
        <div style="margin-left: 1.5rem; font-size: 17px; color: #333F48">
          <strong>
            ГИГИЕНА
          </strong>
        </div>
        <div style="margin-left: 1.5rem; font-size: 17px; color: #333F48">
          <strong>
            ЛИНЗЫ
          </strong>
        </div>
        <div style="margin-left: 1.5rem; font-size: 17px; color: #333F48">
          <strong>
            МАТЬ И ДИТЯ
          </strong>
        </div>
        <div style="margin-left: 1.5rem; font-size: 17px; color: #333F48">
          <strong>
            МЕДТОВАРЫ
          </strong>
        </div>
        <div style="margin-left: 1.5rem; font-size: 17px; color: #333F48">
          <strong>
            ЗООТОВАРЫ
          </strong>
        </div>
        <div style="margin-left: 1.5rem; font-size: 17px; color: #333F48">
          <strong>
            МЕДТЕХНИКА
          </strong>
        </div>
      </div>

      <div class="aptname" style="margin-left: 5rem; margin-right: 5rem; margin-top: 1rem">
        <div>
          <button style="background-color: #8068F0; color: #ffffff; border-radius: 15px; height: 35px" type="button" class="btn"><p>Акции</p></button>
        </div>
        <div style="margin-left: 1rem">
          <button style="background-color: #FF3399; color: #ffffff; border-radius: 15px; height: 35px" type="button" class="btn"><p style="">Скидки</p></button>
        </div>
        <div style="margin-left: 1rem">
          <button style="background-color: #ffffff; color: #3A5976; border-radius: 15px; height: 35px" type="button" class="btn"><p style="">Аллергия</p></button>
        </div>
        <div style="margin-left: 1rem">
          <button style="background-color: #ffffff; color: #3A5976; border-radius: 15px; height: 35px" type="button" class="btn"><p style="">Кишечник</p></button>
        </div>
        <div style="margin-left: 1rem">
          <button style="background-color: #ffffff; color: #3A5976; border-radius: 15px; height: 35px" type="button" class="btn"><p style="">Лечебная косметика</p></button>
        </div>
        <div style="margin-left: 1rem">
          <button style="background-color: #ffffff; color: #3A5976; border-radius: 15px; height: 35px" type="button" class="btn"><p style="">Пищеварительная система</p></button>
        </div>
        <div style="margin-left: 1rem">
          <button style="background-color: #ffffff; color: #3A5976; border-radius: 15px; height: 35px" type="button" class="btn"><p style="">Молочница</p></button>
        </div>
        <div style="margin-left: 1rem">
          <button style="background-color: #ffffff; color: #3A5976; border-radius: 15px; height: 35px" type="button" class="btn"><p style="">Ещё 54</p></button>
        </div>
      </div>

      <div class="mainBox">
        <router-view></router-view>
      </div>
  </div>
</template>

<script>
export default {

}
</script>

<style>
#app{
  display: grid;
}
.apname div{
  display:inline-block;
}
.aptname div{
  display:inline-block;
}
</style>
