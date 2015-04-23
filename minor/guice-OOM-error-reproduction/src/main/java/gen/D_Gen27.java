
  package gen;
  public class D_Gen27 {
  		@com.google.inject.Inject
  		public D_Gen27(D_Gen28 d_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  