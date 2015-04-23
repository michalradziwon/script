
  package gen;
  public class A_Gen92 {
  		@com.google.inject.Inject
  		public A_Gen92(A_Gen93 a_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  