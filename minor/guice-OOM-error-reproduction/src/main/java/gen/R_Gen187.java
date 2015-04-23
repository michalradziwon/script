
  package gen;
  public class R_Gen187 {
  		@com.google.inject.Inject
  		public R_Gen187(R_Gen188 r_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  