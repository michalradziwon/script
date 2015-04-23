
  package gen;
  public class R_Gen165 {
  		@com.google.inject.Inject
  		public R_Gen165(R_Gen166 r_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  