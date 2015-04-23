
  package gen;
  public class A_Gen137 {
  		@com.google.inject.Inject
  		public A_Gen137(A_Gen138 a_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  