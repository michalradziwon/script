
  package gen;
  public class A_Gen121 {
  		@com.google.inject.Inject
  		public A_Gen121(A_Gen122 a_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  