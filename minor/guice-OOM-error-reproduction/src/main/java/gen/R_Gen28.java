
  package gen;
  public class R_Gen28 {
  		@com.google.inject.Inject
  		public R_Gen28(R_Gen29 r_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  