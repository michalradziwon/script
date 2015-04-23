
  package gen;
  public class A_Gen183 {
  		@com.google.inject.Inject
  		public A_Gen183(A_Gen184 a_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  