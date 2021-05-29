<template>
  <div style="margin-left: 5rem; margin-right: 5rem; margin-top: 2rem">
    <div>
      <h2 style="color: #333F48">Товары дня</h2>
    </div>
    <div class="cardsProduct" style="margin-top: 1rem">
      <div class="cardProduct" style="width: 190px">
        <img src="../assets/vitaferr-600x600.jpg" alt="" style="height:200px ;width: 170px">
        <p>ВитаФерр (VitaFerr) капсулы, 30 шт.</p>
        <strong>419 руб.</strong>
      </div>
      <div class="cardProduct" style="width: 190px; margin-left: 1.5rem">
        <img src="../assets/123.png" alt="" style="height:200px ;width: 170px">
        <p>Нурофен Экспресс капсулы 200 мг, 24 шт.</p>
        <strong>335 руб.</strong>
      </div>
      <div class="cardProduct" style="width: 190px; margin-left: 1.5rem">
        <img src="../assets/mec.jpeg" alt="" style="height:200px ;width: 170px">
        <p>Мелаксен, таблетки 3 мг, 24 шт.</p>
        <strong>579 руб.</strong>
      </div>
      <div class="cardProduct" style="width: 190px; margin-left: 1.5rem">
        <img src="../assets/cpazm.jpg" alt="" style="height:200px ;width: 170px">
        <p>Спазмалгон, таблетки 20 шт.</p>
        <strong>159 руб.</strong>
      </div>
      <div class="cardProduct" style="width: 190px; margin-left: 1.5rem">
        <img src="../assets/fenest.jpg" alt="" style="height:200px ;width: 170px">
        <p>Фенистил Гель от зуда и раздражения кожи, 0,1%, 100 г</p>
        <strong>709 руб.</strong>
      </div>
    </div>

    <div style="margin-top: 4rem">
      <div class="card">
        <div class="card-body">
          <h2 style="color: #333F48">Здоровье</h2>
          <div class="row">
            <div class="col-2">
              <div>Диабет</div>
              <div>Избыточный вес</div>
              <div>Аллергия</div>
              <div>Аптечка</div>
              <div>Потенция</div>
            </div>
            <div class="col-2">
              <div>Гайморит</div>
              <div>Болезни суставов</div>
              <div>Цистит</div>
              <div>Все для здоровья</div>
            </div>
            <div class="col-4">
              <div class="row">
                <div class="col-sm">
                  <img src="../assets/123.png" alt="" style="height:100px ;width: 110px">
                </div>
                <div class="col-sm">
                  <p>Нурофен Экспресс капсулы 200 мг, 24 шт.</p>
                  <strong>335 руб.</strong>
                </div>
              </div>
            </div>
            <div class="col-4">
              <div class="row">
                <div class="col-sm" style="">
                  <img src="../assets/cpazm.jpg" alt="" style="height:100px ;width: 110px;">
                </div>
                <div class="col-sm">
                  <p>Спазмалгон, таблетки 20 шт.</p>
                  <strong>159 руб.</strong>
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

</script>
<style>
.cardProduct{
  display: flex;
  flex-direction: column;
}
.cardsProduct div{
  display:inline-block;
}
</style>
