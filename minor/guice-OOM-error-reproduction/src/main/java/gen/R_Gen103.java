
  package gen;
  public class R_Gen103 {
  		@com.google.inject.Inject
  		public R_Gen103(R_Gen104 r_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  