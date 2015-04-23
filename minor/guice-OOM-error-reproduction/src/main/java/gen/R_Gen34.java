
  package gen;
  public class R_Gen34 {
  		@com.google.inject.Inject
  		public R_Gen34(R_Gen35 r_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  