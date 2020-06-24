import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    docState: 'default',
    searchState : true,
    searchKeyword : null
  },
  mutations: {
    setDocState (state, stateValue) {
      state.docState = stateValue
    },
    chageSearchState(state) {
      if (state.searchState === true){
        state.searchState = false
      } else {
        state.searchState = true
      }
    },
    setSearchKeyword(state, searchKeyword) {
      state.searchKeyword = searchKeyword
    },
    setSearchKeywordNull(state) {
      state.searchKeyword = null
    }
  },
  actions: {
  },
  modules: {
  }
})
