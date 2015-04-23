
  package gen;
  public class A_Gen173 {
  		@com.google.inject.Inject
  		public A_Gen173(A_Gen174 a_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  