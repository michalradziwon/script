
  package gen;
  public class A_Gen174 {
  		@com.google.inject.Inject
  		public A_Gen174(A_Gen175 a_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  