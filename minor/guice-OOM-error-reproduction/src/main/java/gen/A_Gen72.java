
  package gen;
  public class A_Gen72 {
  		@com.google.inject.Inject
  		public A_Gen72(A_Gen73 a_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  