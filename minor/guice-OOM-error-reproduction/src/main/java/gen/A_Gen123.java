
  package gen;
  public class A_Gen123 {
  		@com.google.inject.Inject
  		public A_Gen123(A_Gen124 a_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  