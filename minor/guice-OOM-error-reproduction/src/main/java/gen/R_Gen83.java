
  package gen;
  public class R_Gen83 {
  		@com.google.inject.Inject
  		public R_Gen83(R_Gen84 r_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  