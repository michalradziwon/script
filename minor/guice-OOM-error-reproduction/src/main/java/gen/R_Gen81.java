
  package gen;
  public class R_Gen81 {
  		@com.google.inject.Inject
  		public R_Gen81(R_Gen82 r_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  