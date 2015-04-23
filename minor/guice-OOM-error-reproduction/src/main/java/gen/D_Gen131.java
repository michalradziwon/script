
  package gen;
  public class D_Gen131 {
  		@com.google.inject.Inject
  		public D_Gen131(D_Gen132 d_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  