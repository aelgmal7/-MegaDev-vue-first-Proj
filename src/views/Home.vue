<template>
  <div class="home">
    <!-- represent 2 components sports& entertainment -->
    <sports/>
    <hr>
    <entertainment/>
  </div>
</template>

<script>
// eslint-disable-next-line no-unused-vars
import sports from '@/components/sports'
import entertainment from '@/components/entertainment'

export default {
  name: 'Home',
  components: {
    // import components
    sports,
    entertainment
  },
  data () {
    return {
      sportsShow: true
    }
  }
}
</script>
