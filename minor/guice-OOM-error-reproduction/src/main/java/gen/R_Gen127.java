
  package gen;
  public class R_Gen127 {
  		@com.google.inject.Inject
  		public R_Gen127(R_Gen128 r_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  