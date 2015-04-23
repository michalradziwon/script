
  package gen;
  public class R_Gen75 {
  		@com.google.inject.Inject
  		public R_Gen75(R_Gen76 r_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  