
  package gen;
  public class A_Gen5 {
  		@com.google.inject.Inject
  		public A_Gen5(A_Gen6 a_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  