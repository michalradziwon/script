
  package gen;
  public class D_Gen138 {
  		@com.google.inject.Inject
  		public D_Gen138(D_Gen139 d_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  