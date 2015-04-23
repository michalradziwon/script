
  package gen;
  public class A_Gen136 {
  		@com.google.inject.Inject
  		public A_Gen136(A_Gen137 a_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  