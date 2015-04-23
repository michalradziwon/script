
  package gen;
  public class D_Gen78 {
  		@com.google.inject.Inject
  		public D_Gen78(D_Gen79 d_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  