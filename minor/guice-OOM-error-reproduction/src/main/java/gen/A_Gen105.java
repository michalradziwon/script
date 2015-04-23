
  package gen;
  public class A_Gen105 {
  		@com.google.inject.Inject
  		public A_Gen105(A_Gen106 a_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  