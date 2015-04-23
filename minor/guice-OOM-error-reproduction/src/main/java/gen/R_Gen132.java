
  package gen;
  public class R_Gen132 {
  		@com.google.inject.Inject
  		public R_Gen132(R_Gen133 r_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  