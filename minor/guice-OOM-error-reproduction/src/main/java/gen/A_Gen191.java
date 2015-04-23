
  package gen;
  public class A_Gen191 {
  		@com.google.inject.Inject
  		public A_Gen191(A_Gen192 a_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  