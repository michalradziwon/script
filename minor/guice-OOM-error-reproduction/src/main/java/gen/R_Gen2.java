
  package gen;
  public class R_Gen2 {
  		@com.google.inject.Inject
  		public R_Gen2(R_Gen3 r_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  