
  package gen;
  public class D_Gen169 {
  		@com.google.inject.Inject
  		public D_Gen169(D_Gen170 d_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  