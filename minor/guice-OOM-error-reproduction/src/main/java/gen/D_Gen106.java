
  package gen;
  public class D_Gen106 {
  		@com.google.inject.Inject
  		public D_Gen106(D_Gen107 d_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  