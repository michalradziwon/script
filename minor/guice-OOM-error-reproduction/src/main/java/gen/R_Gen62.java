
  package gen;
  public class R_Gen62 {
  		@com.google.inject.Inject
  		public R_Gen62(R_Gen63 r_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  