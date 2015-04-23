
  package gen;
  public class D_Gen74 {
  		@com.google.inject.Inject
  		public D_Gen74(D_Gen75 d_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  