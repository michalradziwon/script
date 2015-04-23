
  package gen;
  public class R_Gen76 {
  		@com.google.inject.Inject
  		public R_Gen76(R_Gen77 r_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  