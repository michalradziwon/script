
  package gen;
  public class A_Gen101 {
  		@com.google.inject.Inject
  		public A_Gen101(A_Gen102 a_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  