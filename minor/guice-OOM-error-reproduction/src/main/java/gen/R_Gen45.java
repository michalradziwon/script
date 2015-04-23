
  package gen;
  public class R_Gen45 {
  		@com.google.inject.Inject
  		public R_Gen45(R_Gen46 r_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  