
  package gen;
  public class R_Gen128 {
  		@com.google.inject.Inject
  		public R_Gen128(R_Gen129 r_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  