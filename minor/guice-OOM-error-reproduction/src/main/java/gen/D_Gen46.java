
  package gen;
  public class D_Gen46 {
  		@com.google.inject.Inject
  		public D_Gen46(D_Gen47 d_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  