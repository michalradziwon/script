
  package gen;
  public class D_Gen122 {
  		@com.google.inject.Inject
  		public D_Gen122(D_Gen123 d_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  