
  package gen;
  public class B_Gen190 {
  		@com.google.inject.Inject
  		public B_Gen190(B_Gen191 b_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  