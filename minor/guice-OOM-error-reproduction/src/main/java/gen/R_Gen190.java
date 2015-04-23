
  package gen;
  public class R_Gen190 {
  		@com.google.inject.Inject
  		public R_Gen190(R_Gen191 r_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  