
  package gen;
  public class A_Gen162 {
  		@com.google.inject.Inject
  		public A_Gen162(A_Gen163 a_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  