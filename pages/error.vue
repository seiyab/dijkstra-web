<template>
  <div class="container">
    <div class="alert alert-warning" role="alert">
      <h4 class="alert-heading">エラーが発生しました</h4>
      <p>エラーが発生しました。<a href="/">トップに戻る</a></p>
    </div>
  </div>
</template>

<script>
export default {
  props: ['error']
}
</script>

