
  package gen;
  public class R_Gen80 {
  		@com.google.inject.Inject
  		public R_Gen80(R_Gen81 r_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  