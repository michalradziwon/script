
  package gen;
  public class A_Gen113 {
  		@com.google.inject.Inject
  		public A_Gen113(A_Gen114 a_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  