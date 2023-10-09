<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;
use Illuminate\Support\Facades\Auth;

class BookingRequest extends FormRequest
{
    /**
     * Determine if the user is authorized to make this request.
     */
    public function authorize(): bool
    {
        return Auth::check();
    }

    /**
     * Get the validation rules that apply to the request.
     *
     * @return array<string, \Illuminate\Contracts\Validation\ValidationRule|array|string>
     */
    public function rules(): array
    {
        return [
            'name' => 'required|string|max:255',
            'start_date' => 'required|date',
            'end_date' => 'required|date',
            'address' => 'required|string',
            'city' => 'required|string',
            'zip' => 'required|numeric',
            'status' => 'required|string',
            'payment_method' => 'required|string|default:midtrans',
            'payment_status' => 'required|string|in:SUCCESS,PENDING,CANCELLED',
            'payment_url' => 'nullable|string',
            'total_price' => 'required|numeric',
            'items_id' => 'required|integer|exists:items,id',
            'users_id' => 'required|integer|exists:users,id',
        ];
    }
}
