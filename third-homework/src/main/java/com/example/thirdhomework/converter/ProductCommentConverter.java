package com.example.thirdhomework.converter;

import com.example.thirdhomework.dto.ProductCommentDTO;
import com.example.thirdhomework.entity.ProductComment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductCommentConverter {

    ProductCommentConverter INSTANCE = Mappers.getMapper(ProductCommentConverter.class);

    List<ProductCommentDTO> convertProductCommentsToProductCommentDTOs(List<ProductComment> productComments);

    ProductComment convertProductCommentDTOToProductComment(ProductCommentDTO productCommentDTO);

    ProductCommentDTO convertProductCommentToProductCommentDTO(ProductComment productComment);

}
