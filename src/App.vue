<template>
  <v-app>
    <!-- App bar-->
    <bar/>

    <!-- Search Bar -->
    <Transition>
      <search v-if="this.$store.state.searchState === true"/>
    </Transition>

    <!-- Condition bar -->
    <transition>
      <div v-if="this.$store.state.docState === 'default'" class="btn-margin">
        <default-menu />
      </div>
      <div v-if="this.$store.state.docState === 'login'" class="btn-margin">
        <login />
      </div>
      <div v-if="this.$store.state.docState === 'singin'" class="btn-margin">
        <JoinMember />
      </div>
      <div v-if="this.$store.state.docState === 'logined'" class="btn-margin">
        <Logined />
      </div>
      <div v-if="this.$store.state.docState === 'add'" class="btn-margin">
        <AddThread/>
      </div>
    </transition>

    <!-- My Threads -->
    <MyThreads />

    <!-- All Threads -->
    <AllThreads />


    <!-- FOOTER -->
      <v-footer padless>
        <v-col
                class="text-center"
                cols="12"
        >
          {{ new Date().getFullYear() }} — <strong>Seungup Noh</strong>
        </v-col>
      </v-footer>
  </v-app>
</template>

<script>
  import Login from "./components/Login";
  import DefaultMenu from "./components/DefaultMenu";
  import Search from "./components/Search";
  import Bar from "./components/Bar";
  import JoinMember from "./components/JoinMember";
  import Logined from "./components/Logined";
  import AddThread from "./components/AddThread";
  import MyThreads from "./components/MyThreads";
  import AllThreads from "./components/AllThreads";

export default {
  name: 'App',
  components: {
    AllThreads,
    MyThreads,
    AddThread,
    Logined,
    JoinMember,
    Bar,
    Search,
    DefaultMenu,
    Login
  },
  data: () => ({
    docState: 'default'
  }),


};
</script>

<style>
  .btn-margin{
    margin-right: auto;
    margin-left: auto;
  }
</style>