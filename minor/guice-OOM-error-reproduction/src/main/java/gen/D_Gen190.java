
  package gen;
  public class D_Gen190 {
  		@com.google.inject.Inject
  		public D_Gen190(D_Gen191 d_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  