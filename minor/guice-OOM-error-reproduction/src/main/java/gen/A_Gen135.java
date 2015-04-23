
  package gen;
  public class A_Gen135 {
  		@com.google.inject.Inject
  		public A_Gen135(A_Gen136 a_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  