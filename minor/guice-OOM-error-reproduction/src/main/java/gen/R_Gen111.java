
  package gen;
  public class R_Gen111 {
  		@com.google.inject.Inject
  		public R_Gen111(R_Gen112 r_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  