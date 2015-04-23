
  package gen;
  public class R_Gen177 {
  		@com.google.inject.Inject
  		public R_Gen177(R_Gen178 r_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  