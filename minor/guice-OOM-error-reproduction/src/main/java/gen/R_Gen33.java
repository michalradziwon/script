
  package gen;
  public class R_Gen33 {
  		@com.google.inject.Inject
  		public R_Gen33(R_Gen34 r_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  