
  package gen;
  public class I_Gen110 {
  		@com.google.inject.Inject
  		public I_Gen110(I_Gen111 i_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  