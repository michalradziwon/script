
  package gen;
  public class D_Gen76 {
  		@com.google.inject.Inject
  		public D_Gen76(D_Gen77 d_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  