import { useQuery } from "@tanstack/react-query";
import axios from "axios";

// URL back-end
const API_URL = 'http://localhost:8080';

// Utiliza o axios para a requisição no end-point do back-end da aplicação
const fetchData = async () => {
  const response = await axios.get(API_URL + '/food');
  return response;
};

// Função de configuração do react-query
export function useFoodData() {
  const query = useQuery({
    queryFn: fetchData,
    queryKey: ['food-data'],
    retry: 2,
  });

  return {
    ...query,
    data: query.data?.data,
  };
}