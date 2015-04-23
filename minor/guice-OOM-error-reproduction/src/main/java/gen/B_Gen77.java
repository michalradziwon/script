
  package gen;
  public class B_Gen77 {
  		@com.google.inject.Inject
  		public B_Gen77(B_Gen78 b_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  