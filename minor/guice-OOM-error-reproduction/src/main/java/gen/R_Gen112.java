
  package gen;
  public class R_Gen112 {
  		@com.google.inject.Inject
  		public R_Gen112(R_Gen113 r_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  