
  package gen;
  public class R_Gen199 {
  		@com.google.inject.Inject
  		public R_Gen199(R_Gen200 r_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  