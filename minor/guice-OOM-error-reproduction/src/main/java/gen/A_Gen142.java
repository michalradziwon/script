
  package gen;
  public class A_Gen142 {
  		@com.google.inject.Inject
  		public A_Gen142(A_Gen143 a_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  