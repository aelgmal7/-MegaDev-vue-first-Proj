<template>
  <div>
    <h1>{{post.title}}</h1>
    <p>{{post.description}}</p>
    <ul v-for="(comment,i) in post.comments" :key="i">
      <li>{{comment}}</li>
    </ul>
  </div>
</template>

<script>
import { mapState } from 'vuex'
export default {
  name: 'Post',
  data () {
    return {
      post: {}
    }
  },
  computed: {
    ...mapState([
      'sportsNews',
      'entertainment'
    ])
  },
  mounted () {
    const post = this[this.$route.params.spec][this.$route.params.id]
    this.post = post
    console.log(this.$route.params)
  }

}
</script>
