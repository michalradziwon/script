
  package gen;
  public class D_Gen130 {
  		@com.google.inject.Inject
  		public D_Gen130(D_Gen131 d_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  