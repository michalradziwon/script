
  package gen;
  public class R_Gen1 {
  		@com.google.inject.Inject
  		public R_Gen1(R_Gen2 r_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  