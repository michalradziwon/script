
  package gen;
  public class D_Gen109 {
  		@com.google.inject.Inject
  		public D_Gen109(D_Gen110 d_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  