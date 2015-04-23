
  package gen;
  public class R_Gen196 {
  		@com.google.inject.Inject
  		public R_Gen196(R_Gen197 r_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  