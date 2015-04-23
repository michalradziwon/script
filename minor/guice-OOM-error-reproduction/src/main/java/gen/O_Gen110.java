
  package gen;
  public class O_Gen110 {
  		@com.google.inject.Inject
  		public O_Gen110(O_Gen111 o_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  