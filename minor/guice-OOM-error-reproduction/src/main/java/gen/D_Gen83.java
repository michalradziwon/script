
  package gen;
  public class D_Gen83 {
  		@com.google.inject.Inject
  		public D_Gen83(D_Gen84 d_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  