
  package gen;
  public class R_Gen198 {
  		@com.google.inject.Inject
  		public R_Gen198(R_Gen199 r_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  