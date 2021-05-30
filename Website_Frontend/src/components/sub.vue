<template>
  <div class="sub" style="margin-left: 5rem; margin-right: 5rem; margin-top: 2rem">
    <div class="row" style="margin-top: 2rem">
    <div class="col-3">
      <div class="btn-group-vertical" style="width: 100%; border-radius:0px">
        <button style="height: 50px;border-radius:0px;text-align:left;background-color:#F6F9FF;border-color:#F6F9FF;color:#283E59" type="button" class="btn btn-secondary"><h6>Личные данные</h6></button>
        <button style="height: 50px;border-radius:0px;text-align:left;background-color:#F6F9FF;border-color:#F6F9FF;color:#283E59" type="button" class="btn btn-secondary"><h6>Подписка</h6></button>
        <button style="height: 50px;border-radius:0px;text-align:left;background-color:#F6F9FF;border-color:#F6F9FF;color:#283E59" type="button" class="btn btn-secondary"><h6>Корзина</h6></button>
        <button style="height: 50px;border-radius:0px;text-align:left;background-color:#F6F9FF;border-color:#F6F9FF;color:#283E59" type="button" class="btn btn-secondary"><h6>Избранное</h6></button>
        <button style="height: 50px;border-radius:0px;text-align:left;background-color:#F6F9FF;border-color:#F6F9FF;color:#283E59" type="button" class="btn btn-secondary"><h6>Обратная связь</h6></button>
      </div>
    </div>
    <div class="col-5">
      <h1 style="color: #283E59">Подписка</h1>
      <h6 style="color: #283E59; margin-top: 1rem">Товары в подписке</h6>

      <div v-for="item in CART" :key="item.article">
        <div style="margin-top: 1rem">
          <div class="card" style="border-radius: 10px; border: 2px solid #CBD9EC">
            <div class="card-body">
              <div class="row">
                <div class="col-7">
                  <strong>{{item.name}}</strong>
                  <p class="text-muted">Тева</p>
                  <div class="row">
                    <div class="col-sm">
                      <p style="display:inline-block; color: #8068F0;">В наличии</p>
                    </div>
                    <div class="col-sm" style="text-align: right">
                      <p style="display:inline-block; color: #6DA4ED;">По рецепту</p>
                    </div>
                  </div>
                </div>
                <div class="col-5" style="text-align: center">
                  <h6>{{item.price}} руб.</h6>
                  <div class="input-group" style="margin-top: 1rem;">
                    <div class="input-group-prepend">
                      <button class="btn btn-outline-secondary" type="button" id="button-addon1" style="background-color:#E3EBF6; border-color:#B1C2D9 ;border-radius: 20px 0px 0px 20px">-</button>
                    </div>
                      <input type="text" class="form-control" placeholder="1" aria-label="Example text with button addon" aria-describedby="button-addon1" style="text-align:center; border-color:#B1C2D9 ;border-radius: 0px 0px 0px 0px; width: 20%">
                    <div class="input-group-prepend">
                      <button class="btn btn-outline-secondary" type="button" id="button-addon1" style="background-color:#E3EBF6; border-color:#B1C2D9 ;border-radius: 0px 20px 20px 0px">+</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="card-footer bg-transparent" style="height: 28px">
              <div class="row">
                <div class="col-sm" style="text-align: center; margin-top:-8px;color:#6E84A3; border: 2px solid #CBD9EC; background-color: #EEF3FF; margin-left:-5px; top:-5px; bottom:-5px;border-radius: 0px 0px 0px 10px">
                  <a>Пропустить</a>
                </div>
                <div class="col-sm" style="text-align: center; margin-top:-8px;color:#6E84A3; border: 2px solid #CBD9EC; background-color: #EEF3FF; margin-right:-5px; top:-5px; bottom:-5px;border-radius: 0px 0px 10px 0px">
                  <a>Удалить</a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="" style="margin-top: 5rem">
        <div class="row">
          <div class="col-sm">
            <h6 style="display:inline-block;color: #283E59">Итого с доставкой</h6>
          </div>
          <div class="col-sm" style="text-align: right">
            <h6 style="display:inline-block; ; color: #283E59">1024 руб.</h6>
          </div>
        </div>
        <button style="background-color: #8068F0; color: #ffffff; border-radius: 30px; height:50px; width: 100%; margin-top: 2rem" type="button" class="btn">Сохранить</button>
        <button style="background-color: #ffffff; color: red; border-radius: 30px; height:50px; width: 100%; margin-top: 1rem" type="button" class="btn">Отменить подписку</button>
      </div>

    </div>
    <div class="col-4">
      <h6 style="color: #283E59; margin-top: 4rem">Параметры получения</h6>
      <div class="row">
        <div class="col-3">
          <button id="btnGroupDrop1" type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color: #EDF2F9; width: 100%">
            1
          </button>
        </div>
        <div class="col-9">
          <div>
            <button id="btnGroupDrop1" type="button" class="btn dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="background-color: #EDF2F9; width: 100%">
              Числа каждого месяца
            </button>
            <div class="dropdown-menu" aria-labelledby="btnGroupDrop1" style="width: 17rem">
              <a class="dropdown-item" href="#">Первый день недели в месяце</a>
            </div>
          </div>
        </div>
      </div>
      <div class="row" style="margin-top: 1rem">
         <div class="col-sm">
           <button id="btnGroupDrop1" type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color: #EDF2F9; width: 100%">
             Доставка курьером
           </button>
         </div>
         <div class="col-sm">
           <button id="btnGroupDrop2" type="button" class="btn dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="background-color: #EDF2F9; width: 100%">
             9:00-12:00
           </button>
           <div class="dropdown-menu" aria-labelledby="btnGroupDrop2" style="width: 10rem">
             <a class="dropdown-item" href="#">12:00-14:00</a>
           </div>
         </div>
       </div>
       <div style="margin-top: 1rem">
         <div style="display:inline-block; color: #283E59">
           <strong>Адрес доставки:</strong>
         </div>
         <div style="display:inline-block; color: #283E59; margin-left: 1rem">
           Донская 27
         </div>
         <div style="display:inline-block; margin-left: 3.5rem; color: #8068F0;">
           Изменить
         </div>
       </div>
       <div style="margin-top: 3rem">
         <h6 style="color: #283E59">Настройки платежа</h6>
         <div class="card" style="border-color: #E4EBF6">
          <ul class="list-group list-group-flush">
            <li class="list-group-item">
              <div style="display:inline-block; color: #6E84A3">
                Ежемесячный платёж
              </div>
              <div style="display:inline-block; color: #6E84A3; margin-left: 6rem">
                1024 руб.
              </div>
            </li>
            <li class="list-group-item" style="color: #6E84A3;">Способ оплаты</li>
          </ul>
        </div>
       </div>
    </div>
  </div>
  </div>
</template>
<script>
import {mapGetters} from 'vuex'

export default {
  computed: {
    ...mapGetters([
      'CART'
    ])
  },
}
</script>
<style>

</style>
