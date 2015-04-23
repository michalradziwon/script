
  package gen;
  public class A_Gen156 {
  		@com.google.inject.Inject
  		public A_Gen156(A_Gen157 a_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  