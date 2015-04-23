
  package gen;
  public class R_Gen195 {
  		@com.google.inject.Inject
  		public R_Gen195(R_Gen196 r_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  