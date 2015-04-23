
  package gen;
  public class D_Gen133 {
  		@com.google.inject.Inject
  		public D_Gen133(D_Gen134 d_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  