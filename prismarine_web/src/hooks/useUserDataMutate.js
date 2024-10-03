import { useMutation, useQueryClient } from "@tanstack/react-query";
import axios from "axios";

// URL back-end
const API_URL = 'http://localhost:8080';

// Utiliza o axios para a requisição no end-point do back-end da aplicação
const postData = async (UserData) => {
    const response = await axios.post(API_URL + '/user', UserData);
    return response.data;
};

// Função de configuração do react-query
export function useUserDataMutate() {
    // Obtém o query client
    const queryClient = useQueryClient();

    const query = useMutation({
        mutationFn: postData,
        retry: 2,
        onSuccess: () => {
            queryClient.invalidateQueries(['user-data'])
        }

    })

    return query.mutate;
}