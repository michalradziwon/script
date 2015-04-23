
  package gen;
  public class D_Gen187 {
  		@com.google.inject.Inject
  		public D_Gen187(D_Gen188 d_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  