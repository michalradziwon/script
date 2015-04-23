
  package gen;
  public class A_Gen33 {
  		@com.google.inject.Inject
  		public A_Gen33(A_Gen34 a_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  