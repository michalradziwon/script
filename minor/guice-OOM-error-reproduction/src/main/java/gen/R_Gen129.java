
  package gen;
  public class R_Gen129 {
  		@com.google.inject.Inject
  		public R_Gen129(R_Gen130 r_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  