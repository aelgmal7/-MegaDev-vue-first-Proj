
export default {
  addPostMutations: (state, { post, spec }) => {
    state[spec].push(post)
  },
  removePostMutation: (state, { post, index }) => {
    state.sportsNews.splice(index, 1)
    console.log('mutaion')
  }
}
