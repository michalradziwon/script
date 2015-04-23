
  package gen;
  public class R_Gen114 {
  		@com.google.inject.Inject
  		public R_Gen114(R_Gen115 r_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  