
  package gen;
  public class D_Gen132 {
  		@com.google.inject.Inject
  		public D_Gen132(D_Gen133 d_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  