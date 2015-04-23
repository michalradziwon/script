
  package gen;
  public class R_Gen105 {
  		@com.google.inject.Inject
  		public R_Gen105(R_Gen106 r_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  