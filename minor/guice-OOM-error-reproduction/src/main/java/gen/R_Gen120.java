
  package gen;
  public class R_Gen120 {
  		@com.google.inject.Inject
  		public R_Gen120(R_Gen121 r_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  