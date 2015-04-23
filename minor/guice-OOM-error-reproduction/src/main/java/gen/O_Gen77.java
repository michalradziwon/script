
  package gen;
  public class O_Gen77 {
  		@com.google.inject.Inject
  		public O_Gen77(O_Gen78 o_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  