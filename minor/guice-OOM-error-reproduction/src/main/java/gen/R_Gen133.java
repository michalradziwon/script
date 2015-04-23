
  package gen;
  public class R_Gen133 {
  		@com.google.inject.Inject
  		public R_Gen133(R_Gen134 r_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  