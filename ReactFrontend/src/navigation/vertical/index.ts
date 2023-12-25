// ** Icon imports

import HomeOutline from 'mdi-material-ui/HomeOutline'
import AccountCogOutline from 'mdi-material-ui/AccountCogOutline'
import {Storefront} from "mdi-material-ui";
import TrendingUp from "mdi-material-ui/TrendingUp";
// ** Type import
import { VerticalNavItemsType } from 'src/@core/layouts/types'




const navigation = (): VerticalNavItemsType => {
  return [
    {
      title: 'Главная',
      icon: HomeOutline,
      path: '/'
    },
    {
      title:'Мои магазины',
      icon: Storefront,
      path :'/shops'
    },
    {
      title: 'Аналитика',
      icon: TrendingUp,
      path: '/analytics'
    },
    {
      title: 'Настройки аккаунта',
      icon: AccountCogOutline,
      path: '/account-settings'
    }
  ]
}

export default navigation
