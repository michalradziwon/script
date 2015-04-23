
  package gen;
  public class R_Gen71 {
  		@com.google.inject.Inject
  		public R_Gen71(R_Gen72 r_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  