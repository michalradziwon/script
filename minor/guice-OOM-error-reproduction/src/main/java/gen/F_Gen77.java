
  package gen;
  public class F_Gen77 {
  		@com.google.inject.Inject
  		public F_Gen77(F_Gen78 f_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  