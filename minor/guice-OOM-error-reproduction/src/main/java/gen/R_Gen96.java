
  package gen;
  public class R_Gen96 {
  		@com.google.inject.Inject
  		public R_Gen96(R_Gen97 r_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  