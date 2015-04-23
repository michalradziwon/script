
  package gen;
  public class A_Gen4 {
  		@com.google.inject.Inject
  		public A_Gen4(A_Gen5 a_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  