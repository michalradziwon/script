
  package gen;
  public class D_Gen110 {
  		@com.google.inject.Inject
  		public D_Gen110(D_Gen111 d_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  